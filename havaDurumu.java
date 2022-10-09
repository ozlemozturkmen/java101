import java.util.Scanner;

public class havaDurumu {
    public static void main(String[] args) {
        int heat;
        Scanner input=new Scanner(System.in);
        System.out.print("sıcaklık değeri giriniz : ");
        heat=input.nextInt();
        if (heat<5){
            System.out.println("kayak yapabilirsin");
        } else if (heat<=25) {
            if (heat <= 15 || heat >= 10)
                System.out.println("Pikniğe veya sinemaya gidebilirsin");
        }else {
                System.out.println("Yüzmeye gidebilirsin");


        }

    }


}
