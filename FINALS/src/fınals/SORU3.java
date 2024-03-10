/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fınals;

import java.util.Scanner;

/**
 *
 */
public class SORU3 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String str[][] = new String[2][2];
        System.out.println("String Dizisini Giriniz: ");
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                str[i][j] = k.next();
            }
        }
        tekkarakter(str);

    }

    public static void tekkarakter(String[][] a) {
        String bos = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j].length() % 2 == 1) {
                    bos += a[i][j];
                    bos+=" ";
                }
            }
        }
        System.out.println(bos);
    }
}
