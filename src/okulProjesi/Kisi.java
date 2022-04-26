package okulProjesi;

public class Kisi {
    private String adSoyod;
    private String kimlikNo;
    private int yas;

    public Kisi(String adSoyod, String kimlikNo, int yas) {
        this.adSoyod = adSoyod;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public String getAdSoyod() {
        return adSoyod;
    }

    public void setAdSoyod(String adSoyod) {
        this.adSoyod = adSoyod;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
