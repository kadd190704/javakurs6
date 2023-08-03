package gün04;

public class _02_TipDönüşümleri {
    public static void main(String[] args) {
        byte orgNot1= 98;
        byte orgNot2= 97;
        byte orgNot3=99;
        byte orgNot4=100;

        //int           //byte
        int toplamNot= orgNot1+ orgNot2+orgNot3+orgNot4;
        System.out.println("toplamNot="+toplamNot);

        byte toplam2= (byte) toplamNot; //394 übyte alana atıyorum

        System.out.println("topam2="+toplam2);

    }
}
