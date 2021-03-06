package aracKiralama;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Islemler implements aracYonetimi{
    static Scanner scanner = new Scanner(System.in);
    public static final String BLACK = "\u001B[30m";
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";

    int aracId; // Methodlar seçilen araca göre işlem yapıyor. id'yi seçtikten sonra class level'da tanımlarsak sorunsuz
    //    bir şekilde tekrar kullanabiliriz

    int count;  //sistem başlatılırken default araç listesini sisteme kaydetmemiz gerekiyor. sisteme ilk girişte sadece
                // 1 defa default araç listesi tanımlansın diye konulan flag

    int kiralamaCount;  // araç kiralama işlemleri yapılmadan müşteriye teslimi engellemek için oluşturuldu

    double toplamOdenecek;  // toplam fiyat hesaplandıktan sonra ödeme methodunda da kullanabilmek için oluşturuldu

    static int deger = 1000; // unique id'ler oluşturmak için oluşturuldu

    Map<Integer, AracOzellikleri> arac = new HashMap<>();
    Map<Integer, MusteriBilgileri> musteri = new HashMap<>();
    Map<Integer, KiralamaBilgileri> kiralama = new HashMap<>();

    public void secim() {

        System.out.println("========================== AUTOKING GALERI YONETICI PANELI =======================\r\n"

                + "   ____________________             ____________________    \n"
                + "   | 1-ARAC LISTELEME  |            | 2-ARAC KIRALAMA   |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   _____________________             ____________________    \n"
                + "   | 3-MUSTERIYE TESLIM |            | 4-ARAC CIKARMA    |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   _____________________            _____________________   \n"
                + "   | 5- ARAÇ EKLEME    |            | 6- CIKIS          |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯            ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯  " + B);

        System.out.print("ISLEM SECİNİZ : ");

        /*
        seçim ekranından direkt 3'e basılırsa işlem yaptırılmayacak çünkü müşteri yok
        1- tüm araçlar listelenecek
        2- araç kiralamak için seçilen aracın id si istenece
           kiralama tarihleri istenecek
           fiyat çıkartılacak
           müşteri fiyatı kabul ederse müşterinin kaydı yapılacak
           ödeme alınacak
        3- (2. aşama 3'ün görevlerini yapıyor o yüzden fonksiyonsuz kaldı?)
        4- Araç listesinden araç çıkarılıyor
        5- yeni araç ekleniyor
        6- sistemden çıkış yapılıyor
         */

        //defaultAraclar methodunu sadece bir defa ilk girişte çalıştırmak için oluşturuldu.
        //Runner class'ında çağırlabilirdi bununla uğraşmamak için
        if (count == 0) {
            defaultAraclar();
            count++;
        }

        int sec = TryCatch01.intGirisi();

        switch (sec) {
            case 1:
                aracListeleme();
                TryCatch01.threadSleep(1000);
                secim();
                break;
            case 2:
                aracKirala();
                TryCatch01.threadSleep(1000);

                kiralamaCount++;
                break;
            case 3:
                if (kiralamaCount == 0) {
                    System.out.println("Araç kiralama menüsü doldurulmadan müşteriye teslim menüsü kullanılamaz!\n" +
                            "Ana Menüye yönlendiriliyorsunuz");
                    TryCatch01.threadSleep(1000);
                    secim();
                } else {
                    aracTalebi();
                }
                break;
            case 4:
                aracCikarma();
                break;
            case 5:
                aracEkleme();
                secim();
                break;
            case 6:
                cikis();
                break;
            default:
                System.out.println("Hatali deger girdiniz");
                secim();

        }

    }

    @Override
    public void aracKirala() {

    }

    @Override
    public void aracTalebi() { //tarihler set methodunun içerisinde alınmamalı !!!


    }

    @Override
    public void kiralananAracBilgileri() {


    }

    @Override
    public void musteriKaydi() {

    }


    @Override
    public void odeme(int id) {


    }

    @Override
    public void aracTeslim() {

    }

    @Override
    public void aracEkleme() {
        aracListeleme();

        System.out.println("Lutfen eklemek istediginiz aracin modelini giriniz");
        String model=scanner.next();
        System.out.println("Lutfen eklemek istediginiz aracin markasini giriniz");
        String marka=scanner.next();
        System.out.println("Lutfen eklemek istediginiz aracin yakit turunu giriniz");
        String yakit=scanner.next();
        System.out.println("Lutfen eklemek istediginiz aracin vites sayisini giriniz");
        String vites=scanner.next();
        System.out.println("Lutfen eklemek istediginiz aracin koltuk sayisini giriniz");
        int koltukSayisi =scanner.nextInt();
        String musaitlikDurumu="Musait";
        double ucret=200;
        aracId++;

         AracOzellikleri yeniArac=new AracOzellikleri (aracId,model,marka,yakit,vites,koltukSayisi,ucret,musaitlikDurumu);









    }

    @Override
    public void aracListeleme() {

    }

    @Override
    public void cikis() {

    }

    @Override
    public void aracCikarma() {

    }

    public void aracYazdirma(Map<Integer, AracOzellikleri> arac) {


    }

    public static void banner() {
        System.out.println(B + "ID\t\tMODEL\t\t\tMARKA\t\tYAKIT\t\t\tVITES\t\t\tKOLTUKSAYISI\tUCRET\tMUSAITLIKDURUMU" +
                "\n============================================================================================================");

    }

    @Override
    public void defaultAraclar() {
        AracOzellikleri opelBenzinOtomatik=new AracOzellikleri(101,"Astra","Opel","Benzin","Otomatik",5,150,"Musait");
        AracOzellikleri opelBenzinManuel=new AracOzellikleri(102,"Vectra","Opel","Benzin","Manuel",5,120,"Musait");
        AracOzellikleri hondaBenziOtomatik=new AracOzellikleri(103,"Civic","Honda","Benzin","Otomatik",5,200,"Musait");
        AracOzellikleri fiatBenzinOtomatik=new AracOzellikleri(104,"Agea","Fiat","Benzin","Otomatik",5,300,"Musait");
        AracOzellikleri daciaDizelManuel=new AracOzellikleri(105,"Sandero","Dacia","Dizel","Manuel",5,200,"Musait");
        AracOzellikleri renaultBenzinOtomatik=new AracOzellikleri(106,"Megane","Renault","Benzin","Otomatik",5,300,"Musait");
        AracOzellikleri renaultDizelOtomatik=new AracOzellikleri(107,"Fluence","Renault","Dizel","Otomatik",5,250,"Musait");
        AracOzellikleri wosvagenBenzinOtomatik=new AracOzellikleri(108,"Passat","Wosvagen","Benzin","Otomatik",5,450,"Musait");
        AracOzellikleri wosvagenDizelManuel=new AracOzellikleri(109,"Caddy","Wosvagen","Dizel","Manuel",5,300,"Musait");
        AracOzellikleri wosvagenBenzinManuel=new AracOzellikleri(110,"Bora","Wosvagen","Benzin","Manuel",5,200,"Musait");

        arac.put(101,opelBenzinOtomatik);
        arac.put(102,opelBenzinManuel);
        arac.put(103,hondaBenziOtomatik);
        arac.put(104,fiatBenzinOtomatik);
        arac.put(105,daciaDizelManuel);
        arac.put(106,renaultBenzinOtomatik);
        arac.put(107,renaultDizelOtomatik);
        arac.put(108,wosvagenBenzinOtomatik);
        arac.put(109,wosvagenDizelManuel);
        arac.put(110,wosvagenBenzinManuel);

    }
}
