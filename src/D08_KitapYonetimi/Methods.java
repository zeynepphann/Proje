package D08_KitapYonetimi;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Methods {
    static Scanner scan = new Scanner(System.in);
    static Map<Integer, Books> bookList = new TreeMap<>();
    static Books book1 = new Books("NEW MOON", "STEPHENIE MEYER", 15);
    static Books book2 = new Books("ONE DAY", "DAVID NICHOLLS", 16);
    static Books book3 = new Books("LIFE OF PI", "YANN MARTEL", 17);
    static Books book4 = new Books("BIRDSONG", "SEBASTIAN FAULKS", 18);
    static Books book5 = new Books("LABYRINTH", "KATE MOSSE", 19);
    static Books book6 = new Books("MAN AND BOY", "TONY PARSONS", 20);
    static Books book7 = new Books("CHOCOLAT", "JOANNE HARRIS", 21);
    static Books book8 = new Books("BRICK LANE", "MONICA ALI", 22);
    static Books book9 = new Books("THE GHOST", "ROBERT HARRIS", 23);

    public static void list() {
        bookList.put(1001, book1);
        bookList.put(1002, book2);
        bookList.put(1003, book3);
        bookList.put(1004, book4);
        bookList.put(1005, book5);
        bookList.put(1006, book6);
        bookList.put(1007, book7);
        bookList.put(1008, book8);
        bookList.put(1009, book9);
    }

    static int count = 1009;

    public static void menu() {

        System.out.println("\t 1 ADD BOOK\n \t 2 VIEW BOOK BY NUMBER\n \t 3 VIEW BOOK BY INFO\n \t 4 DELETE BOOK BY NUMBER\n \t " +
                "5 DELETE BOOK BY INFO\n \t 6 LIST ALL BOOKS\n \t 7 EXIT");
        int choose = TryCatch.intEntry();
        switch (choose) {
            case 1:
                addBook();
                menu();
                break;
            case 2:
                viewBookByNumber();
                menu();
                break;
            case 3:
                viewBookByInfo();
                menu();
                break;
            case 4:
                deleteBookByNumber();
                menu();
                break;
            case 5:
                deleteBookByInfo();
                menu();
                break;
            case 6:
                listAllBooks();
                menu();
                break;
            case 7:
                exit();
                break;

        }
    }

    private static void addBook() {
        System.out.println("\t PLEASE ADD BOOK NAME");
        scan.nextLine();
        String newBookName = scan.nextLine().toUpperCase();
        System.out.println("\t PLEASE ADD AUTHOR NAME");
        String newAuthorName = TryCatch.stringEntry();
        System.out.println("\t PLEASE ADD BOOK PRICE");
        int newBookPrice = TryCatch.entryX();
        count++;
        Books book10 = new Books(newBookName, newAuthorName, newBookPrice);
        bookList.put(count, book10);
        System.out.println("CODE     NAME            AUTHOR             PRICE");
        System.out.println("*************************************************");
        for (Integer w : bookList.keySet()) {
            System.out.printf("%-8d %-15s %-20s %d\n", w, bookList.get(w).getBookName(), bookList.get(w).getAuthorName(), bookList.get(w).getBookPrice());
            System.out.println("-------------------------------------------------");
        }
        System.out.println("\t BOOK ADDED TO LIST");
    }

    public static void viewBookByNumber() {
        System.out.println("\t PLEASE ENTER BOOK NUMBER");
        int viewNumber = TryCatch.viewN();
        if (bookList.containsKey(viewNumber)) {
            System.out.println("CODE     NAME            AUTHOR             PRICE");
            System.out.printf("%-8d %-15s %-20s %d\n", viewNumber, bookList.get(viewNumber).getBookName(), bookList.get(viewNumber).getAuthorName(), bookList.get(viewNumber).getBookPrice());
            System.out.println("-------------------------------------------------");
        }
    }


    private static void viewBookByInfo() {
        System.out.println("\t PRESS 1 TO ENTER INFORMATIONS BY THE NAME OF THE BOOK\n\t PRESS 2 TO ENTER INFORMATION BY THE AUTHOR'S NAME");
        int viewInfo = TryCatch.control();
        scan.nextLine();
        if (viewInfo == 1) {
            System.out.println("\tPLEASE ENTER THE NAME OF THE BOOK YOU WANT TO VIEW");
            String viewInfoBook = TryCatch.stringEntry();
            for (Integer w : bookList.keySet()) {
                if (bookList.get(w).getBookName().equals(viewInfoBook)) {
                    System.out.println("CODE     NAME            AUTHOR             PRICE");
                    System.out.printf("%-8d %-15s %-20s %d\n", w, bookList.get(w).getBookName(), bookList.get(w).getAuthorName(), bookList.get(w).getBookPrice());
                    System.out.println("-------------------------------------------------");
                }
            }
        } else {
            System.out.println("\tPLEASE ENTER THE AUTHOR'S NAME OF THE BOOK YOU WANT TO VIEW");
            String viewInfoBook = TryCatch.stringEntry();
            for (Integer w : bookList.keySet()) {
                if (bookList.get(w).getAuthorName().equals(viewInfoBook)) {
                    System.out.println("CODE     NAME            AUTHOR             PRICE");
                    System.out.printf("%-8d %-15s %-20s %d\n", w, bookList.get(w).getBookName(), bookList.get(w).getAuthorName(), bookList.get(w).getBookPrice());
                    System.out.println("-------------------------------------------------");
                }
            }
        }
    }

    private static void deleteBookByNumber() {
        System.out.println("\t PLEASE ENTER BOOK NUMBER");
        int viewNumber = TryCatch.viewN();
        if (bookList.containsKey(viewNumber)) {
            System.out.println("CODE     NAME            AUTHOR             PRICE");
            System.out.printf("%-8d %-15s %-20s %d\n", viewNumber, bookList.get(viewNumber).getBookName(), bookList.get(viewNumber).getAuthorName(), bookList.get(viewNumber).getBookPrice());
            System.out.println("-------------------------------------------------");
            System.out.println("\t BOOK DELETED FROM LIST");
            bookList.remove(viewNumber);
        }
    }

    private static void deleteBookByInfo() {
        System.out.println("\t PRESS 1 TO ENTER INFORMATIONS BY THE NAME OF THE BOOK\n\t PRESS 2 TO ENTER INFORMATION BY THE AUTHOR'S NAME");
        int viewInfo = TryCatch.control();
        scan.nextLine();
        if (viewInfo == 1) {
            System.out.println("\tPLEASE ENTER THE NAME OF THE BOOK YOU WANT TO DELETE");
            String viewInfoBook = TryCatch.stringEntry();
            for (Integer w : bookList.keySet()) {
                if (bookList.get(w).getBookName().equals(viewInfoBook)) {
                    System.out.println("CODE     NAME            AUTHOR             PRICE");
                    System.out.printf("%-8d %-15s %-20s %d\n", w, bookList.get(w).getBookName(), bookList.get(w).getAuthorName(), bookList.get(w).getBookPrice());
                    System.out.println("-------------------------------------------------");
                    System.out.println("\t BOOK DELETED FROM LIST");
                    bookList.remove(w);
                }
            }
        } else {
            System.out.println("\tPLEASE ENTER THE AUTHOR'S NAME OF THE BOOK YOU WANT TO DELETE");
            String viewInfoBook = TryCatch.stringEntry();
            for (Integer w : bookList.keySet()) {
                if (bookList.get(w).getAuthorName().equals(viewInfoBook)) {
                    System.out.println("CODE     NAME            AUTHOR             PRICE");
                    System.out.printf("%-8d %-15s %-20s %d\n", w, bookList.get(w).getBookName(), bookList.get(w).getAuthorName(), bookList.get(w).getBookPrice());
                    System.out.println("-------------------------------------------------");
                    System.out.println("\t BOOK DELETED FROM LIST");
                    bookList.remove(w);
                }
            }
        }
    }

    private static void listAllBooks() {
        System.out.println("CODE     NAME            AUTHOR             PRICE");
        System.out.println("*************************************************");
        for (Integer w : bookList.keySet()) {
            System.out.printf("%-8d %-15s %-20s %d\n", w, bookList.get(w).getBookName(), bookList.get(w).getAuthorName(), bookList.get(w).getBookPrice());
            System.out.println("-------------------------------------------------");
        }
    }

    private static void exit() {
        System.out.println("BYE CANIM BIDAHA GEL");
    }
}
