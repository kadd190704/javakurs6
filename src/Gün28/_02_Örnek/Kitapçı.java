package Gün28._02_Örnek;

public class Kitapçı {
    public static void main(String[] args) {

       Kitap kit1=new Kitap();
       kit1.name="Harry Poter";
       kit1.publishYear=1997;
       kit1.author="JK Rowling";

       Kitap kit2=new Kitap("yüzükler",1954,"JRR Tolkien");
       Kitap kit3=new Kitap("üzüm ve çay",2023);

        System.out.println("kit1 = " + kit1);
        System.out.println("kit2 = " + kit2);
        System.out.println("kit3 = " + kit3);









    }
}
