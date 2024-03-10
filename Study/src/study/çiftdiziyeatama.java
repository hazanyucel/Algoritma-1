/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package study;

import java.util.Scanner;

/**
 *
 * @author Hazan
 */
public class çiftdiziyeatama {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int[] dizi = new int[20];
        int sayac = 0;
        int sayi;
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100);
            if (dizi[i] % 2 == 0) {
                sayac++;

            }
            System.out.println(i + ". eleman " + dizi[i]);
        }
        System.out.println("----------------");
        int[] list = new int[sayac];
        int j = 0;
        for (int i = 0; i < list.length; i++) {
            if (dizi[i] % 2 == 0) {
                list[j] = dizi[i];
                j++;
            }

        }
        System.out.print("Bir sayı giriniz:");
            sayi = k.nextInt();
        for (int i = 0; i < sayac; i++) {
            System.out.println("çift dizi " + i + ". elemanı= " + list[i]);
            
            if (sayi == list[i]) {
                System.out.println("Bu sayı dizinin içindedir!");
            } else {
                System.out.println("Bu sayı dizinin içinde yoktur!");
            }
        }

    }
}
