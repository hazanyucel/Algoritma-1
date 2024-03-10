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
public class intaralık {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int x;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE);
        x=k.nextInt();
        if (x<Integer.MIN_VALUE || x>Integer.MAX_VALUE) {
            System.out.println("girilen değer için değişkeni yanlış seçtiniz! ");
        }
    } 
}
