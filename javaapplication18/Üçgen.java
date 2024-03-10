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
public class Üçgen {
    public static void main(String[] args) {
      Scanner klavye=new Scanner(System.in);
      int a,b,c;
        System.out.println("Uc kenar giriniz:");
        a=klavye.nextInt();
        b=klavye.nextInt();
        c=klavye.nextInt();
        if(a==b && b==c) System.out.println("Eskenar Ucgen");
        else if (a==b || b==c || a==c)
            System.out.println("Ikizkenar Ucgen");
        else System.out.println("Cesit Kenar Ucgen");
    }
    
}
