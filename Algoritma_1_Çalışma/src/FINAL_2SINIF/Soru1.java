/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FINAL_2SINIF;

import java.util.Scanner;

/**
 *
 * @author Hazan
 */
public class Soru1 {
    public static int toplam(int a,int b){
        return a+b;
    }
    public static int üs(int a ,int b){
        int us=1;
        for (int i = 0; i<b; i++) {
            us*=a;
    }
        return us;
    }
    public static void ad_yaz(int sayi,String isim){
        for (int i = 0; i < sayi; i++) {
            System.out.println(isim);
        }
        
    }
    public static int basamak(int a){
        int sayac=1;
        while(a>10){
            a=a/10;
            sayac++;
        }
        return sayac;
    }
    public static int fibonacci(int n){
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
        
    
    public static void main(String[] args) {
        System.out.println(toplam(5,6));
        System.out.println(üs(3,3));
        ad_yaz(3,"hazan");
        System.out.println(basamak(45632));
        System.out.println(fibonacci(5));
        
    }
}
