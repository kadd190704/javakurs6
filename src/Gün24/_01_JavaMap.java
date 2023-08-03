package Gün24;

import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {
    //Set-> HashSet,LinkedHasSet,TreeSet
    //Map-> HasMab,linkedHasMap,TreeMap
    //Map-> Anahtar+Set->Anahtarlı Set(Tekrar eden anahtarlar yok)

        //anahtarın tipi Intager, değerin tipi String
        HashMap<Integer,String>hm=new HashMap<>();

        hm.put(1001,"Kader Taşdemir");
        hm.put(1002,"Derya Demir");
        hm.put(2001,"Birgül Duran");
        hm.put(5001,"Elife Sözen");
        hm.put(1001,"Seda Parça");

        System.out.println("hm = " + hm);

        System.out.println("hm.get(2001) = " + hm.get(2001));
        System.out.println("hm.get(5001) = " + hm.get(5001));

        System.out.println("hm.containsKey(2001) = " + hm.containsKey(2001));//içinde bu sayılı kişi var mı containsKey-containsValue
        System.out.println("hm.containsKey(5002) = " + hm.containsKey(5002));

        System.out.println("hm.keySet() = " + hm.keySet());//keyleri toplu verir
        System.out.println("hm.values() = " + hm.values());//değerler toplu verir

        hm.remove(5001);//siliyor
        System.out.println("hm = " + hm);




    }
}
