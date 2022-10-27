import java.util.Scanner;
public class ucVeDortBolunebilme {
    public static void main(String[] args) {
        // 0'dan girilen 3 ve 4 'e tam bölünen sayıları bulma
        int k,sayac=0,sum=0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        k = inp.nextInt();
        for(int i=0; i<k;i++){
            if(i%3==0 && i%4==0){
                System.out.println(i);
                sum+=i;
                sayac++;


            }
        }
        double ortalama=sum/(sayac);
        System.out.print(ortalama);
    }
}

