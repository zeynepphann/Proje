package hastaneYonetimi3;

import java.util.HashMap;
import java.util.Map;

public class VeriBankasi {


    public static Map<Integer, Hasta> hastaListesiMap = new HashMap<>();
    static Map<String, Doktor> doktorListesiMap = new HashMap<>();

    public static void map() {
        Doktor doktor1 = new Doktor("Bas agrisi","Ali" , "Can", "Norolog","Acil degil");
        Doktor doktor2 = new Doktor("Alerji","Ayse" , "Yan", "Dermatolog","Acil degil");
        Doktor doktor3 = new Doktor("Diabet", "Sevgi", "Kan", "Genel Cerrah","Acil degil");
        Doktor doktor4 = new Doktor("Soguk Alginligi", "Zeynep", "Han", "Cocuk Doktoru","Acil degil");
        Doktor doktor5 = new Doktor("Migren", "Busra", "Boyali","Dahiliye" ,"Acil ");
        Doktor doktor6 = new Doktor("Kalp hastaliklari","Nilufer" , "Erdem", "Kardiyolog","Acil");


        doktorListesiMap.put("Bas agrisi" ,doktor1);
        doktorListesiMap.put("Alerji" , doktor2);
        doktorListesiMap.put("Diabet",doktor3);
        doktorListesiMap.put("Soguk Alginligi", doktor4);
        doktorListesiMap.put("Migren", doktor5);
        doktorListesiMap.put("Kalp hastaliklari", doktor6);



        Hasta hasta1 = new Hasta(111,"Veli", "Tan" );
        Hasta hasta2 = new Hasta(222,"Fatma", "Şan" );
        Hasta hasta3 = new Hasta(333,"Baris", "Savas" );
        Hasta hasta4 = new Hasta(444,"Aleyna", "Tan" );
        Hasta hasta5 = new Hasta(555,"Nisa", "Boya");
        Hasta hasta6 = new Hasta(666,"Eda", "Serdem");



        hastaListesiMap.put(111, hasta1);
        hastaListesiMap.put(222, hasta2);
        hastaListesiMap.put(333, hasta3);
        hastaListesiMap.put(444, hasta4);
        hastaListesiMap.put(555, hasta5);
        hastaListesiMap.put(666, hasta6);


    }
}
