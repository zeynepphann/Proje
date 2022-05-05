package hastaneYonetimi2;

import hastaneYonetimi.*;

import java.util.Scanner;

public class HastaneMethod2 implements HastaneMethodInter2 {


    static Scanner scan = new Scanner(System.in);

    static Hastane hastane =new Hastane();
    public static int hastaID=106;
    static String durum="";
    static Durum aktuelobj=new Durum();

    public static void giris (){

        VeriBankasi.mapOlusturma();
        System.out.println("******YILDIZ HASTANESİ ********\n******HOSGELDİNİZ********");
        System.out.println("Kayitli hasta=> 1\nYeni kayit=>2");
        int kytSecim=scan.nextInt();
        scan.nextLine();

        if (kytSecim==1){
            System.out.println("ID numaranizi giriniz :");
            hastaID= scan.nextInt();

            if (VeriBankasi.hastaListesiMap.containsKey(hastaID)){
                System.out.println(VeriBankasi.hastaListesiMap.get(hastaID).toString());
            }
         anaMenu();

    }else if(kytSecim==2){

            yeniHastaEkle();

        }

    }
    public static void anaMenu(){
        HastaneMethod hastaneMethodobj=new HastaneMethod();
        System.out.println("Asagidaki sikayetlerden size uygun olani seciniz ");
        System.out.println("bas agrisi : 1 \nalerji:2\n migren : 3\n soguk alginligi : 4 \ndiyabet : 5 \nkalp hastaliklari: 6 ");
        int scm=scan.nextInt();

        switch (scm){
            case 1:
                durum="bas agrisi";
                aciliyetDurumu();
                System.out.println("Sikayetiniz icin uygun dr'a yonlendiriliyorsunuz");
                hastaneMethodobj.doktorUnvani();

                break;
            case 2:

                durum="alerji";
                aciliyetDurumu();
                System.out.println("Sikayetiniz icin uygun dr'a yonlendiriliyorsunuz");

                break;
            case 3:
                durum="migren";
                aciliyetDurumu();
                System.out.println("Sikayetiniz icin uygun dr'a yonlendiriliyorsunuz");
                break;
            case 4:
                durum="soguk alginligi";
                aciliyetDurumu();
                System.out.println("Sikayetiniz icin uygun dr'a yonlendiriliyorsunuz");
                break;
            case 5:
                durum="diyabet";
                aciliyetDurumu();
                System.out.println("Sikayetiniz icin uygun dr'a yonlendiriliyorsunuz");
                break;
            case 6:
                durum="kalp hastaliklari";
                aciliyetDurumu();
                System.out.println("Sikayetiniz icin uygun dr'a yonlendiriliyorsunuz");
                break;

        }

    }

    private static void aciliyetDurumu(){

        if (durum.equalsIgnoreCase("alerji")||durum.equalsIgnoreCase("kalp hastaliklari"))
        { aktuelobj.setAciliyet(true);
            System.out.println("Acil durumunuzdan dolayi oncelik hakkina sahipsiniz...");}
        else{aktuelobj.setAciliyet(false);
        }

    }

    private static void yeniHastaEkle() {

        System.out.println("Isim giriniz");
        String isim= scan.nextLine();

        System.out.println("soyIsim giriniz");
        String soyIsim= scan.nextLine();


        hastaID++;

        System.out.println(VeriBankasi.hastaListesiMap);

    }


    @Override
    public  void doktorUnvani() {

        switch(durum){
            case "bas agrisi":

                VeriBankasi.doktorListesiMap.get("Norolog");
                break;
            case "alerji":
                break;
            case "migren":
                break;
            case "soguk alginligi":
                break;
            case "diyabet":
                break;
            case "kalp hastaliklari":
                break;
        }

    }

    @Override
    public void doktorBul() {

    }

    @Override
    public  void hastaBul() {

    }
}
