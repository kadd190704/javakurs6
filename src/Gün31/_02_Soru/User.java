package Gün31._02_Soru;

public class User {
    String username;
    Role role;
    Status status;

    public static void userSil(User user){
        if (user.role==Role.ADMİN){
            System.out.println("Admin silinemez");
        }
        else {
            System.out.println("User silindi");
            //user silme işlemleri yapıldı
        }
    }
    public User(String username,Role role,Status status){
        this.username=username;
        this.role=role;
        this.status=status;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", role=" + role +
                ", status=" + status +
                '}';
    }
}

