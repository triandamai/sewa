package com.pmo.sewa.models;

public class model_toko {
    public String IDTOKO;
    public String Namatoko;
    public String AlamatToko;
    public String PemilikToko;
    public String BannerToko;
public model_toko(){

}

    public model_toko(String IDTOKO, String namatoko, String alamatToko, String pemilikToko, String bannerToko) {
        this.IDTOKO = IDTOKO;
        this.Namatoko = namatoko;
        this.AlamatToko = alamatToko;
        this.PemilikToko = pemilikToko;
        this.BannerToko = bannerToko;
    }

    public String getIDTOKO() {
        return IDTOKO;
    }

    public void setIDTOKO(String IDTOKO) {
        this.IDTOKO = IDTOKO;
    }

    public String getNamatoko() {
        return Namatoko;
    }

    public void setNamatoko(String namatoko) {
        this.Namatoko = namatoko;
    }

    public String getAlamatToko() {
        return AlamatToko;
    }

    public void setAlamatToko(String alamatToko) {
        this.AlamatToko = alamatToko;
    }

    public String getPemilikToko() {
        return PemilikToko;
    }

    public void setPemilikToko(String pemilikToko) {
        this.PemilikToko = pemilikToko;
    }

    public String getBannerToko() {
        return BannerToko;
    }

    public void setBannerToko(String bannerToko) {
        this.BannerToko = bannerToko;
    }
}

