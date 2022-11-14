import java.util.Scanner;
public class javaOdev {
 static void num(int n){
     System.out.print(n+" ");
     if(n>0){
         num(n-5);
         System.out.print(n+" ");
     }
     }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz : " );
        int a= input.nextInt();
        num(a);
        input.close();
    }


}
