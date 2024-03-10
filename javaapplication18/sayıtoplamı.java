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
public class sayıtoplamı {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int sayi , toplam=0;
        for (int i = 0; i < 10; i++) {
            System.out.println(i+". sayıyı giriniz");
            sayi=oku.nextInt();
            System.out.println(i+". sayı"+sayi); 
            toplam=toplam+sayi;
        }

        System.out.println("10 tane sayının toplamı"+toplam);
        
    }
    
}
