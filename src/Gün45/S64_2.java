package Gün45;

public class S64_2 {
    public static void main(String[] args) {
        String []arr={"A","B","C","D"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" "); //A

            if (arr[i].equals("C")){
                continue; //continue:pass geçiyordu hatırla
            }
            System.out.println("Work Done");

        }

    }
}
