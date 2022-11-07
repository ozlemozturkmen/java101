import java.util.Scanner;
public class perfectNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("bir sayı giriniz : " );
       int  n=input.nextInt();
       int total=0;
       for(int i=1;i<n;i++){
           if(n %i==0){
               total+=i;

           }

       }
       if(n==total){
           System.out.println(n+"Mükemmel sayıdır.");

       }else{
           System.out.println(n+"Mükemmel sayı değildir.");
       }

       }
    }

