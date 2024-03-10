/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritma_1_çalışma;

import java.util.Scanner;

/**
 *
 * @author Hazan
 */
public class Ornekler2_10 {

    /**
     *
     * metodu yazınız.
     */
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
       
        String kelime, toplam = "";
        while (true) {
            kelime = k.next();
            if (kelime.equals("EXIT")) {
                break;

            } else if (kelime.length() > 5) {
                toplam += kelime;
                System.out.println("5 den büyük yazılan kelimelerin toplamı : " + toplam);
            }
        }
//fibonacci
//        int a = 1, b = 1, c = 0, toplam_ = 0;
//        for (int i = 1; i <= 100; i++) {
//            c = a + b;
//            toplam_ = toplam_ + c;
//            a = b;
//            b = c; 
//        }
//        System.out.println(toplam_);
//        int i = 0, sayilar;
//        while (i < 10) {
//            sayilar = k.nextInt();
//            if (sayilar % 5 == 0 && sayilar!=0) {
//                System.out.println("5'e bölünen sayının sırası : " + (i+1));
//            }
//            i++;
//               }
// int sayac=0; 
// while(true){
//     int sayi=k.nextInt();
//     
//     if (sayi==5) {
//       sayac++;         
//     }
//     if (sayac==10) {
//        break;
//     }
// }
//
//        System.out.print("Bir tamsayı giriniz: ");
//        int number = k.nextInt();
//
//        int count = 0;
//        int temp = number;
//        int basamak = 0;
//
//        while (temp > 0) {
//            basamak++;
//            if (temp % 10 == 5) {
//                count++;
//                System.out.println("5 rakamı " + basamak + ". basamakta bulundu");
//            }
//            temp /= 10;
//        }
//
//        System.out.println("Girilen sayıda " + count + " adet 5 rakamı bulunmaktadır.");
//        float sayi = k.nextFloat();
//        if (sayi >= Math.pow(-2, 31) && sayi <= Math.pow(2, 31)-1) {
//            System.out.println("sayi integer");
//        } else {
//            System.out.println("sayi integer degil!");
//        }
//        int t = 0, c = 1;
//        for (int i = 2; i < 3; i++) {
//            for (int m = 1; m < 2; m++) {
//                c=c*i+m;
//                t=t+c;
//                c=1;
//
//            }
//            System.out.println(t);
//        }
//        int t = 0, c = 1;
//        for (int n = 1; n < 2; n++) {
//            for (int m = 3; m <= 5; m++) {
//                t +=(n + m * 3) / m;
//                c *= t;
//                t = 0;
//            }
//            System.out.println(c);
//        }
//        String s = k.next();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'i') {
//                System.out.println(i + ". indiste " + s.charAt(i) + " sesli harfi var");
//            } else {
//            }           
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a string:");
//        String input = scanner.nextLine();
//
//        System.out.println("All possible substrings of the given string are:");
//        for (int i = 0; i < input.length(); i++) {
//            for (int j = i + 1; j <= input.length(); j++) {
//                System.out.println(input.substring(i, j));
//            }
//        }
//        System.out.println("Kaç sayı karsılastırmak istersiniz? ");
//        int sayi = k.nextInt();
//        System.out.print("1. sayiyi giriniz: ");
//        int min = k.nextInt();
//        for (int i = 1; i < sayi; i++) {
//            System.out.print((i+1)+". sayiyi giriniz: ");
//            int sayilar = k.nextInt();
//            if (sayilar < min) {
//                min = sayilar;
//            }
//        }
//        System.out.println(" En küçük sayı= "+min);
//        int ilk, son;
//        System.out.println("Sayıları gir");
//        ilk = k.nextInt();
//        son = k.nextInt();
//        int sayac = 0;
//
//        for (int i = 2; i <= ilk; i++) {
//            if (ilk % i == 0 && son % i == 0) {
//                System.out.println("Ortak bölenleri : " + i);
//                sayac++;
//            }
//
//        }
//        if (sayac == 0) {
//            System.out.println("Aralarında asal");
//        } else {
//            System.out.println("Aralarında asal değil");
//        }
//        int n = k.nextInt();
//        int i = 0, top = 0;
//         while(i<=n){
//             top+=i;
//             i++;
//         }
//        for (int j = 0; j <= n; j++) {
//            top += j;
//        }
//        System.out.println(top);
//        System.out.println("kelimeyi giriniz:");
//        String a1 = k.next();
//        int bas = 0, son = (a1.length() - 1);
//        boolean a = true;
//        for (int i = 0; i < a1.length(); i++) {
//            if (a1.charAt(bas) != a1.charAt(son)) {
//                a = false;
//                System.out.println("palindrom değildir");
//                break;
//
//            }
//            if (a == true) {
//
//            }
//
//        }
//        System.out.println("palindromdur");
//
//        System.out.println("dort basamaklı tam sayı girin");
//        int sayi=k.nextInt();
//       
//        int en_buyuk;
//        if (sayi >= 1000 && sayi < 10000) {
//            en_buyuk = sayi % 10;
//            sayi /= 10;
//            while (sayi != 0) {
//                if (sayi % 10 > en_buyuk) {
//                    en_buyuk = sayi % 10;
//                }
//                sayi /= 10;
//            }
//            System.out.println("en buyuk deger" + en_buyuk);
//        }

    }
}

