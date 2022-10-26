import java.util.Scanner;
public class artikYil {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int year;
        System.out.println("Yıl giriniz : ");
        year= scan.nextInt();

        if (year%4==0)
            if(year%100==0 && year%400==0){
                System.out.print(year + " artık bir yıldır");
            }else {
                System.out.println("Artık bir yıl değilidir");
            }





    }
}
