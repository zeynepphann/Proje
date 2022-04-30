package D06_HastaneProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Runner {
    static List<Informations> drInformation = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Informations doctor1 = new Informations("NELSON", "AVERY", "ALLERGIST", "ALLERGY", "NOT URGENT");
        Informations doctor2 = new Informations("JOHN", "ABEL", "NEUROLOGIST", "HEADACHE", "NOT URGENT");
        Informations doctor3 = new Informations("ROBERT", "ERIC", "GENERAL SURGEON", "DIABETES", "NOT URGENT");
        Informations doctor4 = new Informations("MARRY", "JACOB", "CHILD DOCTOR", "FLU", "NOT URGENT");
        Informations doctor5 = new Informations("ALAN", "PEDRO", "INTERNAL MEDICINE", "MIGRAINE", "URGENT");
        Informations doctor6 = new Informations("MAHESH", "TRISTEN", "CARDIOLOGIST", "HEART DISEASES", "URGENT");

        drInformation.add(doctor1);
        drInformation.add(doctor2);
        drInformation.add(doctor3);
        drInformation.add(doctor4);
        drInformation.add(doctor5);
        drInformation.add(doctor6);
        System.out.println("\t\t\tWELCOME");
        System.out.println("\tPLEASE ENTER YOUR NAME AND SURNAME");
        String nameSurname = TryCatchHospital.stringEntry();
        System.out.println("\tPLEASE ENTER YOUR DISEASE");
        String disease = TryCatchHospital.stringEntry();
        System.out.println("\tDOCTOR INFORMATION ABOUT YOUR SITUATION");
        System.out.println("PATIENT: " + nameSurname);
        control(disease);

        for (int i = 0; i < drInformation.size(); i++) {
            if (drInformation.get(i).getSituation().contains(disease)) {
                System.out.println("SITUATION: " + drInformation.get(i).getUrgency());
            }
        }
    }

    private static void print(Informations doctor) {
        System.out.println("DOCTOR: " + doctor.getDoctorName() + " " + doctor.getDoctorSurname() + "\n" + "DEGREE: " + doctor.getDegree());
    }

    private static void control(String disease) {
        drInformation.stream().filter(t -> t.getSituation().contains(disease)).forEach(Runner::print);
    }
}
