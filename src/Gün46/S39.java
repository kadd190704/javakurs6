package Gün46;

public class S39 {
    public static void main(String[] args) {

      String shirts[][]=new String[2][2]; //2 satır her satır 0,1
      shirts[0][0]="red";
      shirts[0][1]="blue";
      shirts[1][0]="small";
      shirts[1][1]="medium";

      //a) medium
        for (int index = 0; index < 2; index++) {//1
            for (int idx = 0; idx < 2; idx++) {//1
                System.out.println(shirts[index][idx]);
            }
        }
        //b) small
        for (int index = 0; index < 2; index++) {
            for (int idx = 0; idx < index; idx++) {
                System.out.println(shirts[index][idx]);
            }

        }






    }
}
