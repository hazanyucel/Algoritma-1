/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package study;

import java.util.Scanner;

/**
 * klavyeden girilen 10 pozitif sayının ortalamasını alan program
 *
 * @author Hazan
 */
public class QUIZ {

    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int sayi, toplam=0;
        double ort,sayac=0.0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Bir sayı giriniz: ");
            sayi = k.nextInt();
            if (sayi <= 0) {
                System.out.println("Negatif sayı girişi!");
                break;
            } else {
                toplam = toplam + sayi;
                sayac++;
                ort = toplam /sayac ;
                System.out.println("Ortalama: " + ort);
            }
        }


        //Klavyeden girilen 10 tam sayının pozitif olanların ortalamasını hesapalyan programı yazınız.
//        Scanner read = new Scanner(System.in);
//        int i, sayi;
//        double ortalama, sayac = 0.0, toplam = 0.0;
//        for (i = 0; i < 10; i++) {
//            System.out.print("Sayi giriniz: ");
//            sayi = read.nextInt();
//
//            if (sayi > 0) { 
//                toplam = toplam + sayi;
//                sayac += 1;
//            }
//        }
//        ortalama = toplam / sayac;
//        System.out.println("Girilen pozitif sayıların ortalaması = " + ortalama);
    }

}
