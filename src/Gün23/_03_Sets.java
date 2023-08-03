package Gün23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String>renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("RED");

        System.out.println("renkler = " + renkler);

        //Ekrana tek tek nasıl yazdırırım
        for (String eleman:renkler){//sıra garanti değil
            System.out.println("eleman = " + eleman);
        }
        //foreach (ismi) kullanımı
        int[]dizi={34,90,87,7,56,77};
        for (int eleman: dizi)
            System.out.println("eleman = " + eleman);

        ArrayList<Integer>liste=new ArrayList<>();
        for (Integer e:liste)
            System.out.println("e = " + e);

        /**********************************/

     //set in kendi sırası nasıl ise onun aynısını verir
     Iterator gösterge=renkler.iterator();
     while (gösterge.hasNext())//sırada eleman var ise
     {
         System.out.println("gösterge.next() = " + gösterge.next());
         //.Next göstergenin gösterdiği elemanı temsil ediyor
     }







    }
}
