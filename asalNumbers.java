import java.util.Scanner;
public class asalNumbers {
    static void asal(int num,int i){
        if(i==num){
            System.out.println(num +  " asal sayıdır.");
            return;
        } else if (num%i==0) {
            System.out.println(num + " asal sayı değildir .");
            return;
        }
        asal(num,i+1);
    }

    public static void main(String[] args) {
        int num;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        num=input.nextInt();
        asal(num,2);
    }







}




