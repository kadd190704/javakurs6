package Gün20;

public class _02_JavaMethod {
    public static void main(String[] args) {
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");


        merhabaYaz();//giden yok, dönen yok
        toplamYaz(4,5);//giden var, dönen yok
        int enb=Math.max(4,5);//giden var dönen var(eşitleyebiiliyorsak dönen var)
        double rndSayı=Math.random();//giden yok,dönen var(eşitleyebiliyorsak dönen var)

        /**********************/
        enbBulYaz(4,5);
        enb=enbBulGeriGönder(4,5);
        System.out.println("enb = " + enb);

        //Javaya ait herhangi bir metoudun üzerine CTRL ile tıkladığımızda,
        //metodun içeriğini/kodlarını görebilirsiniz.

    }
    public static int enbBulGeriGönder(int s1,int s2){//sırasıyla eşleşiyor
        //void:tipsiz demek yani return u yok
        int enb=0;
        if (s1>s2)
            enb=s1;//return1
        else
            enb=s2;//returrn2

        return enb;//dönecek elemanın tipini metodun adından önce yazıyoruz.

    }
    public static void enbBulYaz(int s1,int s2){
        if (s1>s2)
            System.out.println("s1 = " + s1);
        else
            System.out.println("s2 = " + s2);

    }
    public static void toplamYaz(int s1,int s2){
        System.out.println("toplam = " +(s1+s2));
    }
    public static void merhabaYaz(){
        System.out.println("Merhaba Dünya");
    }



}
