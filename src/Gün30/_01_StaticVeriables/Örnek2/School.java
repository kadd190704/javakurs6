package Gün30._01_StaticVeriables.Örnek2;

public class School {
    public static void main(String[] args) {
        Student ogr1=new Student(1,"ismet temur");
        Student ogr3=new Student(2,"kader taş");
        Student ogr2=new Student(3,"mahir taş");

        //Problem: hem id yi takip etmek zorundayım
        //hem de hata olasılığı yüksek

        Student ogr10=new Student("ismet");
        Student ogr11=new Student("kader");
        Student ogr12=new Student("mahir");


        System.out.println("ogr10 = " + ogr10);//1
        System.out.println("ogr11 = " + ogr11);//2
        System.out.println("ogr12 = " + ogr12);//3


    }
}
