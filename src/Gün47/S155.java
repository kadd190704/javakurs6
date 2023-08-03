package Gün47;

import java.util.ArrayList;

public class S155 {
    public static void main(String[] args) {

        ArrayList<Integer>points=new ArrayList<>();

        points.add(1);
        points.add(2); //remove(1) burayı siler
        points.add(3);
        points.add(4);
        points.add(null); //nul bir değer aynı zamanda

        points.remove(1);//1 nolu index i siler
        points.remove(null);

       // points.remove((Object)1); bu işlem 1 değerini siler
        System.out.println("points = " + points);










    }
}
