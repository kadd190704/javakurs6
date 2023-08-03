package Gün07;

public class _02_StringContains {
    public static void main(String[] args) {

      //contains=bir stringin içerisinde karkate(lerin) var olup
      //olmadığını boolean cinsinden söyle true veya false

      String cümle="Merhaba Dünya";

      boolean varMı=cümle.contains("a");
        System.out.println("varMı a=" + varMı);

        System.out.println("varMı a=" + cümle.contains("a"));
        System.out.println("varMı ya="+ cümle.contains("ya"));
        System.out.println("varMı z = " +cümle.contains("z"));









    }
}
