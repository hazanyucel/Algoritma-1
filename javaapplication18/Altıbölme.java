/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;

/**
 *
 * @author Hazan
 */
public class Altıbölme {

    public static void main(String[] args) {
        int sayi1 = (int) (Math.random() * 100);
        System.out.println("Uretilen sayi="+sayi1);
        if (sayi1 % 2 == 0 && sayi1 % 3 == 0) {
            System.out.println("Sayı 6'ya bölünür.!");

        } 
        else if (sayi1%2==0 || sayi1%3==0){
            if (sayi1%2==0) {
                System.out.println("Sayı 2'ye bölünür.");
            }
            else {
                System.out.println("Sayı 3'e bölünür."); 
            }
        } 
        else {
            System.out.println("Sayı 6'ya bölünemez.");
        }
    }

}
