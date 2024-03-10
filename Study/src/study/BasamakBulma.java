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
public class BasamakBulma {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int sayi=(int)(Math.random()*999);
        System.out.println("Seçilen Sayı: "+sayi);
        int yuzler , onlar , birler ,carpim;
        yuzler=sayi/100;
        sayi=sayi%100;
        onlar=sayi/10;
        sayi=sayi%10;
        birler=sayi;
        System.out.println("Birler Basamağı " +birler);
        System.out.println("Onlar Basamağı " +onlar);
        System.out.println("Yüzler Basamağı " +yuzler);
        carpim=birler*onlar*yuzler;
        System.out.println("BASAMAK ÇARPIMI "+carpim);
    }
}
 