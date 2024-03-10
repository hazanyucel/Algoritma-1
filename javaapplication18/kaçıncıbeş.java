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
public class kaçıncıbeş {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int sayi;
        for (int i = 1; i <= 10; i++) {
            sayi=k.nextInt();
            if (sayi==5) {
                System.out.println("5 sayısı"+i+"inci sıradadır.");
                
            }
            
        }
        
    }
}
