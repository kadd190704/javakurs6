package Gün18;

import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {

     int sayı=0; //1 tane sayı
     int[] dizi=new int[100];//100 sayı

     int[]ders1Not=new int[50];//50 kişilik ders1 in notları
     int[]ders2Not=new int[50];//50 kişilik ders2 nin notları
     int[]ders3Not=new int[50];//50 kişilik ders3 ün notları

     int[][]tümDersNotları=new int[3][50];//3 tane 50 lik sayı tutabiliyor

     ders1Not[0]=80; //tek boyutlu dizinin tek elemanı

     tümDersNotları[0][0]=80; //2 indexle gösterilir,tablonun ilk elemanı

        System.out.println("tümDersNotları[0][0] = " + tümDersNotları[0][0]);

        Scanner oku=new Scanner(System.in);
        tümDersNotları[0][0]= oku.nextInt();

















    }
}
