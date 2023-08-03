package Gün21;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
       //dizi,array: boyut sayısı belli,sonradan değiştirilemez
       int[]dizi=new int[5];//5 elemanlı Array, boyutu değiştirilemez

      //Boyutu dinamik olsun,eleman ekledikçe uzasın,sildikçe kısalsın
      //ArrayList: boyutunu baştan vermen gerekmiyot.Boyutu başlangıçta 0
      // eleman ekledikçe artar, sildikçe kısalır.

        ArrayList<Integer>İntegerList=new ArrayList<>();
        ArrayList<String>stringList=new ArrayList<>();
        ArrayList<Double>doubleList=new ArrayList<>();

        ArrayList<String>isimler=new ArrayList<>();
        System.out.println("isimler = " + isimler);

        isimler.add("Ahmet");//uzunluk 1
        isimler.add("Metin");//2
        isimler.add("Burak");//3
        isimler.add("Cansu");//4 //sona erer

        System.out.println("isimler = " + isimler);//yazdır
        System.out.println("isimler.size() = " + isimler.size());//uzunluğunu verir.leght gibi

        isimler.add("Nurhayat");//verilen ındex e ekleniyor,diğerleri bir kayıyor sona doğru
        System.out.println("isimler = " + isimler);
        System.out.println("isimler.size = " + isimler.size());

        isimler.set(1,"Elife");//verilen indexteki elemanı değiştir
        System.out.println("isimler = " + isimler);

        boolean varMı=isimler.contains("Elife");//Elife var mı
        System.out.println("varMı = " + varMı);

        isimler.remove("Ahmet");//değere göre sil
        System.out.println("isimler = " + isimler);

        isimler.remove("Burak");//Burak index e göre sil
        System.out.println("isimler = " + isimler);

     int indexOfMetin=isimler.indexOf("Metin");//Metin in indexi
        System.out.println("indexOfMetin = " + indexOfMetin);

        String ilkEleman=isimler.get(0);
        System.out.println("ilkEleman = " + ilkEleman);

        isimler.clear();
        System.out.println("isimler = " + isimler);
        System.out.println("isimler = " + isimler);











    }
}
