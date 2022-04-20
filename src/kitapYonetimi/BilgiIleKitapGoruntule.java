package kitapYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BilgiIleKitapGoruntule {

    public static  void bilgiIleKitapGoruntule() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kitap adini giriniz");
        System.out.println("Lutfen Kitap adi ile arama yapmak icin 1" +
                "\nYazar adi ile arama yapmak icin 2" +
                "\nKitap fiyati ile arama yapmak icin 3 e tiklayin");

        int secim=scan.nextInt();
        switch(secim){
            case 1:
                System.out.println("Kitap adini giriniz");
                String secilenKitap=scan.nextLine();
                for (int i = 0; i <KitapEkle.kitaplar.size() ; i++) {
                    if (KitapEkle.kitaplar.get(i).kitapAdi.equalsIgnoreCase(secilenKitap)){
                        System.out.println("Kitap numarasi: "+KitapEkle.kitaplar.get(i).kitapNo+"\nYazar adi: "+KitapEkle.kitaplar.get(i).yazarAdi+
                                "Kitap fiyati: "+KitapEkle.kitaplar.get(i).kitapFiyati);

                    }
                    else{
                        System.out.println("Girdiginiz kitap adi mevcut degil");
                    }
                }


            case 2:
                System.out.println("Yazar adini giriniz");
                String secilenYazar=scan.nextLine();

                for (int i = 0; i <KitapEkle.kitaplar.size() ; i++) {
                    if (KitapEkle.kitaplar.get(i).yazarAdi.equalsIgnoreCase(secilenYazar)){
                        System.out.println("Kitap numarasi: "+KitapEkle.kitaplar.get(i).kitapNo+"\nKitap adi: "+KitapEkle.kitaplar.get(i).kitapAdi+
                                "Kitap fiyati: "+KitapEkle.kitaplar.get(i).kitapFiyati);

                    }
                    else{
                        System.out.println("Girdiginiz yazarin kitabi mevcut degil");
                    }
                }


            case 3:
                System.out.println("Kitap fiyatini giriniz");
                int secilenFiyat=scan.nextInt();

                for (int i = 0; i <KitapEkle.kitaplar.size() ; i++) {
                    if (KitapEkle.kitaplar.get(i).kitapFiyati==secilenFiyat){
                        System.out.println("Kitap numarasi: "+KitapEkle.kitaplar.get(i).kitapNo+"\nKitap adi: "+KitapEkle.kitaplar.get(i).kitapAdi+
                                "Yazar adi: "+KitapEkle.kitaplar.get(i).yazarAdi);

                    }
                    else{
                        System.out.println("Girdiginiz fiyatta kitabi mevcut degil");
                    }
                }

        }
    }
}
