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
public class ahmethocaornek {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
//        System.out.println("Bir kelime giriniz:");
//        String s=k.next();
//        for (int i = 0; i <s.length(); i++) {
//            if (s.charAt(i)=='a')
//                System.out.println(i);
//            {
//                
//            }
//            
//        }
//         String s=k.nextLine();
//         for (int i = 0; i <s.length(); i++) {
//             if (s.charAt(i)=='b'||s.charAt(i)=='B')System.out.println("b ya da B vardır."); {
//                 
//             }
//            
//        }

        String s = k.nextLine();
        int sayac1 = 0, sayac2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') {
                sayac1++;
            } else if (s.charAt(i) == 'B') {
                sayac2++;
            } else; {
                System.out.println(sayac1 + "" + sayac2);
            }

            {

            }
        }
    }

}
