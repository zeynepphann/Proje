package hastaneYonetimi;

import java.util.HashMap;
import java.util.Map;

public class Hasta extends Hastane {

    String hastaId;
    static Map<Integer,VeriBankasi> hastaListesiMap= new HashMap<>();


    public Hasta(String isim, String soyIsim, String hastaId) {
        super(isim, soyIsim);
        this.hastaId = hastaId;
    }

    public String getHastaId() {
        return hastaId;
    }

    public void setHastaId(String hastaId) {
        this.hastaId = hastaId;
    }

    @Override
    public String toString() {
        return "Hasta{" +
                "hastaId='" + hastaId + '\'' +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                "} " + super.toString();
    }
}
