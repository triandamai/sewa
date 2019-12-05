package com.pmo.sewa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.pmo.sewa.helpers.LOG;
import com.pmo.sewa.pages.Error_page;
import com.pmo.sewa.pages.admin.admin_base_page;
import com.pmo.sewa.pages.penyedia.penyedia_base_page;
import com.pmo.sewa.pages.user.user_base_page;

public class MainActivity extends AppCompatActivity {
    private FirebaseUser firebaseUser;
    private FirebaseAuth firebaseAuth;
    private DatabaseReference databaseReference;
    private Context context = MainActivity.this;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firebaseAuth = FirebaseAuth.getInstance();
        firebaseUser = firebaseAuth.getCurrentUser();
        databaseReference = FirebaseDatabase.getInstance().getReference();
        if(firebaseUser != null){
            cekLevel();
        }else {}

    }

    public void cekLevel(){
        databaseReference.child("USER")
                .child(firebaseUser.getUid())
                .child("level")
                .addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()){
                    Log.d(LOG.TAG_SUCCESS,dataSnapshot.toString());
                    String level = dataSnapshot.getValue(String.class);

                    assert level != null;
                    if(level.equalsIgnoreCase("ADMIN")){
                        startActivity(new Intent(context, admin_base_page.class));
                        finish();
                    }else if(level.equalsIgnoreCase("USER")){
                        startActivity(new Intent(context, user_base_page.class));
                        finish();
                    }else if(level.equalsIgnoreCase("PENYEDIA")){
                        startActivity(new Intent(context, penyedia_base_page.class));
                        finish();
                    }else {
                        startActivity(new Intent(context, Error_page.class));
                        finish();
                    }
                }


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(context,"Kesalahan..",Toast.LENGTH_LONG).show();
                Log.d(LOG.TAG_ERROR,databaseError.getMessage());
                Log.d(LOG.TAG_ERROR,databaseError.getDetails());
            }
        });
    }
}
