package com.pmo.sewa.models;

public class model_transaksi {
    public String IDTRANSAKSI;
    public String IDPENYEWA;
    public String IDBARANG;
    public String IDTOKO;
    public String AlamatSewa;
    public String BuktiPembayaran;
    public String Status;
    public String Jumlah;
    public String Total;

    public model_transaksi() {
    }

    public model_transaksi(String IDTRANSAKSI, String IDPENYEWA, String IDBARANG, String IDTOKO, String alamatSewa, String buktiPembayaran, String status, String jumlah, String total) {
        this.IDTRANSAKSI = IDTRANSAKSI;
        this.IDPENYEWA = IDPENYEWA;
        this.IDBARANG = IDBARANG;
        this.IDTOKO = IDTOKO;
        this.AlamatSewa = alamatSewa;
        this.BuktiPembayaran = buktiPembayaran;
        this.Status = status;
        this.Jumlah = jumlah;
        this.Total = total;
    }

    public String getIDTRANSAKSI() {
        return IDTRANSAKSI;
    }

    public void setIDTRANSAKSI(String IDTRANSAKSI) {
        this.IDTRANSAKSI = IDTRANSAKSI;
    }

    public String getIDPENYEWA() {
        return IDPENYEWA;
    }

    public void setIDPENYEWA(String IDPENYEWA) {
        this.IDPENYEWA = IDPENYEWA;
    }

    public String getIDBARANG() {
        return IDBARANG;
    }

    public void setIDBARANG(String IDBARANG) {
        this.IDBARANG = IDBARANG;
    }

    public String getIDTOKO() {
        return IDTOKO;
    }

    public void setIDTOKO(String IDTOKO) {
        this.IDTOKO = IDTOKO;
    }

    public String getAlamatSewa() {
        return AlamatSewa;
    }

    public void setAlamatSewa(String alamatSewa) {
        this.AlamatSewa = alamatSewa;
    }

    public String getBuktiPembayaran() {
        return BuktiPembayaran;
    }

    public void setBuktiPembayaran(String buktiPembayaran) {
        this.BuktiPembayaran = buktiPembayaran;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        this.Status = status;
    }

    public String getJumlah() {
        return Jumlah;
    }

    public void setJumlah(String jumlah) {
        this.Jumlah = jumlah;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {
        this.Total = total;
    }
}
