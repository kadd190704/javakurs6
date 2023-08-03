package JavaDizilerÖdev;

import java.util.Arrays;

public class _09_10_11_12_13_Soru {
    public static void main(String[] args) {

     //9.SORU
     //int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
     // Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

  int[]dizi={15,25,22,18,30};
  //dizi sıralanıyor
        Arrays.sort(dizi);
        if (dizi.length>=2){
            int enBüyükİkinci=dizi[dizi.length-2];
            System.out.println("En büyük ikinci eleman="+enBüyükİkinci);
        }
          else
            System.out.println("Dizide en az 2 eleman olmallıdır");

         /*********************************/

       //10.SORU
       // int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
       // En küçük (minimum) sayıyı yazdırınız.

        int[]sayılar={14,19,5,21};
        int min=sayılar[0];
        for (int i = 0; i <sayılar.length; i++) {
            if (sayılar[i]<min){
                min=sayılar[i];
            }

        }
        System.out.println("En küçük sayı= " + min);

        /****************************************/

        //11.SORU
    // int Array oluşturun ve elemanları : 12,2,5,15,8
    //  En büyük değeri yazdırınız.

        int[]dizii={12,2,5,15,8};

        int enBüyük=dizii[0];
        for (int i = 1; i < dizii.length; i++) {
            if (dizii[i]>enBüyük);{
                enBüyük=dizii[i];
            }

        }
        System.out.println("En büyük sayı = " + enBüyük);

        /******************************************/


        //12.SORU
        //String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        //Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        //Eğer aitse "true" çevirin.
        //Loops (döngüler) kullanın
      String[]meyveler={"Apple","Orange","Banana","Pineapple"};
      String arananMeyve="Apple";
      boolean meyveVarMı=false;

      for (String meyve:meyveler){
          if (meyve.equals(arananMeyve)){
              meyveVarMı=true;
              break;
          }
      }
        System.out.println( meyveVarMı);

      /*******************************/

     //   Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
     //   $ işaretlerini kaldırın ve sayıları toplayın.
     //   Sayıların toplamını yazdırın.

        String str="$12 $23 $10 $2 $5 $2";
        str=str.replaceAll("\\$","");
        String[]Sayılar=str.split(" ");

        int toplam=0;
        for (String sayı:Sayılar){
            toplam=toplam+Integer.parseInt(sayı);
        }

        System.out.println("toplam = " + toplam);







    }
}
