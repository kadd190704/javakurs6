package Gün07;

public class _10_StringToLowerCase {
    public static void main(String[] args) {

        //toLowerCase: stringi küçük harfe çevirir

        String text="Merhaba Dünya";

        System.out.println("orjinsl hali = " + text);
        System.out.println("text.toLowerCase() = " + text.toLowerCase());

        boolean baslıyorMu=text.startsWith("M");
        boolean baslıyorMu2=text.startsWith("m");
        boolean baslıyorMuIgnoreCase=text.toLowerCase().startsWith("m");// true

        System.out.println("baslıyorMu = " + baslıyorMu);
        System.out.println("baslıyorMu2 = " + baslıyorMu2);
        System.out.println("baslıyorMuIgnoreCase = " + baslıyorMuIgnoreCase);




















    }
}
