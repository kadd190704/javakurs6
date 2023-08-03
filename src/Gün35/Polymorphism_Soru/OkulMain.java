package Gün35.Polymorphism_Soru;

public class OkulMain {
    public static void main(String[] args) {
         Öğrenci ogr=new Öğrenci("ayşe","yılmaz","öğrenci","5A");
         Çalışan cal=new Çalışan("ali","demir","tester","IT");

         Kişi.kimlikBelgesiYazdır(ogr);
         Kişi.kimlikBelgesiYazdır(cal);
    }
}
