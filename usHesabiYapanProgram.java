import java. util.Scanner;
public class usHesabiYapanProgram {
    static int pow(int a,int b) {
        if(b==0) return 1;
        return a*pow(a,b-1);

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Taban değerini giriniz : " );
        int a= input.nextInt();
        System.out.print("Üs değerini giriniz : " );
        int b=input.nextInt();

        System.out.println("Sonuc : " +pow(a,b));
    }
}



