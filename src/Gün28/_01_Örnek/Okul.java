package Gün28._01_Örnek;

import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        //Scanner oku=new Scanner(System.in);

        Öğrenci ogr1=new Öğrenci();

        //1.yol
        ogr1.id=1;
        ogr1.ad="kader";
        ogr1.soyad="taşdemir";
        ogr1.sınıf=6;
        System.out.println("ogr1.ad = " + ogr1.ad);

        //2.yol
        Öğrenci ogr2=new Öğrenci(2,"mehmet","yılmaz",5);
        System.out.println("ogr2.ad = " + ogr2.ad);

        //3.yol
        Öğrenci ogr3=new Öğrenci(3,"Ayşe","Demir");
        System.out.println("ogr3.ad = " + ogr3.ad);
        System.out.println("ogr3.sınıf = " + ogr3.sınıf);









    }
}
