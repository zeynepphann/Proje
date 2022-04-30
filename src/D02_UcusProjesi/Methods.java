package D02_UcusProjesi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Methods {

    static Scanner scan = new Scanner(System.in);
    static String tercih;
    static List<Yolcu> list = new ArrayList<>();
    static double price[] = new double[1];

    public static void biletAlma() {
        System.out.println("                   \t====HOS GELDINIZ====");
        System.out.println("\t LUTFEN ISIM, SOYISIM, SEHIR, YON (TEK veya CIFT) ve YASINIZI GIRINIZ");
        System.out.print("\tISIM: ");
        String isim = scan.nextLine().toUpperCase();
        System.out.print("\tSOYISIM: ");
        String soyIsim = scan.nextLine().toUpperCase();
        System.out.print("\tSEHIR: ");
        String sehir = scan.nextLine().toUpperCase();
        System.out.print("\tYON: ");
        String yon = scan.nextLine().toUpperCase();
        System.out.print("\tYAS: ");
        int yas = scan.nextInt();
        Yolcu yolcu1 = new Yolcu(isim, soyIsim, sehir, yon, yas);
        list.add(yolcu1);
        menu();
    }

    public static void menu() {
        System.out.println("\t SAYIN " + list.get(0).getIsim() + " " + list.get(0).getSoyIsim() + " LUTFEN ROTANIZI SECINIZ\n" +
                "\t1 KAHTA\n" +
                "\t2 SINCIK\n" +
                "\t3 GERGER ");
        tercih = scan.next();
        switch (tercih) {
            case "1":
                kahta();
                break;
            case "2":
                sincik();
                break;
            case "3":
                gerger();
                break;
            default:
                System.out.println("\tGECERSIZ ROTA SECIMI YAPTINIZ");
        }
        biletBilgilendirme();
        int biletOnay = scan.nextInt();
        if (biletOnay == 1) {
            fisYazdirma();
        } else if (biletOnay == 2) {
            System.out.println("\t ISLEMINIZ SONLANDIRILMISTIR");
        } else {
            System.out.println("\t GECERSIZ SECIM YAPTINIZ");
            biletAlma();
        }
    }


    public static void kahta() {
        Yolcu obj = new Yolcu();
        if (list.get(0).getYas() <= 25 && list.get(0).getYas() > 0) {
            if (list.get(0).getYon().equalsIgnoreCase("TEK")) {
                double KahtaFiyat = obj.getBiletBirimFiyat() / 2 * obj.getKahta();
                price[0] = KahtaFiyat;
                System.out.println("\t BILET FIYATI: " + KahtaFiyat);
            } else if (obj.getYon().equals("CIFT")) {
                double KahtaFiyat = (obj.getBiletBirimFiyat() / 2 * obj.getKahta()) * 2;
                price[0] = KahtaFiyat;
                System.out.println("\t BILET FIYATI: " + KahtaFiyat);
            } else {
                System.out.println("\tGECERSIZ YON GIRDINIZ");
                biletAlma();
            }
        } else if (obj.getYas() < 120 && obj.getYas() > 25) {
            double KahtaFiyat = obj.getBiletBirimFiyat() * obj.getKahta();
            System.out.println(KahtaFiyat);
        } else {
            System.out.println("\tGECERSIZ YAS GIRDINIZ");
            biletAlma();
        }
    }

    public static void sincik() {
        if (list.get(0).getYas() <= 25 && list.get(0).getYas() > 0) {
            if (list.get(0).getYon().equals("TEK")) {
                double SincikFiyat = list.get(0).getBiletBirimFiyat() / 2 * list.get(0).getSincik();
                price[0] = SincikFiyat;
                System.out.println("\t BILET FIYATI: " + SincikFiyat);
            } else if (list.get(0).getYon().equals("CIFT")) {
                double SincikFiyat = (list.get(0).getBiletBirimFiyat() / 2 * list.get(0).getSincik()) * 2;
                price[0] = SincikFiyat;
                System.out.println("\t BILET FIYATI: " + SincikFiyat);
            } else {
                System.out.println("\tGECERSIZ YON GIRDINIZ");
                biletAlma();
            }
        } else if (list.get(0).getYas() < 120 && list.get(0).getYas() > 25) {
            double SincikFiyat = list.get(0).getBiletBirimFiyat() * list.get(0).getSincik();
            System.out.println(SincikFiyat);
        } else {
            System.out.println("\tGECERSIZ YAS GIRDINIZ");
            biletAlma();
        }
    }

    public static void gerger() {

        if (list.get(0).getYas() <= 25 && list.get(0).getYas() > 0) {
            if (list.get(0).getYon().equals("TEK")) {
                double GergerFiyat = list.get(0).getBiletBirimFiyat() / 2 * list.get(0).getGerger();
                System.out.println("\t BILET FIYATI: " + GergerFiyat);
                price[0] = GergerFiyat;
            } else if (list.get(0).getYon().equals("CIFT")) {
                double GergerFiyat = (list.get(0).getBiletBirimFiyat() / 2 * list.get(0).getGerger()) * 2;
                System.out.println("\t BILET FIYATI: " + GergerFiyat);
                price[0] = GergerFiyat;
            } else {
                System.out.println("\tGECERSIZ YON GIRDINIZ");
                biletAlma();
            }
        } else if (list.get(0).getYas() < 120 && list.get(0).getYas() > 25) {
            double GergerFiyat = list.get(0).getBiletBirimFiyat() * list.get(0).getGerger();
            System.out.println(GergerFiyat);
        } else {
            System.out.println("\tGECERSIZ YAS GIRDINIZ");
            biletAlma();
        }
    }

    public static void biletBilgilendirme() {
        if (list.get(0).getYas() <= 25 && list.get(0).getYas() > 0) {
            System.out.println("\tINDIRIMLI BILET FIYATI: " + price[0] + "\n" +
                    "ONAYLIYORSANIZ 1 ONAYLAMIYORSANIZ 2 TUSLAYINIZ");
        } else {
            System.out.println("\tINDIRIMSIZ BILET FIYATI: " + price[0] + "\n" +
                    "ONAYLIYORSANIZ 1 ONAYLAMIYORSANIZ 2 TUSLAYINIZ");
        }
    }

    public static void fisYazdirma() {
        Yolcu obj = new Yolcu();
        System.out.println("\t        ===CENDERE AIRLINES===\n" +
                "\tYOLCU ISIM: " + list.get(0).getIsim() +
                "\n\tYOLCU SOYISIM: " + list.get(0).getSoyIsim() +
                "\n\tYOLCU YAS: " + list.get(0).getYas() +
                "\n\tKALKIS SEHIR: " + list.get(0).getSehir());
        gateNo();
        ucusNo();
    }

    public static void ucusNo() {
        LocalDate tarih = LocalDate.now();
        LocalTime saat = LocalTime.now();
        System.out.println("\tUCUS NO: TK" + tarih.getYear() + " " + saat.getHour());
        System.out.println("DIKKATLI UC BIDAHA GERI GELME");
    }

    public static void gateNo() {
        Random rnd = new Random();
        System.out.println("\tGATE NO: " + list.get(0).getSehir() + rnd.nextInt(100));
    }
}
