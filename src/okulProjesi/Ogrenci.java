package okulProjesi;

public class Ogrenci extends Kisi {
    private String numara;
    private String sinif;

    public Ogrenci(String adSoyod, String kimlikNo, int yas, String numara, String sinif) {
        super(adSoyod, kimlikNo, yas);
        this.numara = numara;
        this.sinif = sinif;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }
}
