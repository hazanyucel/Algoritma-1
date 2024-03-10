/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FINAL_2SINIF;

import java.util.Scanner;

/**
 **Klayveden rastgele sayılar giriliyor. Bu sayılar içinde 10 tane asal sayı
 *girildiğnde bu sayıları diziye atan ve dizideki en büyük sayıyı ekrana yazan programı yazınız.
 * @author Hazan
 */
public class final5_2 {
    public static void main(String[] args) {
       int asalSayisi = 0;
        int enB;
        int sayac = 0;
        int sayi;
        int dizi[] = new int[10];
        Scanner k = new Scanner(System.in);
        int kontrol = -1;
        System.out.println("Sayilari girin");

        while (asalSayisi<10) {
            sayi = k.nextInt();
            for (int i = 1; i <= sayi; i++) {
                if (sayi % i == 0) {
                    sayac++;
                }
            }
            if (sayac == 2 || sayi == 2) {
                dizi[asalSayisi] = sayi;
                asalSayisi++;

            }
            sayac = 0;

        }
        enB = dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > enB) {
                enB = dizi[i];
            }
        }
        System.out.println("en buyuk "+enB);

}
    }
    

