package Gün29._02_PrivateErişim;

public class Çalışan {
    int id;     //default
    String name;   //default

    String surname;   //default

    private String password; //private

    public void şifreAta(String şifre){
        if (şifre.length()<8)
            System.out.println("Zayıf şife");

        else {
            this.password=şifre;
            System.out.println("Şifre başarıyla atandı");
        }
    }

    public void şifreGöster(){
        System.out.println("****"+this.password.substring(4));
    }

}
