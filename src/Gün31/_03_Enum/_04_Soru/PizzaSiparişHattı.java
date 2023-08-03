package Gün31._03_Enum._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparişHattı {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        ArrayList<Pizza>siparişler=new ArrayList<>();

        int seçim=0;
        do {
            menu();//menüyü göster
            seçim= oku.nextInt();//seçimi oku
            //seçime göre pizzayı ArrayListe ekle
            switch (seçim){
                case 1:Pizza ps=new Pizza(PizzaSize.SMALL);
                siparişler.add(ps);
                break;
                case 2:Pizza pm=new Pizza(PizzaSize.MEDİUM);
                    siparişler.add(pm);
                    break;
                case 3:Pizza pl=new Pizza(PizzaSize.LARGE);
                    siparişler.add(pl);
                    break;
                case 4:siparişYazdır(siparişler);
                    break;
            }

        }while (seçim<5);

    }
    public static void siparişYazdır(ArrayList<Pizza>siparişler){
        int s=0,m=0,l=0;

        for (Pizza p:siparişler){
            switch (p.size){
                case SMALL:s++;
                case MEDİUM:m++;
                case LARGE:l++;
            }
        }
        System.out.println(s+"tane Small pizza");
        System.out.println(m+"tane Medium pizza");
        System.out.println(l+"tane Large pizza");
    }
    public static void menu(){
        System.out.println("******Pizza Menu*****");
        System.out.println("1-Small");
        System.out.println("2-Medium");
        System.out.println("3-Large");
        System.out.println("4-İşleme Al-Siparişi göster");
        System.out.print("Seçiminiz=");

    }

}
