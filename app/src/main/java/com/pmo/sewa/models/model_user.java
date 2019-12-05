package com.pmo.sewa.models;

public class model_user {
    public String IDUSER;
    public String Nama;
    public String Email;
    public String Nohp;
    public String Alamat;
    public String Level;
    public String TerakhirOnline;

    public model_user(){}

    public model_user(String IDUSER, String nama, String email, String nohp, String alamat, String level, String terakhirOnline) {
        this.IDUSER = IDUSER;
        this.Nama = nama;
        this.Email = email;
        this.Nohp = nohp;
        this.Alamat = alamat;
        this.Level = level;
        this.TerakhirOnline = terakhirOnline;
    }

    public String getIDUSER() {
        return IDUSER;
    }

    public void setIDUSER(String IDUSER) {
        this.IDUSER = IDUSER;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getNohp() {
        return Nohp;
    }

    public void setNohp(String nohp) {
        this.Nohp = nohp;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        this.Alamat = alamat;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        this.Level = level;
    }

    public String getTerakhirOnline() {
        return TerakhirOnline;
    }

    public void setTerakhirOnline(String terakhirOnline) {
        this.TerakhirOnline = terakhirOnline;
    }
}
