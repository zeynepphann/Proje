package deneme;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Aray Değerlerini Giriniz");
        String myStr=scan.nextLine();
        String [] useThisArray=myStr.split(" ");
        System.out.println(Arrays.toString(useThisArray));
        if(useThisArray.length>=1 && useThisArray[0].equals(useThisArray[useThisArray.length-1]))
        {
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        //2 yöntem
        int [] dizi =  {1, 2, 3};

        System.out.println("Diziyi yazdırıyoruz-->"+dizi[0]+" "+dizi[1]+" "+dizi[2]);

        System.out.println("Diziyi yazdırıyoruz-->"+Arrays.toString(dizi));

        System.out.println("Dizinin ilk elemanı-->"+dizi[0]);//ilk eleman
        System.out.println("Dizinin Son Elemanı-->"+dizi[dizi.length-1]); // dizinin son elemanını ulasmak
        System.out.println(dizi.length);
        if(dizi.length>=0 && dizi[0]==(dizi[dizi.length-1])){
            System.out.println("True");
        }else
            System.out.println("False");

        //3.yöntem Arayi dinamik olusturmak
        Scanner oku = new Scanner(System.in);
        System.out.println("Diziye kaç eleman gireceksiniz");
        int a=oku.nextInt();
        System.out.println("Diziye "+a+" eleman girilecek");
        int dizi1[]=new int[a];
        for (int i=0;i< dizi1.length;i++){
            dizi1[i]=oku.nextInt();
        }
        for (int sayi:dizi1){
            System.out.print(sayi+" ");

        }
        System.out.println("Diziyi yazdırıyoruz-->"+Arrays.toString(dizi1));

    }
}
