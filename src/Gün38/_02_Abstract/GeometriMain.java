package Gün38._02_Abstract;

public class GeometriMain {
    public static void main(String[] args) {

        Dikdörtgen d=new Dikdörtgen(5,4);
        d.setName("Yeni Dikdörtgen");
        d.ciz();
        System.out.println(d);

        System.out.println("----------");

        Daire dr=new Daire(4);
        dr.setName("Yeni Daire");
        dr.ciz();
        System.out.println(dr);
    }
}
