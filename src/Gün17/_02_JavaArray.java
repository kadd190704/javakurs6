package Gün17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {

     //Kullanıcıdan gireceği bir cümlede kaç kelime olduğunu bulunuz
     //for döngüsü ile yapın
     //bu gün hava çok güzel ->5

        Scanner oku=new Scanner(System.in);
        System.out.print("cümle giriniz=");
        String cümle=oku.nextLine();

        int boşlukSayısı=0;
        for (int i = 0; i <cümle.length(); i++) {
            if (cümle.charAt(i)==' ');
            boşlukSayısı++;

        }
        System.out.println("kelime sayısı = " + (boşlukSayısı+1));























    }
}
