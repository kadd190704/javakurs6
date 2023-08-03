package gün04;

public class _01_JavaString {
    public static void main(String[] args) {

        int sayac = 0; // int tipi, sayac adı,0 başlangıc değeri
        String ad = "İsmet"; //kelime veya kelimeler saklayacksa String
        //kullanılacaktır.

        System.out.println("sayac = " + sayac);// 0 yazar
        System.out.println("ad = " + ad);// İsmet yazacak
        String soyad = "temur";
        System.out.println("soyad = " + soyad);

        String tamAd = ad + " " + soyad; //+ işareti sayılarda toplar
        // kelimelerde yan yana birleştirir.
        System.out.println("tamAd = " + tamAd);// ismet temur


    }
}
