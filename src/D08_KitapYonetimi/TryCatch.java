package D08_KitapYonetimi;


import java.util.InputMismatchException;

import static D08_KitapYonetimi.Methods.count;
import static D08_KitapYonetimi.Methods.scan;

public class TryCatch {
    static int entry;
    static String Sentry;
    static int entryX;
    static int viewN;
    static int control;
    public static int intEntry() {
        try {
            entry = scan.nextInt();
            if (entry < 0 || entry > 7) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("PLEASE ENTER A VALID NUMBER");
            scan.nextLine();
            intEntry();
        }
        return entry;
    }

    public static String stringEntry() {
        try {
            Sentry = scan.nextLine().toUpperCase();
            String kontrol = Sentry.replaceAll("\\D", "");
            if (kontrol.length() != 0) {
                throw new InputMismatchException("PLEASE ENTER LETTERS ");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            stringEntry();
        }
        return Sentry;
    }
    public static int entryX() {
        try {
            entryX = scan.nextInt();
            if (entry < 0 || entry > 1000) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("PLEASE ENTER A VALID NUMBER");
            scan.nextLine();
            entryX();
        }
        return entryX;
    }
    public static int viewN() {
        try {
            viewN = scan.nextInt();
            if (viewN< 1000 || entry > count) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("PLEASE ENTER A VALID NUMBER");
            scan.nextLine();
            viewN();
        }
        return viewN;
    }
    public static int control() {
        try {
            control = scan.nextInt();
            if (control<1 || control > 2) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("PLEASE ENTER A VALID NUMBER");
            scan.nextLine();
            control();
        }
        return control;
    }
}
