package gün04;

public class _07_Ornek3 {
    public static void main(String[] args) {

// String olarak verilen 3 notun (82,95,56) ortalamasını bulunuz.
       String not1="82";
       String not2="95";
       String not3="56";

       int intNot1=Integer.parseInt(not1);
       int intNot2=Integer.parseInt(not2);
       int intNot3=Integer.parseInt(not3);

        int toplamNot=intNot1+intNot2+intNot3;
        System.out.println("toplamNot = " + toplamNot);

       double ort= toplamNot/(double)3;
        System.out.println("ort = " + ort);

         // küsüratı olduğu için doubleye çevirdik.
        // 3 ün başına double koymamız yeterli









    }
}
