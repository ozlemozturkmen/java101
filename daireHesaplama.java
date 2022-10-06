package Giris;
import java.util.Scanner;


public class daireHesaplama {
    public static void main(String[] args) {
        int r ;
        double aci ;
        double pi=3.14;
        Scanner input =new Scanner(System.in);
        //kullanıcıdan değer alma
        System.out.print("Yarıçap değeri giriniz :");
        r=input.nextInt();
        System.out.println("Dairenin açı değerini giriniz");
        aci= input.nextDouble();



        double alan = (pi*r*r);
        double cevre =(2*pi*r);
        double dilim =(pi*(r*r)*aci)/360;

        System.out.println("Dairenin alanı "+alan);
        System.out.println("Dairenin çevresi " + cevre);
        System.out.println("Daire diliminin alani "+dilim);

    }
}
