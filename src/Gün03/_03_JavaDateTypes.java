package Gün03;

public class _03_JavaDateTypes {
    public static void main(String[] args) {

        int sayi; // hafızada int kadar yer kaplar,sadece tam sayı atılabilir
        //tam sayılarda defoold int

        // tam sayılar
        byte byteDeger = 7;  // 128   127
        short shortDeger = 1645;  // -32000     32000
        int intDeger = 25000;


        //ondalıklı sayıları defoultu double
        // ondalıklı sayılar
        double doubleDeger = 3.14233434;// noktadan sonra 16 haneye kadar hassasiyet var
        float floatDeger = 3.143434f; // noktadan 5 hane hassasiyeti var, ama kararsız

        //karakter
        char basHarf = 'A'; //bir tane harf saklar
        String isim = "Kader"; // kelime veya cümle saklayabilir,uzunluğu değişken
        //çift tırnak kullanılır.

        System.out.println("floatDeger = " + floatDeger);
        System.out.println("doubleDeger = " + doubleDeger);

        System.out.println("intDeger = " + intDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("byteDeger = " + byteDeger);


    }
}
