package D03_OkulProjesi;

import java.util.Scanner;

import static D03_OkulProjesi.Islemler.*;


public class Calis {
    static Scanner scan = new Scanner(System.in);
    static String kisi;

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {


        System.out.println("======================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ\n");

        String secim = scan.next();

        switch (secim) {
            case "1":
                kisi = "OGRENCI";
                altMenu();

                break;

            case "2":
                kisi = "OGRETMEN";
                altMenu();


                break;
            case "Q":

            case "q":

                cikis();
                break;
            default:
                System.out.println("yanlis tekrar gir");
                menu();
        }


    }


    private static void altMenu() {

        System.out.println(kisi + " MENUSUNE HOSGELDINIZ ");


        System.out.println("============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t 5-ANA MENÜ\n" +
                "\t\t Q-ÇIKIŞ\n");

        String secim = scan.next();
        switch (secim) {
            case "1":
                ekleme();
                altMenu();
                break;
            case "2":
                arama();
                altMenu();
                break;
            case "3":
                listeleme();
                altMenu();
                break;

            case "4":
                silme();
                altMenu();
                break;
            case "5":
                menu();
                break;
            case "q":
            case "Q":
                cikis();
                break;

            default:
                System.out.println("yanlis girdiniz tekrar");
                altMenu();


        }


    }


    private static void cikis() {
        System.out.println("bye bye");
    }

}
