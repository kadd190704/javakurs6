package Gün23;

import java.util.HashSet;

public class _04_Sets {
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>();
        hs.add(1);
        hs.add(4);
        hs.add(34);
        hs.add(54);
        hs.add(8);
        hs.add(45);
        hs.add(5);

        System.out.println("hs = " + hs);
        System.out.println("hs.size() = " + hs.size());
        hs.remove(5);//değere göre siler

        System.out.println("hs = " + hs);

        if (hs.contains(54))
            System.out.println("var");
        else
            System.out.println("yok");

        hs.clear();
        System.out.println("hs = " + hs);
    }
}
