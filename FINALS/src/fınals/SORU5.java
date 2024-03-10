/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fınals;

import java.util.Scanner;

/*Klayveden rastgele sayılar giriliyor. Bu sayılar içinde 10 tane asal sayı
 *girildiğnde bu sayıları diziye atan ve dizideki en büyük sayıyı ekrana yazan programı yazınız.
 *
 * @author Hazan
 */
public class SORU5 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] dizi = new int[10];
        int sayac = 0;
        while (sayac < 10) {
            boolean cond = true;
            int sayi = read.nextInt();
            if (sayi > 0)
                for (int i = 2; i < sayi; i++) {
                    if (sayi % i == 0) cond = false;
                }
            if ((cond == true || sayi == 2) && sayi != 1) {
                dizi[sayac] = sayi;
                sayac++;
            }
        }
        int enb = dizi[0];
        for (int i = 1; i < 10; i++) {
            if (dizi[i] > enb) enb = dizi[i];
        }
        System.out.println("en buyuk sayi: "+enb);
        
    }
}
