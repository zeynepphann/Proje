package hastaneYonetimi2;

public class Doktor2 {
    private String doktorUnvan;
    private String isim;
    private String soyIsim;


    public Doktor2(String doktorUnvan, String isim, String soyIsim) {
        this.doktorUnvan = doktorUnvan;
        this.isim = isim;
        this.soyIsim = soyIsim;
    }

    public Doktor2() {
    }


    public String getDoktorUnvan() {
        return doktorUnvan;
    }

    public void setDoktorUnvan(String doktorUnvan) {
        this.doktorUnvan = doktorUnvan;
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
        return "Doktor" +
                "doktorUnvan='" + doktorUnvan + '\'' +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' ;
    }
}
