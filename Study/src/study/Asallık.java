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
public class Asallık {
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
        int sayac;
        
        System.out.println("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        
        while(sayi > 2) {
            
            sayac = 0;
            for(int i = 2; i < sayi; i++)
            {
                if(sayi % i == 0) {
                    sayac++;
                }
            }
            if(sayac == 0) {
                System.out.println(sayi + " asal bir sayidir.");
            }
            sayi--;
        } 
                
            }
}
