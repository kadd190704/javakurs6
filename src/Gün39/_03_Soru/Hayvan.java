package Gün39._03_Soru;

public abstract class Hayvan {
    private final int Id;
    private String isim;
    private boolean vahsi;
    private String doğumTarihi;

   private static int sayaçID=1;

    public Hayvan(String isim, boolean vahsi, String doğumTarihi) {
        setIsim(isim);
        setVahsi(vahsi);
        setDoğumTarihi(doğumTarihi);
        this.Id=sayaçID++;
    }

    abstract void yiyeceği();
    abstract void yemekMiktarı();
    abstract void günlükUykuSüresi();
    abstract void sesi();

    public int getId() { //ID nin get ine ihtiyacımız var
        return Id;       //set ine ihtiyacımız yok final değer olduğu için
                         //bu yüzden set ini sildik.
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDoğumTarihi() {
        return doğumTarihi;
    }

    public void setDoğumTarihi(String doğumTarihi) {
        this.doğumTarihi = doğumTarihi;
    }

    @Override
    public String toString() {
        System.out.println("****************");
        System.out.println("ismi ="+this.isim);
        System.out.print("yiyeceği ="); yiyeceği();
        System.out.print("yemek miktarı ="); yemekMiktarı();
        System.out.print("uyku süresi = "); günlükUykuSüresi();
        System.out.print("sesi =");sesi();
        return "Hayvan" +
                "Id=" + Id+
                ", vahsi=" + vahsi +
                ", doğumTarihi=" + doğumTarihi ;
    }
}
