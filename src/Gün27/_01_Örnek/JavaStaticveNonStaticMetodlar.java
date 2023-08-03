package Gün27._01_Örnek;

public class JavaStaticveNonStaticMetodlar {
    public static void main(String[] args) {

        Utility.getString2(56);

        Utility ut=new Utility();//ut: nesne
        ut.getString(56);

        //static metodlar: calss a yani tipe ait
        //bu sebeple tipin adı ile çağırılırlar

        //static olmayanlar:nesneye ait
        //bu sebeple nesne adı ile çağırılırlar

    }
}
