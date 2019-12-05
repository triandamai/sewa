package com.pmo.sewa.models;

public class model_barang {
    public String IDBARANG;
    public String NamaBarang;
    public String Kategori;
    public String IdToko;
    public String Stok;
    public String Harga;

    public model_barang(){

    }

    public model_barang(String IDBARANG, String namaBarang, String kategori, String idToko, String stok, String harga) {
        this.IDBARANG = IDBARANG;
        this.NamaBarang = namaBarang;
        this.Kategori = kategori;
        this.IdToko = idToko;
        this.Stok = stok;
        this.Harga = harga;
    }

    public String getIDBARANG() {
        return IDBARANG;
    }

    public void setIDBARANG(String IDBARANG) {
        this.IDBARANG = IDBARANG;
    }

    public String getNamaBarang() {
        return NamaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.NamaBarang = namaBarang;
    }

    public String getKategori() {
        return Kategori;
    }

    public void setKategori(String kategori) {
        this.Kategori = kategori;
    }

    public String getIdToko() {
        return IdToko;
    }

    public void setIdToko(String idToko) {
        this.IdToko = idToko;
    }

    public String getStok() {
        return Stok;
    }

    public void setStok(String stok) {
        this.Stok = stok;
    }

    public String getHarga() {
        return Harga;
    }

    public void setHarga(String harga) {
        this.Harga = harga;
    }
}
