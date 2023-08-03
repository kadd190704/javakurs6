package Gün31._02_Soru;

public class Program {
    public static void main(String[] args) {
        User user1=new User("İsmet",Role.ADMİN,Status.AKTİF);
        User user2=new User("mehmet",Role.SATIŞ,Status.PASİF);
        User user3=new User("ayşe",Role.MÜDÜR,Status.AKTİF);

        User.userSil(user1);//Admin silinemez
        User.userSil(user2);//user silindi
        User.userSil(user3);//user silindi

        //   if (user1.role == Role.ADMIN){
            //kullanıcı silme işlemleri
    //        }



    }
}
