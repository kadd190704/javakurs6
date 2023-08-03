package Gün17;

import java.util.Scanner;

public class _03_JavaSplitMetodu {
    public static void main(String[] args) {

        //Kullanıcıdan gireceği bir cümlede kaç kelime olduğunu bulunuz
        //bu gün hava çok güzel ->5

        Scanner oku=new Scanner(System.in);
        System.out.print("cümle giriniz=");
        String cümle=oku.nextLine();

        String []kelimeler=cümle.split(" ");//String metodu

        System.out.println("kelimeler.length = " + kelimeler.length);
        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("kelimeler = " + kelimeler[i]);
        }

       // iklimler çok  değişti

        //String[] kelimeler=cumle.split(" ");

        //kelimeler[0] -> "iklimler"
        //kelimeler[1] -> "çok"
        //kelimeler[2] -> "değişti"

        //kelime.length -> 3














    }
}
