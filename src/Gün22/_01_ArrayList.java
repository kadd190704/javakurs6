package Gün22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {

   //Array: Arrays metodları, sort
   //ArrayList: Collection Metodları

        ArrayList<Integer>sayılar=new ArrayList<>();
        sayılar.add(50);
        sayılar.add(5);
        sayılar.add(456);
        sayılar.add(45);
        sayılar.add(3);

        System.out.println("sayılar = " + sayılar);

        //sıralama işlemi
        Collections.sort(sayılar);
        System.out.println("sayılar = " + sayılar);

        //tersine çevir
        Collections.reverse(sayılar);
        System.out.println("sayılar = " + sayılar);

        //Bütü elemanları tek bir değerle set atma
        Collections.fill(sayılar,0);
        System.out.println("sayılar = " + sayılar);

        //replace
        Collections.replaceAll(sayılar,0,5);
        System.out.println("sayılar = " + sayılar);

        //tanımlarken değer atama
        int[]dizi={2,3,45,56};
        ArrayList<Integer>liste=new ArrayList<>(Arrays.asList(3,4,6,5,8));
        ArrayList<String>strList=new ArrayList<>(Arrays.asList("ahmet","ayşe","fatma"));

        System.out.println("liste = " + liste);
        System.out.println("strList = " + strList);

        //AddAll:bir veya fazla değerleri liste ekler
        Collections.addAll(sayılar,56,77,88,99,66);
        System.out.println("sayılar = " + sayılar);

        //Bir diziyi nasıl ArrayListe ararım (direkt atama olduğu için eski elemanları siler)
        Integer[]dizi2={3,2,45,56};
        ArrayList<Integer>liste3=new ArrayList<>(Arrays.asList(dizi2));
        System.out.println("liste3 = " + liste3);

























    }
}
