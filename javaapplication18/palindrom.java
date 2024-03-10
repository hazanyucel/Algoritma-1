/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

import java.util.Scanner;

/**
 * anlamadım bu örneği
 *
 * @author Hazan
 */
public class palindrom {

    public static void main(String[] args) {
//        Scanner oku=new Scanner(System.in);
//        System.out.println("String giriniz");
//        String s=oku.nextLine();
//        int bas=0;
//        int son=s.length()-1;
//        boolean kontrol=true;
//        while(bas<son){
//            if (s.charAt(bas)!=s.charAt(son)) {
//                kontrol=false;
//                break;
//            }
//            bas++;
//            son--;
//            
//    }
//        if (kontrol) {
//            System.out.println("palindromdur");
//        }
//    else
//            System.out.println("palindrom değildir");
        Scanner k = new Scanner(System.in);
        System.out.println("kelimeyi giriniz:");
        String a1 = k.next();
        int bas = 0, son = (a1.length() - 1);
        boolean a = true;
        for (int i = 0; i < a1.length(); i++) {
            if (a1.charAt(bas) != a1.charAt(son)) {
                a = false;
                System.out.println("palindrom değildir");
                break;

            }
            if (a == true) {

            }

        }
        System.out.println("palindromdur");
    }
}
