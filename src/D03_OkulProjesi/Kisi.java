package D03_OkulProjesi;


public class Kisi {

    private String adSoyad;
    private int kimlikNo;
    private int yas;


    public Kisi() {

    }

    public Kisi(String adSoyad, int kimlikNo, int yas) {

        this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;


    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public int getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(int kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }



    @Override
    public String toString() {
        return
                "adSoyad = '" + adSoyad + '\'' +
                        ", kimlikNo = '" + kimlikNo + '\'' +
                        ", yas = " + yas
                ;
    }

}
