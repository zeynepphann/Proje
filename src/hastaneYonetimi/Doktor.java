package hastaneYonetimi;


import java.util.HashMap;
import java.util.Map;

public class Doktor extends Hastane {

String doktorUnvan;


    public Doktor(String isim, String soyIsim, String drUnvan) {
        super(isim, soyIsim);
        this.doktorUnvan = drUnvan;
    }

    public String getDrUnvan() {
        return doktorUnvan;
    }

    public void setDrUnvan(String drUnvan) {
        this.doktorUnvan = drUnvan;
    }

    @Override
    public String toString() {
        return "Doktor{" +
                "drUnvan='" + doktorUnvan + '\'' +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                "} " + super.toString();
    }
}
