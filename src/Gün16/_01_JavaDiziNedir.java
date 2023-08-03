package Gün16;

public class _01_JavaDiziNedir {
    public static void main(String[] args) {

     int sayı=0;

     int ogrNot=0;

     int ogrNot1;
     int ogrNot2;
     int ogrNot3;
     //...
     //...
     //...
     int ogrNot50;

     //bana bir tanımlamada BİRDEN FAZLA değer tutabilen değişkene ihtiyacım var;
     //Çözüm;
     int[] notlar=new int[50]; //50 tane int saklayabilen notlar isimli değişken.

     notlar[0]=75;
     notlar[1]=88;
     //...
     //...
     notlar[49]=95; // en son eleman sayısı-1 leght-1 dir böylede 0-49 index dir.
     //50.Öğrenci notu
     //notlar[50]=56; challanger patlar

        System.out.println("notlar[0] = " + notlar[0]);

        System.out.println("notlar.length = " + notlar.length);
        //50 yani toplam elelman sayısını verir.























    }
}
