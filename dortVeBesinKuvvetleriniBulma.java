import java.util.Scanner;
public class dortVeBesinKuvvetleriniBulma {
    public static void main(String[] args) {
        int k;
        Scanner inp=new Scanner(System.in);
        System.out.print("bir sayı giriniz : " );
        k= inp.nextInt();

        System.out.print(k+"sayısından küçük dördün kuvvetleri:");
        for (int i=1;i<=k; i*=4){
            System.out.println(i);
        }
        System.out.print(k+"sayısından küçük beşin kuvvetleri : ");
        for (int i=1;i<=k; i*=5){
            System.out.println(i);
        }





    }

    }

