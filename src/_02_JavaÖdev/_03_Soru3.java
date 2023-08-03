package _02_JavaÖdev;

import java.util.Scanner;

public class _03_Soru3 {
    public static void main(String[] args) {
        // Bir String oluşturun. Konsol'a sevdiğiniz bir meyveyi yazın.

        Scanner oku=new Scanner(System.in);
        System.out.println("En sevdiğiniz meyve=");
        String meyve=oku.nextLine();
        System.out.println("meyve = " + meyve);

    }
}