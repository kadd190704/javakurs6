package Gün16;

public class _04_JavaArray {
    public static void main(String[] args) {

    int[]dizi=new int[5]; //0,1,2,3,4 indexli 5 elemanlı dizi,int sayı;
    int[]dizi2={3,6,44,55,77}; //5 elemanlı dizi, hem tanımlandı hem de değer atandı,int sayı=5;

    String[] cümleler=new String[5];//5 tane cümle saklayabilen bir Strinng dizi değişkeni
    boolean[]dizi3=new boolean[5]; //5 tane (true/false) saklayabilen bir dizi değişkeni
    double[]oranlar=new double[5]; //5 tane doble saklayabilen bir dizi değişkeni

        for (int i = 0; i < dizi.length; i++) {
            System.out.println("dizi = " + dizi[i]);
        }

        for (int i = 0; i < cümleler.length ; i++) {
            System.out.println("cümleler = " + cümleler[i]);
        }

        for (int i = 0; i < dizi3.length ; i++) {
            System.out.println("dizi3 = " + dizi3[i]);
        }

        for (int i = 0; i < oranlar.length; i++) {
            System.out.println("oranlar = " + oranlar[i]);
        }














    }
}
