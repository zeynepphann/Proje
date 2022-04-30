package D03_OkulProjesi;

public class Ogrenci extends Kisi {
    private int okulNo;
    private String sinif;

    public Ogrenci() {

    }


    public Ogrenci(String adSoyad, int kimlikNo, int yas, int okulNo, String sinif) {
        super(adSoyad, kimlikNo, yas);
        this.okulNo = okulNo;
        this.sinif = sinif;
    }


    public Ogrenci(int okulNo, String sinif) {
        this.okulNo = okulNo;
        this.sinif = sinif;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }


    @Override
    public String toString() {
        return super.toString() +
                " okulNo = '" + okulNo + '\'' +
                ", sinif = '" + sinif + '\''
                ;
    }
}
