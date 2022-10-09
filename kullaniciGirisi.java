import java.util.Scanner;
public class kullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nickName = "patika";
        String password = "java123";

        System.out.print("Kullanıcı adınızı giriniz:");
        String nickNameCheck = input.nextLine();

        System.out.print("Şifre giriniz:");
        String passCheck = input.nextLine();


        if (nickName.equals((nickNameCheck)) && password.equals(passCheck))
            System.out.println("Hoşgeldiniz!");

        else if (!password.equals(passCheck)){
            System.out.print("Şifrenizi değiştirmek ister misiniz?(Y/N): ");
            String selection=input.nextLine();
            if(selection.equals("Y")){
                System.out.print("Yeni şifrenizi giriniz= ");
                String newPass=input.nextLine();
                if (newPass.equals(password))
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                else
                    System.out.println("Şifre oluşturuldu");
            }
            else if(selection.equals("N"))
                System.out.print("Şifre değiştirilmedi.");

            else
                System.out.print("Yanlış değer girdiniz. Şifre değiştirilmedi.");

        }
    }
}












