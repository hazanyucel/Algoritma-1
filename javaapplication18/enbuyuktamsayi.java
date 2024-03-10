/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

//import java.util.Scanner;

import java.util.Scanner;


/**
 Klavyeden girilen 10 tamsayıdan en büyük tek sayıyı ekrana yazdıran java programı (çıkmış soru)
 * @author Hazan
 */

public class enbuyuktamsayi {
    public static void main(String[] args) {
        int enbuyuk=0,sayac=0;
        Scanner k=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int sayi=k.nextInt();
            if (sayi>enbuyuk && sayi%2==0) {
                sayi=enbuyuk;
                sayac++;
            }
        }
            System.out.println(enbuyuk);
        }} 
      
//1 2 10 20 50 100tl bozuk paralardan yeterince elinizde mevcut.
//Bir miktar parayı en az bozuk para adedi ile bozdurmak istiyoruz.klavyeden 
//girilen tamsayıyı bozulacak para olarak kabul edip en az bozuk para sayısını ekrana yazan program
       
       //???
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    
            
            

