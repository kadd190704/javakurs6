package Gün17;

public class _04_CharVeSayı {
    public static void main(String[] args) {

// A hava  bilgisayar için her şey sayı
// A-> 65
// a->97
// Karakter ve karşılık gelen sayıların yer aldığı tablo var.
// A->65 saklıyır    A olarak yazıyor.

     int sayı=65;
        System.out.println("sayı = " + sayı);

        char harf=(char)65;
        System.out.println("harf = " + harf);

        //ascii tablosu
        for (int i = 0; i < 255; i++) {

            harf=(char) i;
            System.out.println(i+"nolu harf = " + harf);
        }























    }
}
