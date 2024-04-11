package Task1;

public class Surgeon extends Doctor{
    @Override
    public void treat() {
        System.out.println("Хирург провел операцию, теперь вам необходим постельный режим");
    }
}
