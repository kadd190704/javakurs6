package Gün42;

import java.util.Arrays;

public class _02_JavaVeriTipleri {
    public static void main(String[] args) {

        //ilkel tip,primitive tip : short, bte,long,double, boolen
        int sayı1=5;
        int sayı2=12;

        sayı1=sayı2; //sayı1=12, sayı2 nin değeri alındı ve
        sayı1=34;
        sayı2=45;
        System.out.println("sayı1 = " + sayı1);
        System.out.println("sayı2 = " + sayı2);

        //Referans tipleri :class, diziler, Arrayler, nesneler
        //ismi ayrı değerleri ayrı tutuyor
        int[] dizi1={1,2,3,4};
        int[] dizi2={5,6};
        System.out.println("dizi1 ="+ Arrays.toString(dizi1));//1,2,3,4
        System.out.println(" dizi2 ="+Arrays.toString(dizi2));//5,6

        dizi1=dizi2;//referanslar eşitlendi
        System.out.println("dizi1 ="+ Arrays.toString(dizi1));//5,6
        System.out.println(" dizi2 ="+Arrays.toString(dizi2));//5,6

        dizi1[0]=67;
        System.out.println("dizi1 ="+ Arrays.toString(dizi1));//67,6
        System.out.println(" dizi2 ="+Arrays.toString(dizi2));//67,6

        dizi2[0]=55;
        System.out.println("dizi1 ="+ Arrays.toString(dizi1));//55,6
        System.out.println(" dizi2 ="+Arrays.toString(dizi2));//55,6

        //Nesne Tipler :NULL alabilen, ilkel tip
        //String ,Double,Long, Intager
        String ad1="mehmet";
        String ad2="ismet";

        ad1=ad2;//ismet değeri kopyalandı, verildi
        System.out.println("ad1 = " + ad1);
        System.out.println("ad2 = " + ad2);

        ad1="ali";
        System.out.println("ad1 = " + ad1);
        System.out.println("ad2 = " + ad2);

        ad2="Zeynep";
        System.out.println("ad1 = " + ad1);
        System.out.println("ad2 = " + ad2);













    }
}
