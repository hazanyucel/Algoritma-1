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
public class Karesi {
    public static void main(String[] args) {
        int sayi , karesi;
        System.out.println("Bir Sayi Giriniz=");
        Scanner k=new Scanner(System.in); 
        sayi=k.nextInt();
        karesi=sayi*sayi;
        System.out.println("Karesi="+karesi);
        
       
    }
    
}
