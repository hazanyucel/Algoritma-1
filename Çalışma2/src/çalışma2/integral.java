/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package çalışma2;

import java.util.Scanner;

/**
 *
 * @author Hazan
 */
public class integral {

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        double katsayi, kuvvet;
        System.out.print("Değişkenin Katsayısını Giriniz: ");
        katsayi = oku.nextDouble();
        System.out.print("Değişkenin Kuvvetini Giriniz: ");
        kuvvet = oku.nextDouble();
        integral(katsayi, kuvvet);
    }

    public static void integral(double katsayi, double kuvvet) {
        Scanner oku = new Scanner(System.in);
        double a, b, h, sonuc = 0, x, F, F_ilk, F_son;
        System.out.print("integrali alınacak fonksiyonun ilk x noktasını belirleyiniz: ");
        a = oku.nextDouble();
        System.out.print("integrali alınacak fonksiyonun son x noktasını belirleyiniz: ");
        b = oku.nextDouble();
        //h=(b-a)/n;

        h = 0.0001;
        for (x = a + h; x <= b; x += h) {
            F = Math.pow(x, kuvvet);
            F = F * katsayi;
            sonuc = sonuc + F * h;
        }
        F_ilk = Math.pow(a, kuvvet);
        F_ilk = F_ilk * katsayi;
        F_son = Math.pow(b, kuvvet);
        F_son = F_son * katsayi;
        sonuc = sonuc + h / 2 * (F_ilk + F_son);

        System.out.println("x= " + a + " ve " + b + " aralığında, fonksiyonun yaklaşık olarak integrali: " + (int) sonuc);
    }
}
