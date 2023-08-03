package Gün17;

import java.util.Arrays;

public class _06_JavaArrayMetodlar {
    public static void main(String[] args) {

      String[]isimler={"Ahmet","Zeynep","Roman","Kaya","Cihan"};

      //diziyi direk ekrana yazdırmak için
        System.out.println("isimler = " + Arrays.toString(isimler));

       int []a={1,8,3,9};
        System.out.println("a = " +Arrays.toString(a) );

      //dizi sıralama
      Arrays.sort(isimler);
        System.out.println("isimler = " +Arrays.toString(isimler));

        //Diziler Eşit mi
        int[]b={1,8,3,9,};
        int[]c={1,3,8,9};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a, b));
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a, c));

       //contains gibi çalışır,içerisinde ifade var ise pozitif sayı verir,yok ise negatif
        //sadece sıralı dizilerde çalışır
        System.out.println("Arrays.binarySearch(a,3) = " + Arrays.binarySearch(a, 3));
        System.out.println("Arrays.binarySearch(c,3) = " + Arrays.binarySearch(c, 3));

        //Diziyi hızlıca bir değerle doldurmak
        Arrays.fill(a,5);
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));















    }
}
