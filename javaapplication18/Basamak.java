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
public class Basamak {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz");
        int sayi1=read.nextInt();
        int yuzler,onlar,birler;
        yuzler=sayi1/100;
        sayi1=sayi1%100;
        onlar=sayi1/10;
        sayi1=sayi1%10;
        birler=sayi1;
        System.out.println("Birler Basamagi="+birler);
        System.out.println("Onlar Basamagi="+onlar);
        System.out.println("Yuzler Basamagi="+yuzler);
               
        
       
    } 
    
}
