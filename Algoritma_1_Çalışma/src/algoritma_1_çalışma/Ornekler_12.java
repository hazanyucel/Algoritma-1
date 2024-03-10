package algoritma_1_çalışma;

import java.util.Scanner;

/*
 * @author Hazan
 */
public class Ornekler_12 {

    public static void main(String[] args) {
        //klavyeden girilen stringin 10 karakterden büyük mü küçük mü olduğunu gösteren program.
        Scanner k = new Scanner(System.in);
        System.out.println("SORU 1");
        System.out.print("Bir String giriniz: ");
        String s = k.next();
        int uz = s.length();
        if (uz > 10) {
            System.out.println("Girilen String 10 karakterden büyük");
        } else {
            System.out.println("Girilen String 10 karakterden büyük değil");
        }
        System.out.println("----------------------------------------");
        //Klavyeden girilen sayı pozitif mi negatif mi?
        System.out.println("SORU 2");
        System.out.println("Klavyeden bir sayı giriniz: ");
        int sayi = k.nextInt();
        if (sayi >= 0) {
            System.out.println("Sayı pozitiftir.");
        } else {
            System.out.println("Sayı negatiftir.");
            System.out.println("----------------------------------------");
        }
        //dairenin alanını hesaplayan program
        System.out.println("SORU 3");
        System.out.println("Dairenin çapını giriniz: ");
        int r = k.nextInt();
        double alan;
        double pi = 3.14;
        if (r > 0) {
            alan = r * r * pi;
            System.out.println("dairenin alanı: " + alan);
        } else {
            System.out.println("0 dan küçük sayı girdiniz!");
        }
        System.out.println("----------------------------------------");
        // klavyeden girilen pozitif tam sayılara kadar olan tamsayıları ekrana yazan program.
        System.out.println("SORU 4");
        int sayı;
        while (true) {
            System.out.println("Sayı giriniz");
            sayı = k.nextInt();
            if (sayı < 0) {
                System.out.println(sayı);
            }
            if (sayı > 0) {
                System.out.println("Pozitif sayı girişi!");
                System.out.println(sayı);
                break;
            }
        }
        System.out.println("----------------------------------------");
        //Klavyeye girilen sayılar toplanacaktır.0 girince duran ve toplamı ekrana yazan program.
        System.out.println("SORU 5");
        int sayılar;
        int toplam = 0;
        while (true) {
            System.out.print("sayı giriniz: ");
            sayılar = k.nextInt();
            if (sayılar != 0) {
                toplam += sayılar;
            } else {
                System.out.println("0 girişi");
                break;
            }
        }
        System.out.println("Toplam= " + toplam);
        //klavyeden girilen 10 tane stringi ekrana yazan programı giriniz.
        System.out.println("SORU 6");
        String string;
        for (int i = 0; i < 10; i++) {
            string = k.nextLine();
            System.out.println(string);
        }
        System.out.println("----------------------------------------");
        //Klavyeden girilen String’ler içerisinde ilk harfi a ve A olanları ekrana yazan, ilk karakteri q girildiği zaman programdan çıkan java programı yazınız. 
        System.out.println("SORU 7");
        String str;
        while (true) {
            System.out.println("string giriniz: ");
            str = k.next();
            if (str.charAt(0) == 'a' || str.charAt(0) == 'A') {
                System.out.println(str);
            } else {
                if (str.charAt(0) == 'q') {
                    break;
                }
            }
        }
        //Klavyeden girilen 10 tamsayı içerisinde en büyüğünü, en küçüğünü ve aritmetik ortalamasını bulup ekrana yazan java programı yazınız. 
        System.out.println("SORU 8");
        int first = k.nextInt();
        int maxNumber = first;
        int minNumber = first;
        double toplam_ = 0;
        int count = 10;
        System.out.println("Lütfen 10 tamsayı giriniz:");
        for (int i = 1; i < count; i++) {
            System.out.print((i + 1) + ". sayı: ");
            int number = k.nextInt();
            if (number > maxNumber) {
                maxNumber = number;
            }
            if (number < minNumber) {
                minNumber = number;
            }
            toplam_ += number;
        }
        double average = toplam_ / count;
        System.out.println("En büyük sayı: " + maxNumber);
        System.out.println("En küçük sayı: " + minNumber);
        System.out.println("Aritmetik ortalama: " + average);
        System.out.println("----------------------------------------");
        System.out.println("SORU 9");
        //Kullanıcıdan tamsayı girmesini isteyen bir program yazınız. Eğer sayı 5’e bölünebiliyorsa «sayı 5’in katları» 
        //mesajını yazsın.
        //Eğer sayı ikiye bölünüyorsa sayı çift mesajı yazsın
        System.out.println("Tamsayı giriniz: ");
        int tams = k.nextInt();
        if (tams % 5 == 0) {
            System.out.println("SAYİ 5'İN KATI");
        } else if (tams % 2 == 0) {
            System.out.println("SAYI ÇİFT");
        }
        System.out.println("----------------------------------------");
        System.out.println("SORU 10");
//        EBOB
        System.out.println("Birinci sayıyı girin");
        int sayi1 = k.nextInt();
        System.out.println("İkinci sayıyı girin");
        int sayi2 = k.nextInt();
        int enbbolen = 1, A = 2;
        while (A <= sayi1 && A <= sayi2) {
            if (sayi1 % A == 0 && sayi2 % A == 0) {
                enbbolen = A;
            }
            A++;
        }
        System.out.println("En büyük ortak bölen = " + enbbolen);
        System.out.println("----------------------------------------");
        System.out.println("SORU 11");
        //YILDIZ ÖRNEĞİ 
        int sayac = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                sayac++;
            }
            System.out.println("");
        }
        System.out.println("----------------------------------------");
////        f(x) ve g(x) fonksiyonları aşağıdaki gibi tanımlanmaktadır. x değeri
//        klavyeden girildiğine göre, f(x) ve g(x)’i hesaplatan ve yazdıran bir Java programı
//        yazınız.
//        x>0 ise f(x) = 1/(1+x) ve g(x) = 1/ (x + x2)
//        x≤0 ise f(x) =  ve g(x) = 1/ (1 + x + x2 + x3)
        System.out.println("SORU 12");
        System.out.println("Bir x değeri giriniz: ");
        double x = k.nextDouble();
        double fx, gx;
        if (x > 0) {
            fx = 1 / (1 + x);
            gx = 1 / (x + x * x);

        } else {
            fx = 1 / (1 + x * x);
            gx = 1 / (1 + x + x * x + Math.pow(x, 3));

        }
        System.out.println("f(x)=" + fx);
        System.out.println("g(x)=" + gx);
//Girilen bir sayının basamak sayısını hesaplama
System.out.println("----------------------------------------");
        System.out.println("SORU 13");
          
    }
}
