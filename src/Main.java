import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userName, password;

        System.out.println("Kullanıcı adınızı giriniz : ");
        userName = sc.nextLine();

        System.out.println("Şifrenizi giriniz: ");
        password = sc.nextLine();

        if(userName.equals("demir") && password.equals("sayın")){
            System.out.println("Giriş yaptınız...");
        }
        else if (!"demir".equals(userName)) {
            System.out.println("Kullanıcı adınız yanlış...");
                    }
        else if (!"sayın".equals(password)) {
            System.out.println("Şifreniz yanlış sıfırlamak ister misiniz?");
            String ans = sc.nextLine();
            if (ans.equals("evet")){
                System.out.println("Yeni şifrenizi giriniz...");
                String newPassword = sc.nextLine();
                if (newPassword.equals("sayın")){
                    System.out.println("Yeni şifreniz eski şifrenizle aynı olamaz.");
                }
                else {
                    System.out.println("Şifreniz başarıyla değiştirilmiştir");
                    password = newPassword;
                }
            }
            else {
                System.out.println("Şifre sıfırlanmayacak.");
            }

        }

    }
}
