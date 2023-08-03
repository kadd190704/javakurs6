package Gün33._03_Soru;

public class GenelMüdür extends Çalışan {
    private double tazminat;

    public GenelMüdür(String isim, double maaş, double maasKatSayısı,double tazminat) {
        super(isim, maaş, maasKatSayısı);
        setTazminat(tazminat);
    }

    @Override
    public double maaşHesapla() {
        return super.maaşHesapla()+this.tazminat;
    }

    @Override
    public String toString() {
        return super.toString()+"\ntazminat="+this.tazminat;
        //        return "Bordro : " +
//                "\nisim='" + super.getIsim() +
//                "\nmaas=" + super.getMaas() +
//                "\nmaasKatsayisi=" + super.getMaasKatsayisi() +
//                "\ntazminat=" + this.tazminat +
//                "\nÖdenecek Maaş=" + maasHesapla()
//                ;

    }

    public double getTazminat() {
        return tazminat;
    }

    public void setTazminat(double tazminat) {
        //eğere kademesi bu ise tazminatın yarısını alır.
        this.tazminat = tazminat;
    }
}
