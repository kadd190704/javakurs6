package Gün26._02_Örnek;

import java.util.ArrayList;

public class Şirket {
    // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
    // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
    // 3- Adım : Bu degerlerı yazıdırınız.
    // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
    //           çalıştığında kişinin doğum yılını versin.

    public static void main(String[] args) {
        Person cal1=new Person();
        cal1.name="Şenol";
        cal1.surname="Doğan";
        cal1.age=20;

        Person cal2=new Person();
        cal2.name="Sokul";
        cal2.surname="Rrustemi";
        cal2.age=25;

        //1.yöntem
        System.out.println("cal1.name = " + cal1.name);
        System.out.println("cal1.surname = " + cal1.surname);
        System.out.println("cal1.age = " + cal1.age);

        System.out.println("cal2.name = " + cal2.name);
        System.out.println("cal2.surname = " + cal2.surname);
        System.out.println("cal2.age = " + cal2.age);

        //2.Yol
        BilgiYazdır(cal1);
        BilgiYazdır(cal2);

        //3.yol
        cal1.bilgiYazdır();
        cal2.bilgiYazdır();

        //4.yol
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println("list = " + list.toString());

        System.out.println("cal1 = " + cal1);
        System.out.println("cal2 = " + cal2);

        cal1.getBirthYear();
        cal2.getBirthYear();

        System.out.println("cal1.getBirthYear2() = " + cal1.getBirthYear2());

    }
    public static void BilgiYazdır(Person cal)//cal1, cal2
    {
        System.out.println("cal.name = " + cal.name);
        System.out.println("cal.surname = " + cal.surname);
        System.out.println("cal.age = " + cal.age);
    }
}
