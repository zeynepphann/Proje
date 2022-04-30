package D02_UcusProjesi;

public class Yolcu {
    private String isim;
    private String soyIsim;
    private String sehir;
    private String yon;
    private int yas;
    private double biletBirimFiyat = 1.00;


    public String getYon() {
        return yon;
    }

    public Yolcu(String isim, String soyIsim, String sehir, String yon, int yas) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.sehir = sehir;
        this.yon = yon;
        this.yas = yas;

    }

    public Yolcu() {

    }

    public int getYas() {
        return yas;
    }

    public String getSehir() {
        return sehir;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public String getIsim() {
        return isim;
    }

    public int getKahta() {
        return Kahta;
    }

    private int Kahta = 100;

    public int getSincik() {
        return Sincik;
    }

    private int Sincik = 120;

    public int getGerger() {
        return Gerger;
    }

    private int Gerger = 140;


    public double getBiletBirimFiyat() {
        return biletBirimFiyat;
    }


    @Override
    public String toString() {

        return "Yolcu{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", sehir='" + sehir + '\'' +
                ", yon='" + yon + '\'' +
                ", yas=" + yas +
                '}';
    }


}

