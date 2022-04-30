package D04_MarketProjesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Methods {
    static Scanner scan = new Scanner(System.in);
    static Map<Integer, Objects> market = new HashMap<>();
    static double sum;

    static Objects product0 = new Objects("TOMATO", 2.10);
    static Objects product1 = new Objects("POTATO", 3.20);
    static Objects product2 = new Objects("PEPPER", 1.50);
    static Objects product3 = new Objects("ONION", 2.30);
    static Objects product4 = new Objects("CARROT", 3.10);
    static Objects product5 = new Objects("APPLE", 1.20);
    static Objects product6 = new Objects("BANANA", 1.20);
    static Objects product7 = new Objects("STRAWBERRY", 6.20);
    static Objects product8 = new Objects("MELON", 4.30);
    static Objects product9 = new Objects("GRAPE", 2.70);
    static Objects product10 = new Objects("LEMON", 0.50);
    public static void cart() {

        market.put(0, product0);
        market.put(1, product1);
        market.put(2, product2);
        market.put(3, product3);
        market.put(4, product4);
        market.put(5, product5);
        market.put(6, product6);
        market.put(7, product7);
        market.put(8, product8);
        market.put(9, product9);
        market.put(10, product10);

        System.out.println("\t\t\t WELCOME");
        System.out.println("CODE  PRODUCTS        PRICE");
        System.out.println(" ");
        for (Integer w : market.keySet()) {
            //println ile System.out.println(market.get(w).toString); seklinde yazilabilir
            System.out.printf("%-5d %-15s %-5.2f \n", w, market.get(w).getproductName(), market.get(w).getproductPrice());
        }
        System.out.println("\tPLEASE ENTER THE CODE OF THE PRODUCTS YOU WANT TO BUY");
        int choose = TryCatch.intEntry();

        System.out.println("\tPLEASE ENTER AMOUNT");
        double kg = TryCatch.doubleEntry();
        sum += market.get(choose).getproductPrice() * kg;
        System.out.printf("\tPRICE OF YOUR CHOOSE: %5.2f\n", market.get(choose).getproductPrice() * kg);
        control(choose, kg);

    }

    private static void control(int choose, double kg) {

        System.out.println("\tPRESS 1 KEY TO CONTINUE SHOPPING AND 2 KEY TO EXIT");
        int choose2 = TryCatch.intEntryX();
        if (choose2 == 1) {
            cart();
        } else if (choose2 == 2) {
            System.out.printf("\tTOTAL PRICE: %5.2f\n", sum);
            System.out.println("\t HAVE A NICE DAY.");
        } else {
            control(choose, kg);
        }
    }
}
