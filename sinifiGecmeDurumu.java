import java.util.Scanner;
public class sinifiGecmeDurumu {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        Scanner input = new Scanner(System.in);
        System.out.print(" Matematik notunuz : " );
        mat= input.nextInt();
        System.out.print("Fizik notunuz : " );
        fizik= input.nextInt();
        System.out.print("Türkçe notunuz : " );
        turkce= input.nextInt();
        System.out.print("Kimya notunuz : " );
        kimya= input.nextInt();
        System.out.print("Müzik notunuz : " );
        muzik= input.nextInt();
        double avarage=(mat+fizik+kimya+muzik+turkce)/5;

        if(avarage<=55){
            System.out.println("Sınıfta kaldınız,tekrar görüşmek üzere! ");


        }else if(avarage>=55 && avarage<=100) {
            if (avarage>0) {
            }
            System.out.println("Tebrikler,sınıfı geçtiniz! ");

        }else{

            System.out.println("Geçersiz not");
            }

        System.out.println("Ortalamanız : " + avarage);
        }





















    }

