package Gün35._02_Polymorphism;

public class Kedi extends Hayvan {
    public Kedi(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println("miyavladı");
    }
    public void tırmalama(){
        System.out.println("tırmaladı");
    }
}
