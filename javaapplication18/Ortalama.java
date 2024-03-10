/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author Hazan
 */
public class Ortalama {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Birinci Sayiyi Giriniz:");
        double sayi1=read.nextDouble();
        System.out.println("Ikinci Sayiyi Giriniz:");
        double sayi2=read.nextInt(); 
        System.out.println("Ucuncu Sayiyi Giriniz");
        double sayi3=read.nextInt();
        System.out.println("Dorduncu Sayiyi Giriniz");
        double sayi4=read.nextInt();
        if (sayi4==0) {
            System.out.println("0'a bolme hatasi");
        }
        else{
            double sonuc=(sayi1+sayi2+sayi3)/sayi4;
            System.out.println("Sonuc="+sonuc);
        }
                
             
        
    }
    
}
