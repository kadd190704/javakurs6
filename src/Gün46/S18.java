package Gün46;

public class S18 {
    public static void main(String[] args) {

    String[][]chs=new String[5][2]; // 5 satır, her satır 2 eleman
    chs[0]=new String[4];
    chs[1]=new String[5];
    int i=97;

        System.out.println("chs.lenght = " + chs.length);//5
        System.out.println("chs[0].lenght = " + chs[0].length);//4
        System.out.println("chs[1].lenght = " + chs[1].length);//2
        System.out.println("chs[2].lenght = " + chs[2].length);//2
        System.out.println("chs[3].lenght = " + chs[3].length);//2
        System.out.println("chs[4].lenght = " + chs[4].length);//2

        for (int a = 0; a < chs.length; a++) {// 5 a:0,1,2,3,4

            for (int b = 0; b < chs.length; b++) {
                chs[a][b]=" "+i; //b ancak 0 ve 1 olabilir
                i++;
            }

        }
        for (String[]ca:chs){
            for (String c:ca){

            }
            System.out.println();
        }

















    }
}
