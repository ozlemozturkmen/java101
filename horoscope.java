import java.util.Scanner;
public class horoscope {
    public static void main(String[] args) {
        int month,day;
        String burc ="";

        boolean isError = false;
        Scanner input= new Scanner(System.in);
        System.out.println("Doğduğunuz ay rakamla giriniz: ");

        month=input.nextInt();

        System.out.println("Doğduğunuz gün rakamla giriniz: ");

        day= input.nextInt();
      //else if kısmına okumada geçmiyor sebebini bulamadım.Hatada almıyorum
         if (month==1){
            if(day>=1 && day <=31){
                if(day<22){
                    burc="Oğlak";
                }else {
                    burc="Kova";
                }

            }else{
                isError=true;
            }
        } else if (month==2) {
            if (day>=1 && day<=28){
                if(day<20){
                    burc="Kova";
                }else{
                    burc="Balik";
                }



            }else{
                isError=true;
            }


        } else if (month==3) {
            if (day >=1 && day <=31 ){
                if(day<21){
                    burc="Balik";

                }else{
                    burc="Koç";
                }


            }else{
                isError=true;
            }

        } else if (month==4) {
            if (day>=1 && day<=31){
                if (day<22){
                    burc="Koç";
                }else{

                } burc="Boğa";



            }else{
                isError=true;
            }


            } else if (month==5) {
            if (day>=1 && day<=31){
                if (day<22){
                    burc="Boğa";


                }else{
                    burc="ikizler";
                }

            }
            else {
                isError=true;
            }



        } else if (month==6) {
            if (day>=1 && day<=30){
                if (day<23){
                    burc="ikizler";

                }else{
                    burc="yengeç";
                }

            }else{
                isError=true;
            }

        } else if (month==7) {
            if (day>=1 && day<=30){
                if (day<23){
                    burc="yengec";

                }else{
                    burc="aslan";
                }


            }else {
                isError=true;
            }

        } else if (month==8) {
            if (day >=1 && day<=31){
                if(day<23){
                    burc="aslan";

                }else {
                    burc="başak";
                }
            }else{
                isError=true;
            }

        } else if (month ==9){
            if (day>=1 && day<=31 ){
                if (day<23){
                    burc="başak";

                }
                else{
                    burc="terazi";
                }



            } else {
              isError=true;
            }
        } else if (month==10) {
            if (day>=1 && day<=31){
                if (day<23){
                    burc="terazi";
                }else{
                    burc="akrep";
                }


            }else{
                isError=true;
            }

        } else if (month==11){
            if (day>=1 && day<=30 ){
                if(day<22){
                    burc="akrep";

                }else{
                    burc="yay";
                }
            }else{
                isError=true;
            }
        } else if (month==12) {
            if (day>=1 && day<=31){
                if(day<22){
                    burc="yay";
                }else {
                    burc="oğlak";
                }

            }else{
                isError=true;
            } if (isError){
                 System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz.");
             }else{
                 System.out.println("Burcunuz : "+burc);
             }
         }

        }
    }



