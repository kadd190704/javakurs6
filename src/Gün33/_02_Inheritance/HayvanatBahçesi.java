package Gün33._02_Inheritance;

public class HayvanatBahçesi {
    public static void main(String[] args) {

        Kedi kedi1=new Kedi("siyah",3,"tekir");
        System.out.println("kedi1 = " + kedi1);

        kedi1.konuştu();

        Köpek köpek1=new Köpek("kahverengi",30,"kangal");
        System.out.println("köpek1 = " + köpek1);

        köpek1.konuştu();

        Yılan yılan1=new Yılan("siyah",3,"engerek",3);
        yılan1.konuştu();
        System.out.println("yılan1 = " + yılan1);

        Ördek ördek1=new Ördek("yeşil",4,"göl ördeği",5);
        ördek1.konuştu();
        System.out.println("ördek1 = " + ördek1);
    }

}
