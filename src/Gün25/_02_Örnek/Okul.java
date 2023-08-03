package Gün25._02_Örnek;
//main için kullanılan dosya
public class Okul {
    public static void main(String[] args) {

        Öğrenci ogr1=new Öğrenci();

        ogr1.okulNo=1002;
        ogr1.adı="Mehmet";
        ogr1.soyadı="Demir";

        System.out.println("ogr1.okulNo = " + ogr1.okulNo);
        System.out.println("ogr1.adı = " + ogr1.adı);
        System.out.println("ogr1.soyadı = " + ogr1.soyadı);


    }
}
