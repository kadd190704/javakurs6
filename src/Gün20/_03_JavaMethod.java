package Gün20;



import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.

        Scanner oku = new Scanner(System.in);

        System.out.println("1.Sayı=");
        int sayı1 = oku.nextInt();

        System.out.println("2.Sayı=");
        int sayı2 = oku.nextInt();


        int enb = enbBul(sayı1, sayı2);
        System.out.println("enb = " + enb);

    }

    public static int enbBul(int s1, int s2) {//metodun imzası
    int enb=0;

    if (s1>s2)
        enb=s1;
    else
        enb=s2;

    return enb;
    }
//2.yöntem
//  if(s1>s2)
//     return s1;
//    else
//       return s2;

//3.yöntem
// return (s1>s2 ? s1:s2);   /s1>s2 ise s1 i gönder değilse s2 yi gönder.



}
