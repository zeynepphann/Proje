package okulProjesi;

public class Ogretmen extends Kisi{
    private String sicilNo;
    private String bolum;

    public Ogretmen(String adSoyod, String kimlikNo, int yas, String sicilNo, String bolum) {
        super(adSoyod, kimlikNo, yas);
        this.sicilNo = sicilNo;
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
}
