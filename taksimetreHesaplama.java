import java.util.Scanner;
public class taksimetreHesaplama {
    public static void main(String[] args) {
        double km;
        Scanner input =new Scanner(System.in);
        //Kullanıcıdan değer alma
        System.out.print("km 'yi yazınız ");
        km= input.nextDouble();
        double perKm =2.20,total=10;
        total=+(km*perKm);
        total=(total<20) ? 20:total;
        System.out.println("Toplam Tutar "+total);
        // total+=10; şeklindede denilebilir











    }


}
