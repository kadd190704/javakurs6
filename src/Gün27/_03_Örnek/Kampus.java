package Gün27._03_Örnek;

public class Kampus {
    public static void main(String[] args) {

        Student.universiteKuralları();

        Lesson ders1=new Lesson();
        Lesson ders2=new Lesson();
        Lesson ders3=new Lesson();


        ders1.name="Algoritma";
        ders1.saat=6;
        ders2.name="Java";
        ders2.saat=6;
        ders3.name="Test Tool";
        ders3.saat=8;

        Student ogr1=new Student();
        ogr1.name="Kader";
        ogr1.maxSaat=20;

        ogr1.dersleri.add(ders1);
        ogr1.dersleri.add(ders2);
        ogr1.dersleri.add(ders3);

        ogr1.dersYazdır();

    }
}
