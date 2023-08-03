package Gün33._02_Inheritance;

public class Köpek extends Hayvan{

    public Köpek(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konuştu() {
        //super.konuştu();
        System.out.println("köpek havladı");
    }
}
