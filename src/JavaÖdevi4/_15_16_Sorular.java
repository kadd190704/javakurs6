package JavaÖdevi4;

import java.util.Scanner;

public class _15_16_Sorular {
    public static void main(String[] args) {

      //15.SORU
      String text1="Dünya";
      System.out.println("text1 boş mu = " + text1.isEmpty());

      //16.SORU
        Scanner oku=new Scanner(System.in);
        System.out.println("Kelime gir=");
        String kelime=oku.nextLine();

        int uzunluk=kelime.length();
        System.out.println("uzunluk = " + kelime.length());
        char ilkHarf=kelime.charAt(0);
        System.out.println("ilkHarf = " + ilkHarf);
        char sonHarf=kelime.charAt(uzunluk-1);
        System.out.println("sonHarf = " + sonHarf);

















    }
}
