import java.util.Scanner;
public class basamakSayilariToplami {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print(" bir sayı giriniz : ") ;
        int num= input.nextInt();
         int basCount=0;
         int total=0;
         while(num!=0){
            total+=(num%10);
            num/=10;
            ++basCount;


         }
        System.out.println(" basamak sayısı : "  +basCount);
        System.out.println(" basamak toplamı : " +total );




    }
}
