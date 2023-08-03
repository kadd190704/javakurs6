package gün04;

public class _03_WideningCasting {
    public static void main(String[] args) {

      //1. küçük alanı= büyüğe atabiliyor(genişleme-Widening)
      // byte-> short-> int-> long->flood-> double
      // veri kaybı kesinlikle yok

      int sayı= 9;
      long toplam= 6700;
      double oran= 3.2;

      oran= sayı; // int-> double geniş hafızaya atılıyor
         System.out.println("oran = " + oran); // veri kaybı yok 9.0
      toplam= sayı; //int-> long
        System.out.println("toplam = " + toplam);// veri kaybı yok 9
       oran= toplam; // long->double
        System.out.println("oran = " + oran);// veri kaybı yok 9.0

    }
}
