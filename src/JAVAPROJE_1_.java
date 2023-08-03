import java.util.Scanner;

public class JAVAPROJE_1_ {
    public static void main(String[] args) {

        Scanner okuStr = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);

        System.out.println("Hangi kahveyi istersiniz=");
        System.out.println("1.Türk Kahvesi   2.Filtre Kahve   3.Espresso");


        String seçim = okuStr.nextLine();
        switch (seçim.toUpperCase()) {
            case "1":
                System.out.print("Türk Kahvesi");
                break;
            case "2":
                System.out.print("Filtre Kahve");
                break;
            case "3":
                System.out.print("Espresso");
                break;
            default:
                System.out.println("Hatalı tuşlama yaptınız");
                break;
        }

        String hangiKahve = okuStr.nextLine();
        System.out.println(hangiKahve + " " + "HAZIRLANIYOR ");

        System.out.println("Süt eklemek ister misiniz(Evet veya Hayır olarak cevaplayınız)=");

        String süt = okuStr.nextLine();
        if (süt.equalsIgnoreCase("evet")) {
            System.out.println("süt ekleniyor");
            if (süt.equalsIgnoreCase("hayır")) {
                System.out.println("süt eklenmiyor");
            }
        }

        System.out.println("Şeker ister misiniz=");

        String şeker = okuStr.nextLine();
        if (şeker.equalsIgnoreCase("evet")) {
            System.out.println("Kaç şeker olsun=");

            int kaçŞeker = okuInt.nextInt();
            System.out.println(kaçŞeker + " " + "şeker ekleniyor");

            if (şeker.equalsIgnoreCase("hayır")) {
                System.out.println("şeker eklenmiyor");
            }
        }


        String bosKod = okuStr.nextLine();


        System.out.println("İçeceğin boyutunu girin?"+"\n"+"Büyük boy"+"\n"+"Orta boy"+"\n"+"Küçük boy");
        String boyut=okuStr.nextLine();


        if (boyut.equalsIgnoreCase("büyük boy"));{
            System.out.println(hangiKahve+" "+ boyut+" "+"hazırlanıyor");
        }
            if (boyut.equalsIgnoreCase("orta boy"));{
            System.out.println(hangiKahve+" "+ boyut+" "+"hazırlanıyor");
        }
        if (boyut.equalsIgnoreCase("küçük boy"));
        {
            System.out.println(hangiKahve + " " + boyut + " " + "hazırlanıyor");

        }

        System.out.println(hangiKahve+" "+ boyut+" "+"hazırdır.Afiyet olsun!!!");






































    }
}
