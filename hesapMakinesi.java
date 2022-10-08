import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner inp=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz :");
        n1=inp.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        n2=inp.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select= inp.nextInt();

        switch (select){
            case 1:
            System.out.print("Toplam: " + (n1 + n2));
            break;
            case 2:
                System.out.println("Çıkarma : " + (n1-n2));
                break;
            case 3 :
                System.out.println("Çarpma :" +(n1*n2));

                break;
            case 4 :
                if(n2!=0) {
                    System.out.println("Bolme: " + (n1/n2));
                }else {
                    System.out.println("Bir sayi 0'a bolunemez!");
                }
                break;




            default:
                System.out.println("Yanlış seçim yaptınız .Lütfen tekrar deneyiniz ");


        }
        }
}
