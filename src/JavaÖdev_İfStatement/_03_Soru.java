package JavaÖdev_İfStatement;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {

   //Girilen bir cümle A harfi ile başlıyorsa EVET, başlamıyorsa HAYIR
        //yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("cümle giriniz=");
        String cümle=oku.nextLine();


        if (cümle.startsWith("A"))
            System.out.println("EVET");

          else
            System.out.println("HAYIR");








    }
}
