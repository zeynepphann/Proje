package hastaneYonetimi;

import java.util.*;

public class VeriBankasi {
    int count=106;

    static Map<Integer,Hasta> hastaListesiMap= new HashMap<>();
    static Map<String,Doktor> doktorListesiMap= new HashMap<>();

    public static void mapOlusturma (){


        Doktor doktor1=new Doktor("Norolog","Ali",  "Can");
        Doktor doktor2=new Doktor("Dermatolog","Ayse",  "Yan");
        Doktor doktor3=new Doktor("Genel Cerrah","Sevgi",  "Kan");
        Doktor doktor4=new Doktor("Cocuk Doktoru","Zeynep",  "Han");
        Doktor doktor5=new Doktor("Dahiliye","Busra",  "Boyali");
        Doktor doktor6=new Doktor("Kardiyolog","Nilufer",  "Erdem");

        Hasta hasta1=new Hasta("Veli","Tan","");
        Hasta hasta2=new Hasta("Fatma","Şan","");
        Hasta hasta3=new Hasta("Baris","Savas","");
        Hasta hasta4=new Hasta("Aleyna","Tan","");
        Hasta hasta5=new Hasta("Nisa","Boya","");
        Hasta hasta6=new Hasta("Eda","Serdem","");



        hastaListesiMap.put(100,hasta1);
        hastaListesiMap.put(101,hasta2);
        hastaListesiMap.put(102,hasta3);
        hastaListesiMap.put(103,hasta4);
        hastaListesiMap.put(104,hasta5);
        hastaListesiMap.put(105,hasta6);


        doktorListesiMap.put(doktor1.getDoktorUnvan(),doktor1);
        doktorListesiMap.put(doktor2.getDoktorUnvan(),doktor2);
        doktorListesiMap.put(doktor3.getDoktorUnvan(),doktor3);
        doktorListesiMap.put(doktor4.getDoktorUnvan(),doktor4);
        doktorListesiMap.put(doktor5.getDoktorUnvan(),doktor5);
        doktorListesiMap.put(doktor6.getDoktorUnvan(),doktor6);




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
