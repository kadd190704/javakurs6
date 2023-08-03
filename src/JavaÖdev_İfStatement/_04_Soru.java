package JavaÖdev_İfStatement;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {

    //Kullanıcıdan 2 kere şifre isteyiniz, aynı ise TAMAM, değilse
    //HATALI ŞİFRE yazınız

        Scanner oku=new Scanner(System.in);
        System.out.println("şifre1 giriniz=");
        int şifre1= oku.nextInt();
        System.out.println("şifre2 giriniz=");
        int şifre2= oku.nextInt();

        if (şifre1==şifre2)
            System.out.println("TAMAM");

        else
            System.out.println("HATALI ŞİFRE");




















    }
}
