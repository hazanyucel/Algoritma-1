/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;

import java.util.Scanner;


public class HesapMakinesii {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int a,b;
        String c;
        System.out.println("iki tamsayı giriniz");
        a=klavye.nextInt();
        b=klavye.nextInt();
        System.out.println("bir operator giriniz:(+,-,/,*)");
        c=klavye.next();
        switch(c){
            case"+":System.out.println("Toplam:"+(a+b)); break;
            case"-":System.out.println("Fark:"+(a-b)); break;
            case"/":System.out.println("Bölüm:"+((double)a/b)); break;
            case"*":System.out.println("Çarpım:"+(a*b)); break;
            default:System.out.println("Yanlış operatör girdiniz.");
        } 
        

 }
}

    
