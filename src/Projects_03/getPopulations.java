package Projects_03;

import java.util.Scanner;

public class getPopulations {

    public static void main(String[] args) {
        /*
Method adı populationOfCountry
    Bu method 1 String array(countryNames) , 1 int array (countryPopulations) ve  1 String (str) alacak

     countryNames Ülke isimleri

     countryPopulations Ülke nüfusları

      Eğer str Ülke isimleri içeriyorsa  Ülke nüfusunu return et

      Ornegin;

      countryNames = {"USA" ,"Mexico" ,"Canada"}

        countryPopulations = {100000 , 120000 , 130000}

        str = "Mexico"

        return 120000 olmali

        NOT : eger str icin verilen ulke countryNames icinde yoksa return -1 olmali

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ülke adının giriniz: ");
        String ulkeadi = scanner.nextLine();

        String[] countryNames = {"USA", "Mexico", "Canada"};
        int[] countryPopulations = {100000, 120000, 130000};

        int sonuc = populationOfCountry(countryNames, countryPopulations, ulkeadi);
        System.out.println(sonuc);
    }
    public static int populationOfCountry(String[] countryNames , int[] countryPopulations , String country){

        int nufus = 0;

        for (int i = 0; i < countryNames.length; i++) {

            if (country.equalsIgnoreCase(countryNames[i])) {
                nufus = countryPopulations[i];
                break;
            } else {
                nufus = -1;
            }

        }
        return nufus;
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir ulke ismi giriniz ");
        String ulkeAdi= scan.nextLine().toUpperCase();

        String[] countryNames =  {"USA" ,"Mexico" ,"Canada", "Korea", "Turkey"};

        int[]  countryPopulations = {100000 , 120000 , 130000, 140000, 150000};

        int sonuc=  populationOfCountry(countryNames,countryPopulations,ulkeAdi);
        System.out.println(sonuc);





    }

    private static int populationOfCountry(String[] countryNames, int[] countryPopulations, String ulkeAdi) {

        int nufus=0;

        for (int i = 0; i <countryNames.length ; i++) {
            if (ulkeAdi.equalsIgnoreCase(countryNames[i])){
                nufus=countryPopulations[i];
                break;

            }else{
                nufus=-1;
            }

        }
        return nufus;
    }
}
