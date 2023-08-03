package Gün28._04_Örnek;

public class Banka {
    String ad;
    int subeSayısı;
    int kurulusYılı;

    public Banka(){

    }
    public Banka(String ad,int subeSayısı,int kurulusYılı){
        this.ad=ad;
        this.subeSayısı=subeSayısı;
        this.kurulusYılı= kurulusYılı;
    }
    public Banka(String ad,int kurulusYılı){
        this(ad,kurulusYılı,0);
    }
    public Banka(String ad){
        this(ad,0,0);
    }

    @Override
    public String toString() {
        return "Banka{" + "ad='" + ad + '\'' + ", subeSayısı=" + subeSayısı + ", kurulusYılı=" + kurulusYılı + '}';
    }
}
