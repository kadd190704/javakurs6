package Gün08;

public class _04_JavaAritmeticOperators {
    public static void main(String[] args) {


      int a=9;
      int b=5;

        System.out.println("Toplama işlemi");
        System.out.println("a+b sonucu= " + (a+b));

        System.out.println("Çıkartma işlemi");
        System.out.println("a-b sonucu = " + (a-b));

        System.out.println("Çarpam işemi");
        System.out.println("a*b sonucu = " + (a*b));

        System.out.println("Bölme işlemi");
        System.out.println("a/b sonucu = " + (a/b));
        //normal sonuç 1.8, fakat bilgisayar 2 si de tam sayı tipinde ise, küsüratı atar
        //bu sebeple sonuç 1 olur, yuvarlama yapmaz, int/int=int
        //küsüratlı sonuç istiyorsan, işleme girnenlerden en az birisi double olmalı
        System.out.println("(double)a/b sonucu = " + (a/(double)b));
          //*********/

        System.out.println("Modül işlemi: bölümünden kalan demek");
        System.out.println("a%b  = " +(a%b));//4
        System.out.println("b%a = " + (b%a));//5









































    }
}
