package Gün07;

public class _03_StringEquals {
    public static void main(String[] args) {

      //equals: 2 stringin birbirşne eşit olup olmadığını kontrol eder
      //sonuç boolean

      String s1="Merhaba";
      String  s2="MERHABA";

       boolean esitMi=s1.equals(s2);//false
        System.out.println("esitMi = " + esitMi);

      // 2.yol
        System.out.println("esitMi = " +s1.equals(s2));

        System.out.println("esitMi=" +s1.equals("Merhaba"));









    }
}
