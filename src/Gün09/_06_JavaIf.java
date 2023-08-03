package Gün09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {

     //Girilen bir cümlede a harfinin geçip geçmediğini
     //bulunuz. Geçiyor ise EVET, geçmiyor ise HAYIR yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("cümle giriniz=");
        String cümle= oku.nextLine();



        boolean varMı=cümle.contains("a");

       if(varMı==true)
           System.out.println("EVET");
        if (varMı==false)
            System.out.println("HAYIR");


        //2.yol
        if(cümle.contains("a")==true)
            System.out.println("EVET");

        if (cümle.contains("a")==false)
            System.out.println("HAYIR");

        //3.yol
        if(cümle.contains("a"))
            System.out.println("EVET");
        if (!cümle.contains("a"))
            System.out.println("HAYIR");

         //Alternatif
       // cümle.contains("a")//a içeriyor mu
       // cümle.indexOf("a") //a içeriyor ise index ini verir
                             //a içermiyor ise -1 verir









    }
}
