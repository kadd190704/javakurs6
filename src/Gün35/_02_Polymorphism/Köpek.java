package Gün35._02_Polymorphism;

public class Köpek extends Hayvan {
    public Köpek(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println("havladı");
    }
    public void koku(){
        System.out.println("kokladı");
    }
}
