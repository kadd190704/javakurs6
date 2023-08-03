package Gün24;

import sun.plugin.com.DispatchImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.SplittableRandom;

public class _04_JavaMap {
    public static void main(String[] args) {
        //Bir kartvizit uygulamasını 2 kişi için yapınız

        Map<String,String>ugurKartVizit=new HashMap<>();
        ugurKartVizit.put("isim","Uğur Yılmaz");
        ugurKartVizit.put("email","ugur@gmail.com");
        ugurKartVizit.put("adres","çekmeköy/ istanbul");
        ugurKartVizit.put("telefon","0505666666");

        System.out.println("ugurKartVizit.get(isim) = " + ugurKartVizit.get("isim"));
        System.out.println("ugurKartVizit.get(email) = " + ugurKartVizit.get("email"));

        Map<String,String>zaferKartVizit=new HashMap<>();
        zaferKartVizit.put("isim","Zafer Canlı");
        zaferKartVizit.put("email","zafer@gmail.com");
        zaferKartVizit.put("adres","ümraniye/İstanbul");
        zaferKartVizit.put("telefon","0555666666");

        Map<String, Map<String,String> >kartvizitler=new HashMap<>();

        kartvizitler.put("uğur",ugurKartVizit);
        kartvizitler.put("zafer",zaferKartVizit);

        //zaferin adresi
        System.out.println(kartvizitler.get("zafer").get("adres"));

        //uğurun emaili
        System.out.println(kartvizitler.get("uğur").get("email"));

        for (Map.Entry<String,Map<String, String> >kv :kartvizitler.entrySet())//entrySet() keys+values
        {
            System.out.println("kv = " + kv);
            System.out.println(kv.getValue());
            System.out.println(kv.getValue().get("email"));
        }


    }
}
