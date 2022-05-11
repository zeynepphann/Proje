package hastaneYonetimi3;

public class Hasta {
    int hastaId;
    String isim;
    String soyIsim;


    public Hasta(int hastaId,String isim, String soyIsim ) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.hastaId = hastaId;
    }

    @Override
    public String toString() {
        return "Hasta Bilgileri :" +
                "Isim=" + isim   +
                "  Soy Isim=" + soyIsim +
                "hasta ID numarasi="+ hastaId;
    }
}
