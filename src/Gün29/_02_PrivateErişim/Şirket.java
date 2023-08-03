package Gün29._02_PrivateErişim;

public class Şirket {
    public static void main(String[] args) {
        Çalışan cal1=new Çalışan();
        cal1.id=1;
        cal1.name="Kader";
        cal1.surname="Taşdemir";
        //cal1.password="1234";

        cal1.şifreAta("1234");
        cal1.şifreAta("M123_sdf23");
        cal1.şifreGöster();

    }
}
