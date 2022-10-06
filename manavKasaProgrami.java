import java.util.Scanner;
public class manavKasaProgrami {
    public static void main(String[] args) {
        /*
       pear=2.14;
        apple=3.67;
        tomato=1.11;
        banana=0.95;
       aubergine=5.00;

         */
        double pear=2.14,apple=3.67,tomato=1.11,banana=0.95,aubergine=5.00;
        double p,a,t,b,au, total;
        Scanner input=new Scanner(System.in);
        System.out.println("How many kg of pears did you buy? ");
        p=input.nextDouble();

        System.out.println("How many kg of apples did you buy? ");
        a=input.nextDouble();

        System.out.println("How many kg of tomatoes did you buy? ");
        t=input.nextDouble();
        System.out.println("How many kg of bananas did you buy? ");
        b=input.nextDouble();
        System.out.println("How many kg of aubergines did you buy?");
        au=input.nextDouble();
        total=(p*pear)+(a*apple)+(t*tomato)+(b*banana)+(au*aubergine);
        System.out.println("TotalPrice: " +total);






    }


}
