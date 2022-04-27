package hastaneYonetimi;

import java.util.Scanner;

public class HastaneMethod implements HastaneMetodInter {

    static Scanner scan = new Scanner(System.in);


    public static void giris (){
        System.out.println("******YILDIZ HASTANESİ ********\n******HOSGELDİNİZ********");
        System.out.println("Kayitli hasta=> 1\nYeni kayit=>2");
        int kytSecim=scan.nextInt();
        scan.nextLine();

        if (kytSecim==1){
            System.out.println("ID numaranizi giriniz :");
            int girilenId= scan.nextInt();
            //girilen id ile bizde olan id karsilastirilacak
            //daha sonra ana memuye gonderilecek(ana menu olustur)

        }else if(kytSecim==2){
          yeniHastaEkle();

        }

    }

    private static void yeniHastaEkle() {

        VeriBankasi ynhst =new VeriBankasi();
        System.out.println("Isim giriniz");
        ynhst.hastaIsimleri.add(scan.nextLine());
        scan.nextInt();
        System.out.println("soyIsim giriniz");
        ynhst.hastaSoyisimleri.add(scan.nextLine());
        ynhst.hastaIdleri.add(ynhst.count++);

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
