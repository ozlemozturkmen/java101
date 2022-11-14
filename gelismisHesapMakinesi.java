import java.util.Scanner;
public class gelismisHesapMakinesi {
    //toplama fonksiyonu oluşturma
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int sub(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma : " + result);
        return result;
    }

    static int multi(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma : " + result);
        return result;
    }

    static int div(int a, int b) {
        if (b == 0) {
            System.out.println("İkinci sayı 0'dan farklı olmalı");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölme : " + result);
        return result;
    }

    static int power(int a, int b) {
       int result=1;
       for(int i=1;i<=b;i++){
           result*=a;
       }
       return result;

    }


    static int mod(int a,int b){
        int result=a%=b;
        System.out.println("Mod alma : " +result );
        return result;
    }
    static int rec(int a ,int b){
        System.out.println("Çevresi : " +(2*(a+b)));
        System.out.println("Alanı : " +(a*b) );
        return 0;
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int select;
        String menu="1-Toplama İşlemi \n"
                +"2-Çıkarma İşlemi \n"
                +"3-Çarpma İşlemi \n"
                +"4-Bölme İşlemi \n"
                +"5-Üslü sayı Hesaplama \n"
                +"6-Mod alma \n"
                +"7-Dikdörtgen Alan ve Çevre Hesabı \n"
                +"8-Çıkış yap\n";
        while(true) {
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz : ");
            select = input.nextInt();
            if(select==0){
                break;
            }
            System.out.print("İlk sayı : ");
            int a = input.nextInt();
            System.out.print("İkinci sayı : ");
            int b = input.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;

                case 2:
                    sub(a,b);
                    break;
                case 3:
                    multi(a,b);
                    break;
                case 4:
                    div(a,b);
                    break;
                case 5:
                    System.out.println("Üs Hesabı" + power(a,b));
                    break;
                case 6:
                    System.out.println("Mod İşlemi "+ mod(a,b));
                    break;
                case 7:
                    rec(a,b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz ");






            }
        }


        System.out.println("Güle Güle");
    }
}
