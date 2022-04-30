package D03_OkulProjesi;

public class Ogretmen extends Kisi {
    private String bolum;
    private int sicilNo;

    public Ogretmen() {

    }

    public Ogretmen(String bolum, int sicilNo) {

        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public Ogretmen(String adSoyad, int kimlikNo, int yas, String bolum, int sicilNo) {

        super(adSoyad, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;

    }


    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }


    @Override
    public String toString() {
        return super.toString() +
                " bolum = '" + bolum + '\'' +
                ", sicilNo = '" + sicilNo + '\''
                ;
    }
}
