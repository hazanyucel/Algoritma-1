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
public class neyinkatı {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz:");
        int sayi=klavye.nextInt();
        if(sayi%5==0){
            System.out.println(sayi+ " sayısı 5'in katı");
        }
         if (sayi%2==0){
             System.out.println(sayi+ " sayısı 2'nin katı");
             
         }       
         else{
             System.out.println("Sayı 2'nin de 5'in de katı değil!"); 
         }
    }
    
}
