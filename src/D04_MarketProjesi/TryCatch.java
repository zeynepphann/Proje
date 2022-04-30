package D04_MarketProjesi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    static Scanner scan = new Scanner(System.in);
    static int entry;

    public static int intEntry() {
        try {
            entry = scan.nextInt();
            if (entry<0||entry > Methods.market.size() - 1) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("PLEASE ENTER NUMBER FROM LIST");
            scan.nextLine();
            intEntry();
        }
        return entry;
    }
    public static int intEntryX() {
        try {
            entry = scan.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("PLEASE ENTER NUMBER ");
            scan.nextLine();
            intEntryX();
        }
        return entry;
    }
    public static double doubleEntry() {
        try {
            entry = scan.nextInt();
            if (entry < 0) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("PLEASE ENTER A VALID AMOUNT");
            scan.nextLine();
            doubleEntry();
        }
        return entry;
    }
}
