package Task1;

public class Therapist extends Doctor{
    @Override
    public void treat() {
        System.out.println("Терапевт обследовал вас, вы здоровы!");
    }
    public void appointDoctor(Patient patient){
        Doctor doctor;
        if(patient.getPlan() == 1){
            doctor = new Surgeon();
        }else if(patient.getPlan() == 2){
            doctor = new Dentist();
        }else{
            doctor = new Therapist();
        }
        doctor.treat();
    }
}
