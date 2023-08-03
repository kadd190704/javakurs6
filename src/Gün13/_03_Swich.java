package Gün13;

import java.util.Scanner;

public class _03_Swich {
    public static void main(String[] args) {

   //Girilen bir Ay numarasına göre ayın kaç gün sürdüğünü yazdırınnız

        Scanner oku=new Scanner(System.in);
        System.out.println("Ay numarasaı gir=");
        int ayNo= oku.nextInt();

        switch (ayNo) {
            case 1: System.out.println(31);break;
            case 2: System.out.println(28);break;
            case 3: System.out.println(31);break;
            case 4: System.out.println(30);break;
            case 5: System.out.println(31);break;
            case 6: System.out.println(30);break;
            case 7: System.out.println(31);break;
            case 8: System.out.println(31);break;
            case 9: System.out.println(30);break;
            case 10: System.out.println(31);break;
            case 11: System.out.println(30);break;
            case 12: System.out.println(31);break;
            default: System.out.println("hatalı ay no");
        }

          //2.yol
        switch (ayNo){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println(31);break;

            case 2: System.out.println(28);break;

            case 4:
            case 6:
            case 9:
            case 11: System.out.println(30);break;

            default: System.out.println("hatalı ay no");







        }























    }

    public static class _02_Soru {
        public static void main(String[] args) {

        //Girilen bir sayının birler basamağının değerini yazı ile yazdırınız.
        //124 -> birler basamağı ->4  ->dört

            Scanner oku=new Scanner(System.in);
            System.out.println("Sayı giriniz=");
            int sayı= oku.nextInt();

            //234 %10 ->4
            //45 %10->5

            int birlerBasamağı=sayı%10;

            switch (birlerBasamağı){
                case 0: System.out.println("sıfır");break;
                case 1: System.out.println("bir");break;
                case 2: System.out.println("iki");break;
                case 3: System.out.println("üç");break;
                case 4: System.out.println("dört");break;
                case 5: System.out.println("beş");break;
                case 6: System.out.println("altı");break;
                case 7: System.out.println("yedi");break;
                case 8: System.out.println("sekiz");break;
                case 9: System.out.println("dokuz");break;

            }






















        }
    }
}
