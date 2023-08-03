package Gün19;

public class _05_JavaMethod {
    public static void main(String[] args) {
     merhabaYaz();
     merhabaYaz();
     merhabaYazIsme("Kader");
     çokMerhabaYaz(5);

    }

    public static void merhabaYaz() {
        System.out.println("Merhaba Dünya");
    }


    public static void merhabaYazIsme(String ad)
    {
        System.out.println("merhaba"+ad);
    }

    public static void çokMerhabaYaz(int miktar)
    {
        for (int i = 0; i <miktar; i++) {
            System.out.println("Merhaba");
        }
    }


}
