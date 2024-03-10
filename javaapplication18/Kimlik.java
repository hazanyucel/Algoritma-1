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
public class Kimlik {

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("Adiniz:");
        String ad = oku.nextLine();
        System.out.println("Cinsiyet:");
        String cinsiyet = oku.nextLine();
        char c = cinsiyet.charAt(0);
        System.out.println("Telefon:");
        String mobilno = oku.nextLine();
        System.out.println("Ad=" + ad);
        System.out.println("Cinsiyet=" + c);
        System.out.println("Telefon Numarası=" + mobilno);

    }

}
