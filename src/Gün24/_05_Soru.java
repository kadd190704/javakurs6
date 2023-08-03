package Gün24;

import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

public class _05_Soru {
    public static void main(String[] args) {
        //Canlı sözlük yapılmak isteniyor
        //Kullanıcıya aşağıdaki gibi menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi alınız ve manasını alınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış
        int seçim=0;
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        Map<String ,String>sözlük=new TreeMap<>();
        //kelime    manası

        do {
            System.out.println("MENÜ\n1-EKLEME\n2-DÜZELTME\n3-LİSTELEME\n4-ARAMA\n5-SİLME\n6-ÇIKIŞ\nSeçiminiz=");
            seçim=okuInt.nextInt();

            switch (seçim){
                case 1:
                    System.out.print("Kelime giriniz=");
                    String kelime=okuStr.nextLine();
                    System.out.print("Anlamı=");
                    String anlamı=okuStr.nextLine();
                    sözlük.put(kelime,anlamı);
                    break;

                case 2:
                    System.out.print("düzeltilecek kelime giriniz=");
                    kelime=okuStr.nextLine();
                    System.out.println("Anlamı=");
                    anlamı=okuStr.nextLine();
                    sözlük.put(kelime,anlamı);
                    break;

                case 3:
                    System.out.println("***Sözlükteki Kelimeler***");
                    for (Map.Entry<String, String>k:sözlük.entrySet())
                        System.out.println(k.getKey()+"-"+k.getValue());
                    break;

                case 4:
                    System.out.print("Aranan kelime giriniz=");
                    kelime=okuStr.nextLine();
                    System.out.println(sözlük.get(kelime));
                    break;

                case 5:
                    System.out.print("Silinecek Kelime giriniz=");
                    kelime=okuStr.nextLine();
                    sözlük.remove(kelime);
                    break;

                case 6:
                    System.out.println("çıkış");
                    break;

                default:
                    System.out.println("Hatalı giriş");
            }

        }while (seçim<6);
    }
}
