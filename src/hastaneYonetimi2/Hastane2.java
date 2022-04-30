package hastaneYonetimi2;

public class Hastane2 extends VeriBankasi2{
    protected String isim;
    protected String soyIsim;


    public Hastane2(String isim, String soyIsim) {
        this.isim = isim;
        this.soyIsim = soyIsim;
    }

    public Hastane2() {

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }
}
