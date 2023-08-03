package JavaDizilerÖdev;

public class _02_Soru {
    public static void main(String[] args) {
        //SORU 2:

        //  Bir String oluşturun : "Hello World"

        //  Stringi tersten yazdırın ve print edin.

        //  _Cevap böyle olmalı :  "dlroW olleH"_

        String cümle="Hello World";
        String ters="";
        int i;
        for ( i =cümle.length()-1; i>=0 ; i--) {
            ters+=cümle.charAt(i);
        }
        System.out.println("ters = " + ters);









    }
}
