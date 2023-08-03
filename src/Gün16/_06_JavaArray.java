package Gün16;

public class _06_JavaArray {
    public static void main(String[] args) {

    //5 tv kanalı ismini bir diziye doldurunuz.trt,kanald,atv,fox,habertürk
    //Daha sonra random olarak bir tanesini seçip ekrana seçileni yazdırınız.

    String[]tvler={"trt","kanald","atv","fox","habertürk"};

     int rndındex=(int)(Math.random()*tvler.length); // 5 e kadar üretir 0,1,2,3,4

        System.out.println("Rastgele seçilen tv = " +tvler[rndındex]);


















    }
}
