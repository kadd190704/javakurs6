package Gün24;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class _03_JavaMap {
    public static void main(String[] args) {

        HashMap<Integer,String>hm=new HashMap<>();//Map lerden HasMaphm
        hm.put(9,"tilki");
        hm.put(2,"kedi");
        hm.put(30,"köpek");
        hm.put(11,"kuş");
        hm.put(4,"kurt");
        System.out.println("hm = " + hm);//hızlı çalışmak için kendisine göre sıralı

        LinkedHashMap<Integer,String>lhm=new LinkedHashMap<>();//Map lerden LinkedHasMap
        lhm.put(9,"tilki");
        lhm.put(2,"kedi");
        lhm.put(30,"köpek");
        lhm.put(11,"kuş");
        lhm.put(4,"kurt");
        System.out.println("lhm = " + lhm);//eklenme sırasına göre sıralı

        TreeMap<Integer,String>tm=new TreeMap<>();//Map lerden TreeMap
        tm.put(9,"tilki");
        tm.put(2,"kedi");
        tm.put(30,"köpek");
        tm.put(11,"kuş");
        tm.put(4,"kurt");
        System.out.println("tm = " + tm);//herzaman sıralı, kendinden sortlu





    }
}
