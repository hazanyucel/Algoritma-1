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
public class Yazıuzunluk {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Bir cümle giriniz:");
        String ileti; 
        ileti=klavye.next();
        int uzunluk=ileti.length();
        if(uzunluk<55){
            System.out.println("Kısa bir cümle");
        }
        else{
            System.out.println("Uzun bir cümle");
        }
                
    }
    
}
