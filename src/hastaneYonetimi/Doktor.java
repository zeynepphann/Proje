package hastaneYonetimi;


import java.util.HashMap;
import java.util.Map;

public class Doktor {

    private String doktorUnvan;
    private String isim;
    private String soyIsim;


    public Doktor(String doktorUnvan, String isim, String soyIsim) {
        this.doktorUnvan = doktorUnvan;
        this.isim = isim;
        this.soyIsim = soyIsim;
    }

    public Doktor() {
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
        return "Doktor{" +
                "doktorUnvan='" + doktorUnvan + '\'' +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                '}';
    }
}