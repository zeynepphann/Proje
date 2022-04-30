package D03_OkulProjesi;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static D03_OkulProjesi.Calis.kisi;


public class Islemler {

    static List<Kisi> ogrenciList = new ArrayList<>();
    static List<Kisi> ogretmenList = new ArrayList<>();

    public static void ekleme() {
        Scanner scan = new Scanner(System.in);
        System.out.println(kisi + " ekleme sayfasina hosgeldiniz");

        System.out.println("eklemek istediginiz " + kisi + "'nin adini ve soyadini giriniz");
        String adSoyad = scan.nextLine().toUpperCase();


        try {
            System.out.println("eklemek istediginiz " + kisi + "'nin kimlik numarasini giriniz");
            int kimlikNo = scan.nextInt();

            if (kimlikNo > 1 && kimlikNo <= 2140999999) {
                System.out.println("eklemek istediginiz " + kisi + "'nin yasini  giriniz");
                int yas = scan.nextInt();
                if (kisi.equalsIgnoreCase("ogrenci")) {
                    try {
                        System.out.println("eklemek istediginiz " + kisi + "'nin okul numarasini giriniz");
                        int okulNo = scan.nextInt();
                        if (okulNo > 1 && okulNo < 10000) {
                            System.out.println("eklemek istediginiz " + kisi + "'nin sinifini giriniz");
                            String sinif = scan.next();
                            Ogrenci obj = new Ogrenci(adSoyad, kimlikNo, yas, okulNo, sinif);
                            ogrenciList.add(obj);
                            System.out.println(ogrenciList);
                        } else {
                            throw new StringIndexOutOfBoundsException();
                        }
                    } catch (StringIndexOutOfBoundsException e) {
                        System.out.println("hatali okul no");
                    }
                } else {
                    System.out.println("EKLEMEK ISTEDIGINIZ" + kisi + "'NIN BOLUMUNU GIRINIZ");
                    String bolum = scan.next();
                    try {
                        System.out.println("EKLEMEK ISTEDIGINIZ " + kisi + "'NIN SICIL NUMARASINI GIRINIZ");
                        int sicilNo = scan.nextInt();
                        if (sicilNo > 1 && sicilNo < 1000000000) {
                            Ogretmen obj = new Ogretmen(adSoyad, kimlikNo, yas, bolum, sicilNo);
                            ogretmenList.add(obj);
                            System.out.println(ogretmenList);

                        } else {
                            throw new StringIndexOutOfBoundsException("HATALI SICIL NO GIRDINIZ");
                        }
                    } catch (StringIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                }
            } else {
                throw new StringIndexOutOfBoundsException("EKSIK VEYA HATALI GIRIS YAPTINIZ");
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("agam harf giremezsin");
        }

    }


    public static void arama() {
        Scanner scan = new Scanner(System.in);
        System.out.println(kisi + " ARAMA SAYFASİNA HOSGELDİNİZ");
        try {
            System.out.println("ARAMAK ISTEDIGINIZ " + kisi + "'NIN KIMLIK NUMARASINI GIRINIZ");
            int kimlikNo = scan.nextInt();
            if (kimlikNo > 1 && kimlikNo <= 2140999999) {
                if (kisi.equalsIgnoreCase("ogrenci")) {
                    boolean flag = true;
                    for (Kisi each : ogrenciList) {
                        if (each.getKimlikNo() == kimlikNo) {
                            System.out.println(each.toString());
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("ogrenci yok");
                    }
                } else {
                    boolean flag = true;
                    for (Kisi each : ogretmenList) {
                        if (each.getKimlikNo() == kimlikNo) {
                            System.out.println(each.toString());
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("ogretmen yok");
                    }
                }
            } else {
                throw new StringIndexOutOfBoundsException("EKSIK VEYA HATALI GIRIS YAPTINIZ");
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void listeleme() {
        Scanner scan = new Scanner(System.in);
        System.out.println(kisi + " LISTELEME SAYFASİNA HOSGELDİNİZ");
        try {
            if (ogrenciList.size() != 0 || ogretmenList.size() != 0) {
                if (kisi.equalsIgnoreCase("ogrenci")) {
                    for (Kisi each : ogrenciList) {
                        System.out.println(each);
                    }
                } else {
                    for (Kisi each : ogretmenList) {
                        System.out.println(each);
                    }
                }
            } else {
                throw new IndexOutOfBoundsException("LISTEDE ELEMAN YOK");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void silme() {
        Scanner scan = new Scanner(System.in);
        System.out.println(kisi + "SILME SAYFASINA HOSGELDINIZ");
        try {
            System.out.println("SILMEK ISTEDIGINIZ" + kisi + "'NIN KIMLIK NUMARASINI YAZINIZ");
            int kimlikNo = scan.nextInt();
            if (kimlikNo > 1 && kimlikNo <= 2140999999) {
                if (kisi.equalsIgnoreCase("ogrenci")) {
                    boolean flag = true;
                    for (Kisi each : ogrenciList) {
                        if (each.getKimlikNo() == kimlikNo) {
                            ogrenciList.remove(each);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("OGRENCI ZATEN YOK");
                    }
                } else {
                    boolean flag = true;
                    for (Kisi each : ogretmenList) {
                        if (each.getKimlikNo() == kimlikNo) {
                            ogretmenList.remove(each);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("OGRETMEN ZATEN YOK KI");
                    }
                }
            } else {
                throw new InputMismatchException("\tEKSIK VEYA HATALI GIRIS YAPTINIZ");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}
