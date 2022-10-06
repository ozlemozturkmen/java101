import java.util.Scanner;
public class dikUcgenHesaplama {
    public static void main(String[] args) {
        //Değişken oluşturma
       double a,b,c;
        Scanner inp =new Scanner(System.in);
        System.out.println("Kenar uzunluğunu giriniz:");
        a= inp.nextDouble();
        System.out.println("Kenar uzunluğunu giriniz:");
        b= inp.nextDouble();
        c = ((a*a)+(b*b));
        System.out.println("Dik üçgen uzunluğu"+Math.sqrt(c));
        //c=Math.sqrt((a*a)+(b*b)); c bu şekilde de hesaplanabilir






    }



}

