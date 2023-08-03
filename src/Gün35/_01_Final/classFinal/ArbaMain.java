package Gün35._01_Final.classFinal;

public class ArbaMain {
    public static void main(String[] args) {
        Taşıt t1=new Taşıt();
        t1.model="opel";

        Taşıt t2=new Taşıt();
        t2.model="opel";
        //kullanım kısmında bir sıralama yok
        //class final olursa eğerr main birden fazla
        //çağrılabiliyor fakat başka class a extend edilmez.
    }
}
