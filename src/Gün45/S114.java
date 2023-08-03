package Gün45;

public class S114 {
    public static void main(String[] args) {

        int numbers[];  //int sayı;
        numbers=new int[2]; //sayı=5;  örneğin
        numbers[0]=10;
        numbers[1]=20;

        numbers=new int[4]; //0,0,0,0; 4 elemanı sıfırlandı
        numbers[3]=30;
        numbers[4]=40;

        for (int x:numbers){
            System.out.println(" "+x);
        }

    }
}
