import java.util.Scanner;
// KDV TUTARI HESAPLAYAN PROGRAM//


public class kdv1 {
    public static void main(String[] args) {
  double tutar,kdvOran,kdvTutar,kdvliTutar;
  Scanner input=new Scanner(System.in);
        System.out.print("Tutarı giriniz:");
        tutar=input.nextDouble();
        kdvOran=(tutar<=1000)?0.18:0.08; //Ödev
        kdvTutar=tutar*kdvOran;
        kdvliTutar=tutar+kdvTutar;
        System.out.println("Kdv'siz fiyat : " +tutar);
        System.out.println("Kdv Orani :" +kdvOran);
        System.out.println("KDV'li Fiyat :" +kdvliTutar);
        System.out.println("Kdv Tutarı "+kdvTutar);






















    }
}
