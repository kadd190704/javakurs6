package Gün06;

public class _06_StringIndexOf {
    public static void main(String[] args) {

      //IndexOf: verilen karakterlerin indexini verir
      //01234: harflerin oda numarası

      String cümle="Merhaba Dünya";
      //h nin oda numarası kaç   3
        // a nın oda numarası kaç  4
        //Dü nin indexi kaç   8


        System.out.println("cümle.indexOf(M) = " + cümle.indexOf("M"));
        System.out.println("cümle.indexOf(h) = " +cümle.indexOf("h") );
        System.out.println("cümle.indexOf(a) = " +cümle.indexOf("a") );
        System.out.println("cümle.indexOf(Dü) = " +cümle.indexOf("Dü"));
        System.out.println("cümle.indexOf( )= " +cümle.indexOf(" "));
        System.out.println("cümle.indexOf(A) = " +cümle.indexOf("A") );

        System.out.println("cümle.inndexOf(a,5) = " +cümle.indexOf("a",5) );//5 nolu indexten sonra a hangi odada
















    }
}
