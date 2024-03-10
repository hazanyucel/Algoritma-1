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
public class QUIZ2 {

    public static void main(String[] args) {
        
        /*String kelime;
        System.out.println("Bir String giriniz: ");
        kelime=k.nextLine();
        int kucuk = kelime.charAt(94,120);
        if (kelime=kucuk) {
            System.out.println(kucuk);
        } else {
            System.out.println("Küçük harf yok!");
        }
        
        }*/
        Scanner read = new Scanner(System.in); 
        System.out.print("String giriniz: ");
        String kelime1 = read.nextLine(); 
        String kelime2 = kelime1.toLowerCase();

        char harf1, harf2;
        int sayac = 0;


        for (int i = 0; i < kelime1.length(); i++) {
            harf1 = kelime1.charAt(i);
            harf2 = kelime2.charAt(i);
            if (harf1 == harf2) {
                sayac += 1;
            }
        }
        System.out.println("Girilen kelimenin küçük harfler sayısı = " + sayac);
             
             
                
            }
        }

    

