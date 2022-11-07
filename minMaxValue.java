import java.util.Scanner;
public class minMaxValue {
    public static void main(String[] args) {
        int n,number,maxNumber=0,minNumber=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz ? : " );
         n= input.nextInt();
         for(int i=1;i<=n;i++){

             System.out.print("Lütfen " + i + " .sayıyı giriniz : ");
             number = input.nextInt();



             if (i == 1) {
                 maxNumber = number;
                 minNumber = number;


             } else if (number < minNumber) {
                 minNumber = number;


             } else {
                 if (number > maxNumber) {
                     maxNumber = number;


                 }
             }
         }


        System.out.println("En büyük sayı : " +maxNumber);
        System.out.println("En küçük sayı : " + minNumber);



    }

}
