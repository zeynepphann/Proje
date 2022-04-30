package hastaneYonetimi;

import java.util.*;

public class VeriBankasi {
    int count=106;


/*
        ArrayList<String> doktorIsimleri=new ArrayList<>(Arrays.asList("Ali","Ayse","Sevgi","Zeynep","Busra","Nilufer"));
        ArrayList<String> doktorSoyisimleri=new ArrayList<>(Arrays.asList("Can","Yan","Kan","Han","Boyali","Erdem"));
        ArrayList<String> doktorUnvanlari=new ArrayList<>(Arrays.asList("Norolog","Dermatolog","Genel Cerrah","Cocuk Doktoru","Dahiliye","Kardiyolog"));
        ArrayList<String> hastaIsimleri=new ArrayList<>(Arrays.asList("Veli","Fatma","Baris","Aleyna","Nisa","Eda"));
        ArrayList<String> hastaSoyisimleri=new ArrayList<>(Arrays.asList("Tan","Şan","Savas","Tan","Boya","Serdem"));
        ArrayList<String> durumlar=new ArrayList<>(Arrays.asList("Bas agrisi","Alerji","Migren","Soguk Alginligi","Diyabet","Kalp Hastaliklari"));
        ArrayList<Integer> hastaIdleri=new ArrayList<>(Arrays.asList(100,101,102,103,104,105));

        ArrayList<ArrayList<String>>hasta=new ArrayList<>(Arrays.asList(hastaIsimleri,hastaSoyisimleri));
        ArrayList<ArrayList<String>>doktor=new ArrayList<>(Arrays.asList(doktorIsimleri,doktorSoyisimleri));

        ArrayList<String> doktorUnvanlari=new ArrayList<>(Arrays.asList("Norolog","Dermatolog","Genel Cerrah","Cocuk Doktoru","Dahiliye","Kardiyolog"));


 */
    public static Map<Hasta,Hasta> hastaListesiMap= new HashMap<>();
    public static Map<Doktor,Doktor> doktorListesiMap= new HashMap<>();

    public static void mapOlusturma (){
        Doktor doktor1=new Doktor("Ali",  "Can");
        Doktor doktor2=new Doktor("Ayse",  "Yan");
        Doktor doktor3=new Doktor("Sevgi",  "Kan");
        Doktor doktor4=new Doktor("Zeynep",  "Han");
        Doktor doktor5=new Doktor("Busra",  "Boyali");
        Doktor doktor6=new Doktor("Nilufer",  "Erdem");

        Hasta hasta1=new Hasta("Veli","Tan","");
        Hasta hasta2=new Hasta("Fatma","Şan","");
        Hasta hasta3=new Hasta("Baris","Savas","");
        Hasta hasta4=new Hasta("Aleyna","Tan","");
        Hasta hasta5=new Hasta("Nisa","Boya","");
        Hasta hasta6=new Hasta("Eda","Serdem","");


        Doktor unvan1=new Doktor("Norolog");
        Doktor unvan2=new Doktor("Dermatolog");
        Doktor unvan3=new Doktor("Genel Cerrah");
        Doktor unvan4=new Doktor("Cocuk Doktoru");
        Doktor unvan5=new Doktor("Dahiliye");
        Doktor unvan6=new Doktor("Kardiyolog");

        Hasta id1=new Hasta(100);
        Hasta id2=new Hasta(101);
        Hasta id3=new Hasta(102);
        Hasta id4=new Hasta(103);
        Hasta id5=new Hasta(104);
        Hasta id6=new Hasta(105);



        hastaListesiMap.put(id1,hasta1);
        hastaListesiMap.put(id2,hasta2);
        hastaListesiMap.put(id3,hasta3);
        hastaListesiMap.put(id4,hasta4);
        hastaListesiMap.put(id5,hasta5);
        hastaListesiMap.put(id6,hasta6);


        doktorListesiMap.put(unvan1,doktor1);
        doktorListesiMap.put(unvan2,doktor2);
        doktorListesiMap.put(unvan3,doktor3);
        doktorListesiMap.put(unvan4,doktor4);
        doktorListesiMap.put(unvan5,doktor5);
        doktorListesiMap.put(unvan6,doktor6);








    }



/*
    ArrayList<String> dr1=new ArrayList<>(Arrays.asList("Ali",  "Can"));
    ArrayList<String> dr2=new ArrayList<>(Arrays.asList("Ayse",  "Yan"));
    ArrayList<String> dr3=new ArrayList<>(Arrays.asList("Sevgi",  "Kan"));
    ArrayList<String> dr4=new ArrayList<>(Arrays.asList("Zeynep",  "Han"));
    ArrayList<String> dr5=new ArrayList<>(Arrays.asList("Busra",  "Boyali"));
    ArrayList<String> dr6=new ArrayList<>(Arrays.asList("Nilufer",  "Erdem"));

    ArrayList<String> hst1=new ArrayList<>(Arrays.asList("Veli","Tan"));
    ArrayList<String> hst2=new ArrayList<>(Arrays.asList("Fatma","Şan"));
    ArrayList<String> hst3=new ArrayList<>(Arrays.asList("Baris","Savas"));
    ArrayList<String> hst4=new ArrayList<>(Arrays.asList("Aleyna","Tan"));
    ArrayList<String> hst5=new ArrayList<>(Arrays.asList("Nisa","Boya"));
    ArrayList<String> hst6=new ArrayList<>(Arrays.asList("Eda","Serdem"));

 */


}
