import java.util.Scanner;
public class ucakBiletiFiyati {
    public static void main(String[] args) {



        Scanner scan= new Scanner(System.in);
        int select,age,distance;
        // gittiği mesafe başına 0.10 tl belirleme
        double perKm=0.10;
        double ageDiscount,normalPrice,discountedPrice,roundTrip,totalPrice;
        System.out.println("Mesafeyi km cinsinden yazınız : ");
        distance= scan.nextInt();
        System.out.println("Yaşınızı giriniz : ");
        age= scan.nextInt();
        System.out.println("Yolculuk tipini giriniz: (1=>Tek yönlü gidiş , 2=> Gidiş-Dönüş bileti):");
        select= scan.nextInt();
        if (select == 1|| select==2 && distance >0 && age>0) {    //doğru veri girmeyi sağlamak için
            if (select==1) {
                if (age < 12) {
                    normalPrice = distance * perKm;
                    ageDiscount = normalPrice * 0.50;
                    totalPrice = normalPrice - ageDiscount;
                    System.out.println("Ödeyecek tutar : " + totalPrice);

                } else if (age < 24 && age > 12) {   //12-24 yaş aralığı indirim hesabı
                    normalPrice = distance * perKm;
                    ageDiscount = normalPrice * 0.10;
                    totalPrice = normalPrice - ageDiscount;
                    System.out.println("Ödenecek tutar:" + totalPrice);
                } else if (age > 65) {     //65 yaş üstü indirim %30
                    normalPrice = distance * perKm;
                    ageDiscount = normalPrice * 0.30;
                    totalPrice = normalPrice - ageDiscount;
                    System.out.println("Ödenecek tutar:" + totalPrice);


                } else if (age > 24 && age < 65)    //indirim yok
                {
                    totalPrice = distance * perKm;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);
                } else {
                    System.out.println("Hatalı veri girdiniz!");
                }

            }if(select==2)//gidiş dönüş durumu
                {
                    if (age<12)
                    {
                        normalPrice=distance*perKm;
                        ageDiscount=normalPrice*0.50;
                        discountedPrice=normalPrice-ageDiscount;
                        roundTrip=discountedPrice*0.20;
                        totalPrice=(discountedPrice-roundTrip)*2;
                        System.out.println("Ödeyeceğiniz tutar:" +totalPrice);

                    } else if (age<24 && age>12) {
                        normalPrice=distance*perKm;
                        ageDiscount=normalPrice*0.10;
                        discountedPrice=normalPrice-ageDiscount;
                        roundTrip=discountedPrice*0.20;
                        totalPrice=(discountedPrice-roundTrip)*2;
                        System.out.println("Ödenecek tutar:" +totalPrice);


                    } else if (age>65) {
                        normalPrice=distance*perKm;
                        ageDiscount=normalPrice*0.30;
                        discountedPrice=normalPrice-ageDiscount;
                        roundTrip=discountedPrice*0.20;
                        totalPrice=(discountedPrice-roundTrip)*2;
                        System.out.println("Ödeyeceğiniz tutar:" +totalPrice);


                    } else if (age>24 && age<65) {
                        totalPrice=distance*perKm*2;
                        System.out.println("Ödeyeceğiniz tutar:" +totalPrice);



                    }
                    else{
                        System.out.println("Hatalı veri girdiniz!");
                    }
                }else{
                    System.out.println("Hatalı veri girdiniz!");
                }




        }





        }



    }






