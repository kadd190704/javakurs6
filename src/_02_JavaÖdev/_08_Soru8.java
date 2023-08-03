package _02_JavaÖdev;

import java.util.Scanner;

public class _08_Soru8 {
    public static void main(String[] args) {
        //Bir byte oluşturunuz.Konsola kg cinsinden bir ağırlık yazınız.
        Scanner oku=new Scanner(System.in);
        System.out.println("Ağırlık oku=");
        byte kg= oku.nextByte();
        System.out.println("kg = " + kg);
    }
}
