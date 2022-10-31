import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args) {
        int n,r,com;
        int fac1=1,fac2=1,fac3=1;
        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayı giriniz : " );
        n=scan.nextInt();
        System.out.print("kombinasyonu alınacak sayıyı giriniz : " );
        r= scan.nextInt();
        // ilk olarak n faktöriyeli hesaplama
        for(int i=1;i<=n ;i++){
            fac1*=i;
        }
        // r faktöriyel hesaplama
        for(int i=1;i<=r;i++){
            fac2 *=i;
        }
        //(n-r)! faktöriyelini hesaplama
        for(int i=1;i<=(n-r);i++){
            fac3*=i;
        }
        com=fac1/(fac2*fac3);
        System.out.println("Kombinasyon" +com);




    }

}
