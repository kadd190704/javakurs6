package Gün21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);

        ArrayList<Integer>notlar=new ArrayList<>();
        int toplam=0;
        String cevap="";
        do {
            System.out.println("not giriniz=");
            int not= okuInt.nextInt();
            notlar.add(not);
            toplam=toplam+not;

            System.out.println("Devam etmek istiyor musunuz(E/H)");
            cevap=okuStr.next();

        }while (cevap.equalsIgnoreCase("E"));//döngünün devam şartı
         //öğretmenin istediği notlar girildi

        //ortalama bulundu
        double ort=toplam/notlar.size();
        System.out.println("ort = " + ort);
        int geçenSayısı=0;//geçen sayısı bulundu
        for (int i = 0; i <notlar.size(); i++) {
            if (notlar.get(i)>ort){
                geçenSayısı++;
            }
        }
        System.out.println("geçenSayısı = " + geçenSayısı);


        //ortalamayı kaç öğrenci geçmiş onu bulacağız.






    }
}
