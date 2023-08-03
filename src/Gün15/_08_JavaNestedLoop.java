package Gün15;

public class _08_JavaNestedLoop {
    public static void main(String[] args) {

        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *        1.Satırda 1 yıldız
        // **       2.satırda 2 yıldız
        // ***      3.satırda 3 yıldız
        // ****     4.satırda 4 yıldız
        // *****    5.satırda 5 yıldız

        for(int satır=1; satır<=5; satır++){

            for (int i = 1; i <=satır ; i++)
               System.out.print("*"); //25 kez kalışıyor


        }
        System.out.println();






    }
}
