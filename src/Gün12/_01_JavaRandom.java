package Gün12;

public class _01_JavaRandom {
    public static void main(String[] args) {

   double randSayı=Math.random();//0-0,99999999
        System.out.println("randSayı = " + randSayı);

        //0-0,99999999
        //10 la çarparsam
        //0-9,99999999
        //(int) 0-9

        int rndTamSayı=(int)(randSayı*10);
        System.out.println("rndTamSayı = " + rndTamSayı);





















    }
}
