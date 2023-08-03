package Gün47;

import java.util.ArrayList;
import java.util.List;

public class S48 {
    public static void main(String[] args) {

        List colors=new ArrayList<>();

        colors.add("green");//0
        colors.add("blue");//1
        colors.add("red");//2 siliniyor
        colors.add("yellow");//3

        colors.remove(2);//red silindi

        colors.add(3,"chan");//sıradaki indexe ekleyebiliyor
        //colors.add("chan"); bununla aynı

        System.out.println("colors = " + colors);










    }
}
