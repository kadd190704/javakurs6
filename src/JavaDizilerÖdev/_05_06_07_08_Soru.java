package JavaDizilerÖdev;

public class _05_06_07_08_Soru {
    public static void main(String[] args) {

      //  String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
      //  Array'daki eleman sayısını yazdırınız.
      //  Cevap 4 olmalı.


        String[]şehirler={"New Jersey","New York","Boston","California"};

        int elemanSayısı= şehirler.length;
        System.out.println("Dizideki eleman sayısı = " + elemanSayısı);


        /********************************/

       //6.SORU:
       // String Array (Dizi) oluşturunuz.
       // elemanları : Apple, Orange , Banana, Kiwi
       // Array'leri tüm elemanları yazdırınız.

        String[]dizi={"Aple, Orange,Banana","Kiwi"};
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("Meyveler="+dizi[i]);

        }

        /**************************************/

        //7.SORU:
      //int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
      //Array'in ortalamasını alınız.

        int[]sayılar={12,14,21,23,10,4};

        int toplam=0;
        for (int i = 0; i <sayılar.length; i++){
            toplam=toplam+sayılar[i];

        }
            double ort=(double)toplam/sayılar.length;
        System.out.println("Sayıların ortalaması = " + ort);


        /***************************************/

        //8.SORU
     //int Array oluşturun ve elemanları : 5,6,8,12,14,19
     //Eğer sayı çiftse topla, tekse çıkar.
    //      **Örneğin:**
    //**-5 + 6 + 8 + 12 + 14 - 19 = 16**
    // Toplamlarını yazdırın.
       int[]Sayılar={5,6,8,12,14,19};
      int toplamm=0;
       for (int sayı:Sayılar){
           if (sayı%2==0){
               toplamm=toplamm+sayı; //Çiftt sayılar toplanıyor
           }
       else
           toplamm=toplamm-sayı;
       }
        System.out.println("Sayıların toplamı = " + toplamm);






















    }
}
