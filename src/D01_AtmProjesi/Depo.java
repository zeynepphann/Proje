package D01_AtmProjesi;

import java.util.Scanner;

public class Depo {
   static Musteri obj=new Musteri();
    static Scanner scan = new Scanner(System.in);

    public static void musteriGiris() {
        System.out.println("\tLUTFEN KART NUMARAINIZI ve SIFRENIZI GIRINIZ");
        System.out.print("kart no: ");
        String kKontrol = scan.nextLine();
        System.out.print("sifre: ");
        System.out.print("");
        String sKontrol = scan.nextLine();

        if (obj.getKartNo().equals(kKontrol.replaceAll(" ", "")) && obj.getSifre().equals(sKontrol)) {
            anaMenu();
        } else {
            System.out.println("\tLUTFEN KART NO veya SIFRENIZI TEKRAR GIRINIZ");
            musteriGiris();
        }

    }
    public static void anaMenu() {

        String tercih = "";
        do {
            System.out.println("\tLUTFEN YAPMAK ISTEDIGINIZ ISLEMI SECINIZ");
            System.out.println("=============== " +
                    "BIG BANK ANA MENU " +
                    "===============\n " +
                    "\t1 BAKIYE SORGULAMA \n " +
                    "\t2 PARA YATIRMA \n" +
                    "\t3 PARA CEKME\n" +
                    "\t4 PARA GONDERME\n" +
                    "\t5 SIFRE DEGISTIRME\n " +
                    "\t6 CIKIS");
            System.out.println("\tLUTFEN YAPMAK ISTEDIGINIZ ISLEMI SECINIZ");
            tercih = scan.nextLine();

            switch (tercih) {
                case "1":
                    bakiyeSorgulama();
                    break;
                case "2":
                    paraYatirma();
                    break;
                case "3":
                    paraCekme();
                    break;
                case "4":
                    paraGonderme();
                    break;
                case "5":
                    sifreDegistirme();
                    break;
                case "6":
                    break;
                default:
                    System.out.println("\tLUTFEN GECERLI BIR DEGER GIRINIZ");
            }
        } while (!tercih.equalsIgnoreCase("6"));

        Depo.bitir();

    }

    private static void bitir() {
        System.out.println("\tISLEMINIZI SONLANDIRDINIZ. ");
    }


    public static void bakiyeSorgulama() {

        System.out.println("\tGUNCEL BAKIYENIZ: " + obj.getBakiye());
    }

    public static void paraYatirma() {
        System.out.println("\tLUTFEN YATIRMAK ISTEDIGINIZ TUTARI GIRINIZ");
        int yatirilacakTutar = scan.nextInt();
        scan.nextLine();
        if (yatirilacakTutar < 2147483647 && yatirilacakTutar > 0) {
           obj.setBakiye(obj.getBakiye()+yatirilacakTutar);
            System.out.println("\tPARA YATIRMA ISLEMINIZ GERCEKLESMISTIR\n" +
                    "\tGUNCEL BAKIYENIZ: " + obj.getBakiye());
        } else {
            System.out.println("LUTFEN GECERLI BIR TUTAR GIRINIZ");
            paraYatirma();
        }
    }

    public static void paraCekme() {
        System.out.println("\tLUTFEN HESABINIZDAN CEKMEK ISTEDIGINIZ TUTARI GIRINIZ");
        int cekilecekTutar = scan.nextInt();
        scan.nextLine();
        if (cekilecekTutar < obj.getBakiye() && cekilecekTutar > 0) {
            obj.setBakiye(obj.getBakiye()-cekilecekTutar);
            System.out.println("\tPARA CEKME ISLEMINIZ GERCEKLESMISTIR.\n" +
                    "\tGUNCEL BAKIYENIZ: " + obj.getBakiye());
        } else {
            System.out.println("\tLUTFEN GECERLI BIR TUTAR GIRINIZ");
            paraYatirma();
        }
    }

    public static void paraGonderme() {
        System.out.println("\tLUTFEN PARA GONDERMEK ISTEDIGINIZ IBAN NUMARASINI BASINDA TR ILE GIRINIZ");
        String iban = scan.nextLine().replaceAll("", "").toUpperCase();
        if (iban.length() == 26 && iban.startsWith("TR")) {
            System.out.println("\t LUTFEN GONDERMEK ISTEDIGINIZ TUTARI GIRINIZ");

            kontrol();

        } else {
            System.out.println("\tLUTFEN GECERLI BIR IBAN GIRINIZ");
            paraGonderme();
        }
    }

    private static void kontrol() {
        int gonderilecekTutar = scan.nextInt();
        scan.nextLine();
        if (gonderilecekTutar <= obj.getBakiye() && gonderilecekTutar > 0) {
           obj.setBakiye(obj.getBakiye()-gonderilecekTutar);
            System.out.println("\t PARA GONDERME ISLEMINIZ GERCEKLESMISTIR\n" +
                    "GUNCEL BAKIYENIZ: " + obj.getBakiye());
        } else {
            System.out.println("\t LUTFEN GECERLI BIR TUTAR GIRINIZ");
            kontrol();
        }
    }

    public static void sifreDegistirme() {
        System.out.println("\tLUTFEN MEVCUT SIFRENIZI GIRINIZ");
        String sKontrol = scan.next();
        if (obj.getSifre().equals(sKontrol)) {
            System.out.println("\tLUTFEN YENI SIFRENIZI BELIRLEYINIZ\n");
            String yeniSifre = scan.next();
            scan.nextLine();
            obj.setSifre(yeniSifre);
            System.out.println("\tSIFRENIZ BASARILI BIR SEKILDE GUNCELLENMISTIR");
        } else {
            System.out.println("\t LUTFEN MEVCUT SIFRENIZI DOGRU GIRDIGINIZDEN EMIN OLUNUZ");
            sifreDegistirme();

        }
    }
}
