import java .util.Scanner;
public class notOrtalaması  {

    public static void main(String[] args) {
//Değişkenleri oluştur
        int mat,fizik,kimya,turkce,tarih,muzik;
        //Scanner sınıfı tanımla
Scanner inp =new Scanner(System.in);

//Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz:");
        mat=inp.nextInt();
        System.out.println("Fizik Notunuz:");
        fizik= inp.nextInt();
        System.out.println("Kimya Notunuz:");
        kimya=inp.nextInt();
        System.out.println("Türkçe Notunuz:");
        turkce= inp.nextInt();
        System.out.println("Tarih Notunuz:");
        tarih= inp.nextInt();
        System.out.println("Müzik Notunuz: ");
        muzik=inp.nextInt();

        int  toplam =(mat+fizik+kimya+turkce+muzik);

        double sonuc = toplam/5.0;
        System.out.println("Ortalamanız:" +sonuc);

       //KALDI GECTİ HESAPLAMASI YAPMAK İÇİN
        System.out.println(sonuc<50?"Sınıfta kaldınız":"Sınıfı geçtiniz" );












    }
}
