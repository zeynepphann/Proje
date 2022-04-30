package hastaneYonetimi2;

import hastaneYonetimi.Doktor;
import hastaneYonetimi.Hasta;

import java.util.HashMap;
import java.util.Map;

public class VeriBankasi2 {
    int count = 106;

    static Map<Integer, Hasta> hastaListesiMap = new HashMap<>();
    static Map<String, Doktor> doktorListesiMap = new HashMap<>();

    public static void mapOlusturma() {

        Doktor doktor1 = new Doktor("Norolog", "Ali", "Can");
        Doktor doktor2 = new Doktor("Dermatolog", "Ayse", "Yan");
        Doktor doktor3 = new Doktor("Genel Cerrah", "Sevgi", "Kan");
        Doktor doktor4 = new Doktor("Cocuk Doktoru", "Zeynep", "Han");
        Doktor doktor5 = new Doktor("Dahiliye", "Busra", "Boyali");
        Doktor doktor6 = new Doktor("Kardiyolog", "Nilufer", "Erdem");

        Hasta hasta1 = new Hasta("Veli", "Tan", "");
        Hasta hasta2 = new Hasta("Fatma", "Şan", "");
        Hasta hasta3 = new Hasta("Baris", "Savas", "");
        Hasta hasta4 = new Hasta("Aleyna", "Tan", "");
        Hasta hasta5 = new Hasta("Nisa", "Boya", "");
        Hasta hasta6 = new Hasta("Eda", "Serdem", "");

        hastaListesiMap.put(100, hasta1);
        hastaListesiMap.put(101, hasta2);
        hastaListesiMap.put(102, hasta3);
        hastaListesiMap.put(103, hasta4);
        hastaListesiMap.put(104, hasta5);
        hastaListesiMap.put(105, hasta6);


        doktorListesiMap.put(doktor1.getDoktorUnvan(), doktor1);
        doktorListesiMap.put(doktor2.getDoktorUnvan(), doktor2);
        doktorListesiMap.put(doktor3.getDoktorUnvan(), doktor3);
        doktorListesiMap.put(doktor4.getDoktorUnvan(), doktor4);
        doktorListesiMap.put(doktor5.getDoktorUnvan(), doktor5);
        doktorListesiMap.put(doktor6.getDoktorUnvan(), doktor6);


    }
}
