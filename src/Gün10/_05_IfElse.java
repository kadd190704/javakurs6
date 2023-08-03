package Gün10;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {

      //Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
      //"study" kelimesi geçiyorsa ekrana evet yazdırın değilse
      //hayır yazdırın

        Scanner oku=new Scanner(System.in);
        System.out.println("cümle gir=");
        String cümle= oku.nextLine();

        if (cümle.length()>10 && cümle.toLowerCase().contains("study"))
            System.out.println("evet");

        else
            System.out.println("hayır");



         //tekrar bak.











    }
}
