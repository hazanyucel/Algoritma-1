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
public class Canımsıkıldı {

    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int star = k.nextInt();
        for (int i = 1; i <=star ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        int i = 1;
//        while (i <= star) {
//            int b = 1;
//            while (b <= i) {
//                System.out.print("*");
//                b++;
//            }
//
//            System.out.println();
//            i++;
//                
//            }

        }

    }

