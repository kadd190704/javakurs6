package Gün31._01_Enum;

public class Örnek1 {
    public static void main(String[] args) {

        // class ın içindde de enum tanımlanabilir, ancak METOD ların içine atanamaz

        //Verilen bir ay nosuna göre ayın kaç gün sürdüğünü veren programı yazınız


        int ayNo=5;

        switch (ayNo){
            case 2:
                System.out.println(28);break;
                case 1:
            case 3:
            case 5:
            case 22:
            case 10:
            case 12:
                System.out.println(31);break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);break;
        }
        //okunabilirlik ve kontrollü yazılım yok,tanımlama yetersiz
        //numaradan gitmeye çalıştık,zorlukla karşılaştık
        //bunun yerine isimden gitmeye çalıştık

       // String (ayAd){
         //   case "şubat":
           //     System.out.println(28); break;
            //case "ocak":
            //case "mart":
        }



    }

