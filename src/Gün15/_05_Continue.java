package Gün15;

import java.util.Scanner;

public class _05_Continue {
    public static void main(String[] args) {

// Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.

        Scanner oku=new Scanner(System.in);
        System.out.println("bir cümle giriniz=");
        String cümle=oku.nextLine();

     //Bu gün hava çok güzel-> index=0, kaça<cümle.lenght, 1 er
        for (int i = 0; i <cümle.length() ; i++) {

            if (cümle.charAt(i)==' ')
                continue;

            System.out.println(cümle.charAt(i));

        }


















    }
}
