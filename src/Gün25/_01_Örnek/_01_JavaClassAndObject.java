package Gün25._01_Örnek;

//class-tiplerinin tanımlandığı yer
public class _01_JavaClassAndObject {

    //metodların yazıldığı yer
    public static void main(String[] args) {//başla
        //ana programın çalıştığı yer
        Öğrenci ogr1=new Öğrenci();
        ogr1.adı="Ahmet";
        ogr1.soyadı="Yılmaz";
        ogr1.sınıfı=6;
        ogr1.okulNo=110;
        ogr1.telefonu="0505888888";

        System.out.println("Adı = " + ogr1.adı);
        System.out.println("ogr1.soyadı = " + ogr1.soyadı);

    }//dur

   //metodların yazılabildiği yer
}
//class-tiplerin tanımlandığı yer
class Öğrenci{
    int okulNo;
    String adı;
    String soyadı;
    int sınıfı;
    String adresi;
    String telefonu;
}