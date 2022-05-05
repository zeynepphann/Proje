package hastaneYonetimi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HastaneMethod implements HastaneMetodInter {

    static Map<ArrayList<String>,ArrayList<ArrayList<String>>> hastaListesiMap= new HashMap<>();
    static Map<ArrayList<String>,ArrayList<ArrayList<String>>> doktorListesiMap= new HashMap<>();

    static Scanner scan = new Scanner(System.in);

    static Hastane hastane =new Hastane();

    public static void giris (){

        for (int i = 0; i <hastane.hastaIdleri.size() ; i++) {;
        }



       doktorListesiMap.put(hastane.doktorUnvanlari,hastane.doktor);

        System.out.println(hastaListesiMap);
        System.out.println(doktorListesiMap);


        System.out.println("******YILDIZ HASTANESİ ********\n******HOSGELDİNİZ********");
        System.out.println("Kayitli hasta=> 1\nYeni kayit=>2");
        int kytSecim=scan.nextInt();
        scan.nextLine();

        if (kytSecim==1){
            System.out.println("ID numaranizi giriniz :");
            int girilenId= scan.nextInt();

                if (hastaListesiMap.containsKey(girilenId)){
                    System.out.println(hastaListesiMap.keySet());
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
/*
        VeriBankasi ynhst =new VeriBankasi();
        System.out.println("Isim giriniz");
        ynhst.hastaIsimleri.add(scan.nextLine());
        scan.nextInt();
        System.out.println("soyIsim giriniz");
        ynhst.hastaSoyisimleri.add(scan.nextLine());
        ynhst.hastaIdleri.add(ynhst.count++);


 */
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
