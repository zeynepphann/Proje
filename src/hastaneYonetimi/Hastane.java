package hastaneYonetimi;

public class Hastane extends VeriBankasi {

protected String isim;
protected String soyIsim;


    public Hastane(String isim, String soyIsim) {
        this.isim = isim;
        this.soyIsim = soyIsim;
    }

    public Hastane() {

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

    @Override
    public String toString() {
        return "Hastane{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", count=" + count +
                "} " + super.toString();
    }
}
