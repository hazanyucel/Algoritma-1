/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;

import java.util.Scanner;

public class Soruçözme {
    public static void main(String[] args) {
        int sayi1= (int)(Math.random()*100);
        int sayi2= (int)(Math.random()*100);
        if (sayi1<sayi2){
            int temp=sayi1;
            sayi1=sayi2;
            sayi2=temp;
        }
        System.out.println("Soru:"+sayi1+ "-"+sayi2+"=?");
        Scanner oku=new Scanner(System.in);
        int kullanici_sonuc=oku.nextInt();
        int gercek_sonuc=sayi1-sayi2;
        if (gercek_sonuc==kullanici_sonuc){
            System.out.println("Cevabiniz Dogru");    
        }
        else {
            System.out.println("Cevabiniz Yanlis");
            System.out.println("Dogru Sonuc="+gercek_sonuc);
        }
    }
    
}
 