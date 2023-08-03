package Gün23;

import java.util.HashSet;

public class _06_Sets {
    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        HashSet<Integer> setB = new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        System.out.println("setA = " + setA);
        System.out.println("setB = " + setB);

        //Birleştirme
        HashSet<Integer>birleşikHali=new HashSet<>();
        birleşikHali.addAll(setA);
        birleşikHali.addAll(setB);
        System.out.println("birleşikHali = " + birleşikHali);

        //farkı
        HashSet<Integer>farkı=new HashSet<>();
        farkı.addAll(setA);
        farkı.remove(setB);//A dan B yi çıkar
        System.out.println("farkı = " + farkı);

        //Kesişim, ortak elemanlar

        HashSet<Integer>ortakElemanlar=new HashSet<>();
        ortakElemanlar.addAll(setA);
        ortakElemanlar.addAll(setB);
        System.out.println("ortakElemanlar = " + ortakElemanlar);



















    }










    }

