package Task1;

public class Main {
    public static void main(String[] args) {
        Therapist therapist = new Therapist();
        Patient patient = new Patient(4);
        therapist.appointDoctor(patient);

    }
}
