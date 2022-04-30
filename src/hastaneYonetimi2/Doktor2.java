package hastaneYonetimi2;

public class Doktor2 {
    private String doktorUnvan;
    private String isim;
    private String soyIsim;

    public Doktor2() {
    }

    public Doktor2(String doktorUnvan) {
        this.doktorUnvan = doktorUnvan;
    }

    public Doktor2( String isim, String soyIsim) {

        this.isim = isim;
        this.soyIsim = soyIsim;
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
}
