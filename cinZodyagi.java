import java.util.Scanner;
public class cinZodyagi {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int year;
        double select;
        double zodyak;
        String burc ="";
        System.out.print("Doğum yılınızı giriniz : ");

        year= scan.nextInt();
        select = year%12;
       if(select==0){
           burc="maymun";
           System.out.print("Çin zodyağı burcunuz: " + burc);

       } else if (select==1) {
           burc="horoz";
           System.out.print("Çin zodyağı burcunuz:"  + burc);


       }
       else if(select==2){
           burc="köpek";
           System.out.println("Çin zodyağı burcunuz: " + burc);


       } else if (select==3) {
           burc="domuz";
           System.out.print("Çin zodyağı burcunuz:+ " + burc);

       } else if (select==4) {
           burc="fare";
           System.out.print("Çin zodyağı burcunuz:" +  burc );

       } else if (select==5) {
           burc="öküz;";
           System.out.print("Çin zodyağı burcunuz: " + burc);

       } else if (select==6) {
           burc="kaplan";
           System.out.print("Çin zodyağı burcunuz: " + burc);

       } else if (select==7) {
           burc="Tavşan";
           System.out.print("Çin zodyağı burcunuz: " + burc);

       } else if (select==8) {
           burc="ejderha";
           System.out.print("Çin zodyağı burcunuz: " + burc);

       } else if (select==9) {
           burc="yılan";
           System.out.print("Çin zodyağı burcunuz: " + burc);

       } else if (select==10) {
           burc="at";
           System.out.print("Çin zodyağı burcunuz: " + burc);
       } else if (select==11) {
           burc="koyun ";
           System.out.print("Çin zodyağı burcunuz: " + burc);

       }


    }
}
