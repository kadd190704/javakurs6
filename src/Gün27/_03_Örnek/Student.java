package Gün27._03_Örnek;

import java.util.ArrayList;

public class Student {
    String name;

    int maxSaat;

    ArrayList<Lesson>dersleri=new ArrayList<>();

    public void  dersYazdır(){
        System.out.println("\n***Transkript***");
        System.out.println("Sayın,"+this.name);
        System.out.println("ldığınız dersler aşağıdadır.");

        for (Lesson d:this.dersleri)
            System.out.println(d.name+"-"+d.saat);
    }
    public static void universiteKuralları(){
        System.out.println("Kural 1:Çaysız ve üzümsüz derse gelme");
        System.out.println("Kural2: Uykunu al sağlık en önemlisi");

    }
}
