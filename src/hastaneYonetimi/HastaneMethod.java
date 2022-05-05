package hastaneYonetimi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HastaneMethod implements HastaneMetodInter {

<<<<<<< HEAD
    static Map<ArrayList<String>,ArrayList<ArrayList<String>>> hastaListesiMap= new HashMap<>();
    static Map<ArrayList<String>,ArrayList<ArrayList<String>>> doktorListesiMap= new HashMap<>();
=======

>>>>>>> master

    static Scanner scan = new Scanner(System.in);

    static Hastane hastane =new Hastane();
    public static int hastaID=106;

    public static void giris (){

<<<<<<< HEAD
        for (int i = 0; i <hastane.hastaIdleri.size() ; i++) {;
        }



       doktorListesiMap.put(hastane.doktorUnvanlari,hastane.doktor);

        System.out.println(hastaListesiMap);
        System.out.println(doktorListesiMap);


=======
>>>>>>> master
        System.out.println("******YILDIZ HASTANESİ ********\n******HOSGELDİNİZ********");
        System.out.println("Kayitli hasta=> 1\nYeni kayit=>2");
        int kytSecim=scan.nextInt();
        scan.nextLine();

       // System.out.println(VeriBankasi.hastaListesiMap);
        //System.out.println(VeriBankasi.doktorListesiMap);

        if (kytSecim==1){
            System.out.println("ID numaranizi giriniz :");
            hastaID= scan.nextInt();


                if (VeriBankasi.hastaListesiMap.containsKey(hastaID)){

                    System.out.println(VeriBankasi.hastaListesiMap.get(hastaID));

<<<<<<< HEAD
                if (hastaListesiMap.containsKey(girilenId)){
                    System.out.println(hastaListesiMap.keySet());
=======
>>>>>>> master
                }




            //girilen id ile bizde olan id karsilastirilacak
            //daha sonra ana memuye gonderilecek(ana menu olustur)

        }else if(kytSecim==2){

          yeniHastaEkle();

        }

    }
    public static void anaMenu(){
        System.out.println("Asagidaki sikayetlerden size uygun olani seciniz ");
        System.out.println("bas agris : 1 \nalerji:2\n migren : 3\n soguk alginligi : 4 \ndiyabet : 5 \nkalp hastaliklari: 6 ");
        int scm=scan.nextInt();
        Durum aksiyonobj =new Durum();
        Hasta hastaobj =new Hasta();
        VeriBankasi hastalisteobj =new VeriBankasi();
        //hastaListesiMap.put(hastalisteobj.hastaIdleri,hastalisteobj.hastaIsimleri,hastalisteobj.hastaSoyisimleri);
        //getter setter- mapler kontrol edilecek




        switch (scm){
            case 1:
                aksiyonobj.getAktuelDurum();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;

        }





    }

    private static void yeniHastaEkle() {

        System.out.println("Isim giriniz");
        String isim= scan.nextLine();

        System.out.println("soyIsim giriniz");
        String soyIsim= scan.nextLine();

        Hasta yeniKayitobj=new Hasta(isim,soyIsim);
        Hasta yeniIdobj=new Hasta(hastaID);

        VeriBankasi.hastaListesiMap.put(yeniIdobj,yeniKayitobj);
        hastaID++;

        System.out.println(VeriBankasi.hastaListesiMap);

    }


    @Override
    public void doktorUnvani() {

    }

    @Override
    public void doktorBul() {

    }

    @Override
    public void hastaBul() {

    }
}
