package Interview_Sorulari01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

          /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
         Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */
        List<Integer> sayi = new ArrayList<>();
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");


        armstrongSayi(sayi);
        kontrolIslemi(sayi);


    }

    private static void kontrolIslemi(List<Integer> sayi) {
        for (int i = 0; i <sayi.size() ; i++) {

        }

    }

    // allMatch(t -> t.length() <= 7) ? "list elemanları 7 ve daha az harften olusuyor" : "list elemanları 7 harften  buyuk");

    private static void armstrongSayi(List<Integer> sayi) {
        //sayi.
            //    stream().map(t->t*t*t).allMatch()

    }


}
