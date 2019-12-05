package com.pmo.sewa.models;

public class model_barang {
    public String IDBARANG;
    public String NamaBarang;
    public String Kategori;
    public String IdToko;
    public String StokTersedia;
    public String StokAsli;
    public String Harga;

    public model_barang(){

    }

    public model_barang(String IDBARANG, String namaBarang, String kategori, String idToko, String stokTersedia,String StokAsli, String harga) {
        this.IDBARANG = IDBARANG;
        this.NamaBarang = namaBarang;
        this.Kategori = kategori;
        this.IdToko = idToko;
        this.StokTersedia = stokTersedia;
        this.StokAsli = StokAsli;
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

    public String getStokTersedia() {
        return StokTersedia;
    }

    public void setStokTersedia(String stokTersedia) {
        this.StokTersedia = stokTersedia;
    }

    public String getStokAsli() {
        return StokAsli;
    }

    public void setStokAsli(String stokAsli) {
        StokAsli = stokAsli;
    }

    public String getHarga() {
        return Harga;
    }

    public void setHarga(String harga) {
        this.Harga = harga;
    }
}
