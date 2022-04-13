package deneme;

import java.util.Scanner;

public class testHc {
    public static void main(String[] args) {



        System.out.println("Merhaba Java\nHasan Çobanoğlu\tW3soruları");

        System.out.println("\nJava Version: "+System.getProperty("java.version"));
        System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
        System.out.println("Java Home: "+System.getProperty("java.home"));
        System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = input.nextInt();
        System.out.print("Input the second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;

        System.out.println();
        System.out.println("2.Soru....");
        System.out.println("Sum: " + sum);
        System.out.println("Bölüm: " + (num1 / num2));

        System.out.println();
        System.out.println("3.Soru...");
    /*Verilenleri int olarak bir değişkene atayıp değişkenlerde işlem
    yaptık ve soutla yazdırdık
    a. -5 + 8 * 6
    b. (55+9) % 9
    c. 20 + -3*5 / 8
    d. 5 + 15 / 3 * 2 - 8 % 3
    */

   int w = -5 + 8 * 6;
   int x = (55 + 9) % 9;
   int y = 20 + (-3 * 5 / 8);
   int z = 5 + 15 / 3 * 2 - 8 % 3;

   System.out.print(w + "\n" + x + "\n" + y + "\n" + z);

  System.out.println();
  System.out.println("4.Soru....Çarpım");
  System.out.println(num1 + " x " + num2 + " = " + num1 * num2);

  System.out.println();
  System.out.println("5.Soru....Kalan");
  System.out.println(num1 + " % " + num2 + " = " + num1 % num2);


  Scanner scan = new Scanner (System.in);
  System.out.println("Çarpım tablosu: ");
  int sayi = scan.nextInt();

  for(int i=1;i<=10; i++){

    System.out.println(sayi+"*"+i+"="+(sayi*i));

  }

        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");

        System.out.println("9.Soru******");
        System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));

        System.out.println("10.Dairenin Çevresi/ Alanı");

        Scanner io = new Scanner(System.in);
        System.out.println("Input the radius of the circle: ");
        double radius = io.nextDouble();

        System.out.println("Perimeter is = " + (2 * radius * Math.PI));
        System.out.println("Area is = " + (Math.PI * radius * radius));

        System.out.println("11.Soru ortalama");

        double toplam = 0;
        double x1 = 1;
        Scanner oku = new Scanner(System.in);
        System.out.println("Ortalaması İstenilen Sayı Adedini Giriniz : ");
        int sayi1 = oku.nextInt();

        while (x1 <= sayi1) {
            System.out.println("Input number " + "("+ (int) x1 +")" + ":");
            toplam += scan.nextInt();
            x1 += 1;
        }
        double avgn = (toplam / sayi1);

        System.out.println("Average:" + avgn);

        System.out.println("13.Soru diktörtgen alan çevre");
        final double width = 5.6;
        final double height = 8.5;

        double perimeter = 2*(height + width);

        double area = width * height;

        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);

        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);

        String p1 = "==================================";
        String p2 = "==================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }

        System.out.println("==================================");
        System.out.println("==================================");
        System.out.println("=====******=======================");
        System.out.println("===*        *  ===================");
        System.out.println("===*           ===================");
        System.out.println("===*           ===================");
        System.out.println("===*           ===================");
        System.out.println("===*           ===================");
        System.out.println("===*         * ===================");
        System.out.println("==== * * * *   ===================");
        System.out.println("==================================");
        System.out.println("==================================");

        System.out.println("Swap Örneği");
        int a, b, temp;
        a = 15;
        b = 27;
        System.out.println("Before swapping : a, b = "+a+", "+ + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a, b = "+a+", "+ + b);

        //Toplama yöntemi
        System.out.println("Before swapping : a, b = "+a+", "+ + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping : a, b = "+a+", "+ + b);

        //Yüz yazdırma arayle
        String[] arra = new String[5];

        arra[0] = " +\"\"\"\"\"+ ";
        arra[1] = "[| o o |]";
        arra[2] = " |  ^  |";
        arra[3] = " | '-' |";
        arra[4] = " +-----+";

        for (int i = 0; i < 5; i++) {
            System.out.println(arra[i]);
        }
        System.out.println("Stringi tersden yazdırma");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] letters = scanner.nextLine().toUpperCase().toCharArray();
        System.out.print("Reverse string: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.print("\n");
    }
}