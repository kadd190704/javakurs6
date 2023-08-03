package Gün12;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {

   //Kullanıcının girdiği gün numaralarına göre haftanın hangi gününde olduğunu yazınız

        Scanner oku=new Scanner(System.in);
        System.out.println("Gün no=");
        int günNo= oku.nextInt();

    // if (günNo==1)
     //   System.out.println("pazartesi");
     //else
        //  if (günNo==2)
        //    System.out.println("salı");

      switch (günNo) {
          case 1: System.out.println("pazartesi");break;
          case 2: System.out.println("salı");break;
          case 3: System.out.println("çarşamba");break;
          case 4: System.out.println("perşembe");break;
          case 5: System.out.println("cuma");break;
          case 6: System.out.println("cumartesi");break;
          case 7: System.out.println("pazar");break;
          default: System.out.println("hatalı giriş");

      }




    }
}
