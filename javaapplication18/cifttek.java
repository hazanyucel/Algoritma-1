/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

import java.util.Scanner;

public class cifttek {
    public static void main(String[] args) {
        int sayi1,sayi2,sayi3;
        Scanner oku=new Scanner(System.in);
        sayi1=oku.nextInt(); 
        sayi2=oku.nextInt();
        sayi3=oku.nextInt();
        if (sayi1%2==0) {
            System.out.println("Sayi-1 Cifttir.");
            
        }
        else {
            System.out.println("Sayi-1 Tektir.");
        }
        if (sayi2%2==0) {
            System.out.println("Sayi-2 Cifttir.");
            
        }
        else{
            System.out.println("Sayi-2 Tektir.");
        }
        if (sayi3%2==0) {
            System.out.println("Sayi-3 Cifttir.");
            
        }
        else {
            System.out.println("Sayı-3 Tektir.");
        }
    }
    
}
