package Gün30._03_Soru;

public class KimlerDinledi {
    int a;
    static int b=0;  //sen bitanesin iki tane zaten olamaz

    void artır(){
        a++;
        b++;
    }

    public static void main(String[] args) {
        KimlerDinledi kd1=new KimlerDinledi();
        kd1.a=5;

        KimlerDinledi kd2=new KimlerDinledi();
        kd2.a=7;

        //1.Soru a nın değeri şu an kaçtır
        //Burda her nesnenin a sı var ve kd1 in 5, kd2 nin 7 değeri var
        System.out.println("kd1.a = " + kd1.a);
        System.out.println("kd2.a = " + kd2.a);

        //2.Soru b nin değeri kaçtır? Tek bir değeri vardır o da sıfırdır.
        kd1.artır();//kd1=6, b=1
        kd2.artır();//kd2=8, b=2
        //3.Soru a ve b nin değeri kaçtır
        System.out.println("kd1.a = " + kd1.a);
        System.out.println("kd2.a = " + kd2.a);
        System.out.println("b = " + b);
    }

}
