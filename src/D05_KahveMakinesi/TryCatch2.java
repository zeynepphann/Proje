package D05_KahveMakinesi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch2 {
    static Scanner scan = new Scanner(System.in);
    static int Ientry;
    static String Sentry;

    public static int intEntry() {
        try {
            Ientry = scan.nextInt();
            scan.nextLine();
            if (Ientry > Methods.coffees.size()) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("PLEASE ENTER NUMBER FROM LIST");
            scan.nextLine();
            intEntry();
        }
        return Ientry;
    }

    public static String stringEntry() {
        try {
            Sentry = scan.nextLine();
            String control1 = Sentry.replaceAll("\\D", "");
            String control2 = Sentry.replaceAll("\\w", "");
            if (control1.length() != 0 || control2.length() != 0) {
                throw new InputMismatchException("PLEASE WRITE A VALID SELECTION");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            scan.nextLine();
            stringEntry();
        }
        return Sentry;
    }

    public static int intEntryX() {
        try {
            Ientry = scan.nextInt();
            scan.nextLine();
            if (Ientry < 0 || Ientry > 20) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("PLEASE ENTER A REASONABLE AMOUNT");
            scan.nextLine();
            intEntryX();
        }
        return Ientry;
    }
}