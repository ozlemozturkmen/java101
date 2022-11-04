import java.util.Scanner;
public class atmProject2 {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        int price;
        while (right > 0) {
            // kullanıcıdan bilgi alma
            System.out.println("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.println("Parolanız : ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, OzOz Bankasına Hoşgeldiniz!");
                System.out.println("1-Para yatırma \n" +
                        "2-Para çekme\n" +
                        "3-Bakiye Sorgula \n" +
                        "4-Çıkış yap \n");
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                select = input.nextInt();
                switch (select) {
                    case 1:

                        System.out.println("Para miktarı : ");
                        price = input.nextInt();
                        balance += price;
                        System.out.println("Hesabınızdaki toplam para miktarı: " + balance);
                        break;
                    case 2:
                        System.out.println("Para miktarı : ");
                        price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz");
                        } else {
                            balance -= price;
                            System.out.println("Hesabınızdaki toplam para miktarı: " + balance);
                        }
                        break;
                    case 3:
                        System.out.println("Bakiye miktarı : " + balance);
                        break;
                    case 4:
                        System.out.println("Tekrar görüşmek üzere");
                        break;
                }


            } else {
                right--;
                System.out.println("Hatalı kullancı adı veya şifre.Tekrar deneyiniz");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur.Lütfen bankayla iletişime geçiniz ");

                } else {
                    System.out.println("Kalan hakkınız: " + right);
                }


            }
        }
    }
}