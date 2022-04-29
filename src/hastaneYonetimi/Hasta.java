package hastaneYonetimi;

import java.util.HashMap;
import java.util.Map;

public class Hasta  {


    private String isim;
    private String soyIsim;
    private int hastaID;
    private String hastaDurumu;

    public Hasta() {
    }

    public Hasta(int hastaID) {
        this.hastaID = hastaID;
    }

    public Hasta(String isim, String soyIsim) {
        this.isim = isim;
        this.soyIsim = soyIsim;
    }

    public Hasta(String isim, String soyIsim, String hastaDurumu) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.hastaDurumu = hastaDurumu;
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

    public int getHastaID() {
        return hastaID;
    }

    public void setHastaID(int hastaID) {
        this.hastaID = HastaneMethod.hastaID;
    }

    public String getHastaDurumu() {
        return hastaDurumu;
    }

    public void setHastaDurumu(String hastaDurumu) {
        this.hastaDurumu = hastaDurumu;
    }
}
