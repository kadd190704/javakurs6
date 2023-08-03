package Gün39._01_Soru;

public class ABMain {
    public static void main(String[] args) {

        A a= new A();//bunun bir etkisi yok
        System.out.println("A.mesaj="+A.mesaj);//A

        B b=new B();//constructor çalıştı
        System.out.println("A.mesaj = " + A.mesaj);//B

        A a2=new A();//etkisi yok
        System.out.println("A.mesaj = " + A.mesaj);//B

        //çıktısı ne olur.
    }

}
