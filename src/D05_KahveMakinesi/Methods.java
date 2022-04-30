package D05_KahveMakinesi;

import java.util.HashMap;
import java.util.Map;

public class Methods {

    static Map<Integer, Coffee> coffees = new HashMap<>();
    static String milky;
    static String sugarly = " SUGAR";
    static int hMSugar;
    static String size;
    static int choose;

    public static void machine() {
        Coffee coffe1 = new Coffee("TURKISH COFFEE");
        Coffee coffe2 = new Coffee("FILTER COFFEE");
        Coffee coffe3 = new Coffee("ESPRESSO");

        coffees.put(1, coffe1);
        coffees.put(2, coffe2);
        coffees.put(3, coffe3);
        System.out.println("\t\t\t WELCOME");
        System.out.println("CODE  COFFEES   ");
        System.out.println(" ");
        for (Integer w : coffees.keySet()) {
            System.out.printf("%-5d %-15s \n", w, coffees.get(w).getCoffee());
        }
        System.out.println("\nPLEASE ENTER THE CODE OF THE COFFE YOU WANT TO BUY");
        choose = TryCatch2.intEntry();

        if (coffees.containsKey(choose)) {
            System.out.println(coffees.get(choose) + "IS BEING PREPARED");
            milk();
            sugar();
            size();

        } else {
            machine();
        }
    }

    private static void size() {
        System.out.println("\tWHAT SIZE WOULD YOU LIKE COFFEE ? ( SHORT - TALL - GRANDE )");
        String sizeChoose = TryCatch2.stringEntry();
        if (sizeChoose.equalsIgnoreCase("short")) {
            size = "SHORT SIZE";
            System.out.println(size + " " + hMSugar + " " + sugarly + " " + coffees.get(choose) + milky + " IS PREPARED. BYEE");
        } else if (sizeChoose.equalsIgnoreCase("tall")) {
            size = "TALL SIZE";
            System.out.println(size + " " + hMSugar + " " + sugarly + " " + coffees.get(choose) + milky + " IS PREPARED. BYEE");
        } else if (sizeChoose.equalsIgnoreCase("grande")) {
            size = "GRANDE SIZE";
            System.out.println(size + " " + hMSugar + " " + sugarly + " " + coffees.get(choose) + milky + " IS PREPARED. BYEE");
        } else {
            System.out.println("PLEASE ENTER A VALID AMOUNT");
            size();
        }
    }

    private static void sugar() {
        System.out.println("\t WOLD YOU LIKE TO ADD SUGAR? (ANSWER YES OR NO) ");
        String sugar = TryCatch2.stringEntry();
        if (sugar.equalsIgnoreCase("yes")) {
            System.out.println("\tHOW MUCH SUGAR DO YOU WANT?");
            hMSugar = TryCatch2.intEntryX();
            System.out.println(hMSugar + " " + sugarly + " " + coffees.get(choose) + milky + " IS BEING PREPARED");
        } else if (sugar.equalsIgnoreCase("no")) {
            System.out.println(hMSugar + sugarly + " " + coffees.get(choose) + milky + " IS BEING PREPARED");
        } else {
            System.out.println("\tPLEASE ENTER A VALID AMOUNT");
            sugar();
        }
    }

    private static void milk() {
        System.out.println("\t WOLD YOU LIKE TO ADD MILK? (ANSWER YES OR NO) ");
        String milk = TryCatch2.stringEntry();
        if (milk.equalsIgnoreCase("yes")) {
            milky = "WITH MILK";
            System.out.println(coffees.get(choose) + " " + milky + " IS BEING PREPARED");
        } else if (milk.equalsIgnoreCase("no")) {
            milky = "MILK FREE";
            System.out.println(milky + " " + coffees.get(choose) + " IS BEING PREPARED");
        } else {
            System.out.println("\tPLEASE WRITE A VALID SELECTION");
            milk();
        }
    }
}