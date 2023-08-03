package Gün46;

public class S17 {
    public static void main(String[] args) {
        int[][] arr=new int[2][4];

        arr[0]=new int[]{1,3,5,7};
        arr[1]=new int[]{1,3};

        //arr nin elemanları satır lardan (tek boyutlu dizilerden oluşuyor)
        for (int[]satır:arr){

            for (int eleman:satır){
                System.out.println(eleman+" ");
            }
            System.out.println();
        }
    }
}
