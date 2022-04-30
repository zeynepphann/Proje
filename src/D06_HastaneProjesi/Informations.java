package D06_HastaneProjesi;

public class Informations {
    private String doctorName;
    private String doctorSurname;
    private String degree;
    private String situation;
    private String urgency;

    public String getDoctorName() {
        return doctorName;
    }

    public String getDoctorSurname() {
        return doctorSurname;
    }

    public String getDegree() {
        return degree;
    }

    public String getSituation() {
        return situation;
    }


    public String getUrgency() {
        return urgency;
    }


    public Informations(String doctorName, String doctorSurname, String degree, String situation, String urgency) {
        this.doctorName = doctorName;
        this.doctorSurname = doctorSurname;
        this.degree = degree;
        this.situation = situation;
        this.urgency = urgency;
    }

}
