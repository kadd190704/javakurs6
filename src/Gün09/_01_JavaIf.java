package Gün09;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {

      //Baklava dilimimiz= if
      //Girilen bir sayı 10 dan büyük ise ekrana  10 dan büyük yazdırınız.
      //    1.Başla  {
      //    2.sayı oku  sayı=oku.nextInt();
      //    3.sayı>10 ise "10 dan büyük" yaz  if (sayı>10) sout...
      //  Dur

        Scanner oku=new Scanner(System.in);
        System.out.println("sayı=");
        int sayı= oku.nextInt();

        if(sayı>10)//normal parantez şart   ; noktalı virgül konmaz.
        { // if in şartı sağladığında çalışan bölüm
            System.out.println("10 dan büyük");
            System.out.println("if deyimi kullanıldı");
        }

        //{} parantezini her zaman kullanabiliriz
        //ancak if şartı sağlandığında çalışacak tek bir komut var ise
        //kullanmak zorunlu değil





















    }
}
