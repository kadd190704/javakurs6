package JavaDizilerÖdev;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {

     //SORU 1:
     //   Bu String'i oluşturun. "Removes white space from both ends of a string"

       // String'deki kelime sayısını yazdırınız.


        String str="Removes white space from both ends of a String";
        //Baştaki ve sondaki boşlukları kaldıralım.
        String trimmedStr=str.trim();

        String[] kelime=trimmedStr.split("");
        int kelimeCount= kelime.length;

        System.out.println("kırpılmış hali = " + trimmedStr);
        System.out.println("kelime sayısı = " + kelimeCount);








    }
}
