package Gün19;

public class _02_Java2DArrays {
    public static void main(String[] args) {

  int[][]tablo=new int[2][3];

  int[][]tablo2={//5 satır
          {4,55}, //0.satır, 2sütun
          {3,56,77}, //1.satır,3 sütun
          {23,2,3,1,4,55,66,7}, //2.satır, 8 sütun
          {13,44,55},//3.sayır, 3 sütun
          {43}//4.satır, 1 sütun
  };
        for (int i = 0; i < tablo2.length; i++) {

            for (int j = 0; j <tablo2[i].length; j++) {
                System.out.print(tablo2[i][j]+" ");


                System.out.println();

            }

        }


























    }
}
