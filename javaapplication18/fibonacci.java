/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

/**
 *
 * @author Hazan
 */
public class fibonacci {
    public static void main(String[] args) {
            int a=1 , b=1, c=0,toplam=0;
            for (int i = 1; i <= 100; i++) {
            c=a+b;
            toplam=toplam+c;
            a=b;
            b=c; 
        }
            System.out.println(toplam);
    }
}
