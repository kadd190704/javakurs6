package Gün46;

public class S71 {
    public static void main(String[] args) {
        int[][] arr=new int[2][4];

        arr[0]=new int[]{1,3,5,7};
        arr[1]=new int[]{1,3};

        //arr.length nedir? Satır sayısı
        //a[i] lennght nedir? satırdaki eleman sayısı

        for (int[]a :arr){

            for (int i = 0; i < arr.length; i++) {
                System.out.println(a[i]+" ");
            }
            System.out.println();


        }
    }
}
