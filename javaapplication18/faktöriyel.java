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
public class faktöriyel {

    public static void main(String[] args) {
        int x , f = 1 ;
        Scanner klavye = new Scanner(System.in);
        x = klavye.nextInt();
        if (x < 0) {
            System.out.println("negatif sayı girdiniz");
            System.exit(1);
        }
        if (x == 1 || x == 0) {
            System.out.println("1");}
            else {
                    for (int i = 2; i <= x; i++)
              f = f*i;  
                    System.out.println(f);
}  
        }
    }


//çarpma şeklinde artan, bölme şeklinde azalan sayıların başlangıç değeri 1 yapılır.toplama şeklinde artan eksilme şeklinde azalan sayıların başlangıç değeri 0 yapılır
//String ifadelerinde ise başlangıç değeri String s=""; şeklinde yapılır.
//char da ise char c=''; şeklinde yapılır.

