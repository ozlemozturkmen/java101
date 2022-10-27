import java.util.Scanner;
public class tekSayiToplami {
    public static void main(String[] args) {
        int n;
        int total=0;
        Scanner scan=new Scanner(System.in);

        do{
            System.out.print("sayı giriniz : " );
            n= scan.nextInt();




             if(n%4==0){
                total+=n;
            } else if (n%2==1) {
                 break;
             }


        } while(n%2 == 0  );
        System.out.println("Toplam : " +total);



    }
}
