import java.util.Scanner;
public class vucutKitleIndeksi {
    public static void main(String[] args) {
        double kg;
        double boy;
        Scanner input=new Scanner(System.in);
        //Kullanıcıdan değer alma
        System.out.println("Lütfen kilonuzu kg cinsinden giriniz: ");
        kg= input.nextDouble();
        System.out.println("Lütfen boyunuzu  metre cinsinden giriniz : ");
        boy=input.nextDouble();
        double indeks= (kg/boy*boy);
        System.out.println("Vücut kitle indeksiniz : " + indeks);



    }
}
