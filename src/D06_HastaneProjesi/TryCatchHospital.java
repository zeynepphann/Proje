package D06_HastaneProjesi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchHospital {
    static Scanner scan = new Scanner(System.in);
    static String entry;

    public static String stringEntry() {
        try {
            entry = scan.nextLine().toUpperCase();
            String kontrol = entry.replaceAll("\\D", "");
            if (kontrol.length() != 0) {
                throw new InputMismatchException("PLEASE ENTER LETTERS ");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            stringEntry();
        }
        return entry;
    }
}
