package Gün14;

import java.util.Scanner;

public class _06_ForLoop {
    public static void main(String[] args) {

   //kullanıcının gireceği bir rakama kadar
   //olan sayıların toplamını bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.println("kaça kadar toplanacak=");
        int sınır= oku.nextInt();

        //başlangıç 1, sonu:sınır, 1 er:  for
        int toplam=0;
        for (int i=1; i<=sınır; i++)
        {
            toplam=toplam+i;
        }
        System.out.println("toplam = " + toplam);















    }
}
