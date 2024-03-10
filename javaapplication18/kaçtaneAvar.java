/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author Hazan
 */
public class kaçtaneAvar {

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin = oku.nextLine();
        char karakter = 'a';
        int tane = 0;
        for (int i = 0; i < metin.length(); i++) {
            if (karakter == metin.charAt(i)) {
                ++tane;
            }

        }
        System.out.println(karakter + "harfi yazı içinde" + tane + "tanedir.");
    }
}
