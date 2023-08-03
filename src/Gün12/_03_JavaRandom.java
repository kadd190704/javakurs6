package Gün12;

import java.util.Scanner;

public class _03_JavaRandom {
    public static void main(String[] args) {

    //(İnt)(Math.Random()*10) -> 0-9 arası üretir
    //20-30 arası random sayı ? min birde max lazım,alt sınır ve üst sınır lazım

    //Girilen min ve max aralığında random sayı üreten prograamı yazınız.
        Scanner oku=new Scanner(System.in);
        System.out.println("min(alt Sınır)=");
        int min= oku.nextInt();

        System.out.println("max(üst Sınır)=");
        int max= oku.nextInt();

        int rndSyı=(int)(Math.random()*(max-min))+min;

        System.out.println("rndSyı = " + rndSyı);




















    }
}
