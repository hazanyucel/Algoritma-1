/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author Hazan
 */
public class UcakBiletiHesaplama {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int km, yas, tip;
        System.out.println("Mesafeyi Giriniz(km): ");
        km = k.nextInt();
        System.out.println("Yaşınızı Giriniz:");
        yas = k.nextInt();
        System.out.println("Yolculuk Tipini Seçiniz (1-Tek Gidiş 2-Gidiş Dönüş):");
        tip = k.nextInt();

        double normalFiyat, yasIndirimi, tipIndirimi;
        if (km > 0 && yas > 0 && (tip == 1 || tip == 2)) {
            normalFiyat = km * 0.10;
            if (yas < 12) {
                yasIndirimi = normalFiyat * 0.5;//indirim oranı
            } else if (yas >= 12 && yas <= 24) {
                yasIndirimi = normalFiyat * 0.10;
            } else if (yas > 65) {
                yasIndirimi = normalFiyat * 0.30;
            } else {
                yasIndirimi = 0;
            }
            normalFiyat -= yasIndirimi;//fiyattan indirimi çıkar
            if (tip == 2) {
                tipIndirimi = normalFiyat * 0.20;
                normalFiyat = (normalFiyat - tipIndirimi) * 2;
            }
            System.out.println("Bilet Tutarı\n" + normalFiyat + "TL");
        } else {
            System.out.println("Girdiğiniz değerler eksik veya yanlış lütfen tekrar deneyiniz!");

        }
    }
}
