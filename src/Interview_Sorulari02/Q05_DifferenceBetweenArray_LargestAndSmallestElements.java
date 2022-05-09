package Interview_Sorulari02;

import java.util.Scanner;

public class Q05_DifferenceBetweenArray_LargestAndSmallestElements {
    public static void main(String[] args) {
         /*
 Create a function that takes an array and the difference between the largest
 and the smallest numbers.
 Ask user to enter array elements.
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
        elemanFarkiBul();
    }

    private static void elemanFarkiBul() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen istediginiz arrayin eleman sayisini giriniz");
        int elemanSayisi= scanner.nextInt();
        int arr[]=new int[elemanSayisi];


        int enKucukSayi= Integer.MAX_VALUE;
        int enBuyukSayi= Integer.MIN_VALUE;


        for (int i = 0; i<elemanSayisi; i++) {
            System.out.println((i+1)+". sayiyi giriniz");

            arr[i] = scanner.nextInt();
            if(arr[i]<enKucukSayi){
                enKucukSayi=arr[i];
            }
            if (arr[i]>enBuyukSayi){
                enBuyukSayi=arr[i];
            }

        }

        System.out.println("En buyuk ve en kucuk sayinin farki: " + (enBuyukSayi-enKucukSayi));

    }



}

