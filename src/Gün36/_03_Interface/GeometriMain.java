package Gün36._03_Interface;

public class GeometriMain {
    public static void main(String[] args) {

        Çember c=new Çember();
        c.çiz();//çember çizildi

        Dikdörtgen d=new Dikdörtgen();
        d.çiz();//dikdörtgen çizildi

        //interface lerden nesne üretilemez fakat referans tipi
        // oluşturulabilir. bu bize Polymorphism sağladı.
        IÇizdirir c2=new Çember();
        c2.çiz(); // çember çizildi
        // direk olarak sadece Interface deki
        // ismi verilmiş olanlar metodlara erişebiirsin (düzenlendi)

       // çizdir(c);
       // çizdir(d);
    }
   // public static class çizdir(IÇizdirir g){
        //g.çiz();
    //}
}
