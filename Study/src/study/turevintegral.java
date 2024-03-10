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
      
public class turevintegral {
    public static Scanner oku = new Scanner(System.in);

    public static void main(String[] args) 
    {
        //Scanner oku = new Scanner(System.in);
        double katsayi,kuvvet;
        byte secenek;
        System.out.print("Değişkenin Katsayısını Giriniz: ");
        katsayi = oku.nextDouble();
        System.out.print("Değişkenin Kuvvetini Giriniz: ");
        kuvvet = oku.nextDouble();
         
        System.out.println("türev için 1'e\nintegral için 2'ye basınız");
        secenek=oku.nextByte();
        if(secenek==1)
        {
            turev(katsayi,kuvvet);
        }
        else 
        {
            integral(katsayi,kuvvet);
        }    
    }
     
    public static void turev(double katsayi, double kuvvet)
    {
        double x0,fx0,x1,fx1,sonuc,h=0.00001;
        System.out.print("x=");
        x0 = oku.nextDouble();
         
        fx0=Math.pow(x0, kuvvet);
        fx0=fx0*katsayi;
        System.out.println("fx0 "+fx0);
        x1=x0+h;
        fx1=Math.pow(x1, kuvvet);
        fx1=fx1*katsayi;
        sonuc=(fx1-fx0)/(x1-x0);
        System.out.println("x="+x0+" noktasında, fonksiyonun yaklaşık olarak türevi: "+sonuc);
    }
     
    public static void integral(double katsayi, double kuvvet)
    {
        double a,b,h,sonuc=0,x,F,F_ilk,F_son;
        System.out.print("integrali alınacak fonksiyonun ilk x noktasını belirleyiniz: ");
        a = oku.nextDouble();
        System.out.print("integrali alınacak fonksiyonun son x noktasını belirleyiniz: ");
        b = oku.nextDouble();
        //h=(b-a)/n;
         
        h=0.0001;
        for(x=a+h;x<=b;x+=h)
        {
            F=Math.pow(x, kuvvet);
            F=F*katsayi;
            sonuc=sonuc+F*h;
        }
        F_ilk=Math.pow(a, kuvvet);
        F_ilk=F_ilk*katsayi;
        F_son=Math.pow(b, kuvvet);
        F_son=F_son*katsayi;
        sonuc=sonuc+h/2*(F_ilk+F_son);
         
        System.out.println("x= "+a+" ve "+b+" aralığında, fonksiyonun yaklaşık olarak integrali: "+(int)sonuc);
    }
}


  
 
    
      

