/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package study;

import java.util.Scanner;

/**
 * tek boyutlu string dizisindeki stringleri tersten ekrana yazan ,indis olarak
 * tersten yazan , küçükleri büyük büyükleri küçük yapan
 *
 * @author Hazan
 */
public class HAFTA9 {

    public static void main(String[] args) {
        //stringleri tersten yazan
//        String str[] = {"aklm", "prs", "j3kab"};
//        for (int i = 0; i < 3; i++) {
//            String s = "";
//            for (int j = 0; j < str[i].length(); j++) {
//                s = str[i].charAt(j) + s;
//            }
//            str[i] = s;
//            System.out.println(str[i]);
//            
//        }
//indis olarak tersten yazan
//        String str[] = {"aklm", "prs", "j3kab"};
//        for (int i = 0; i < 3; i++) {
//            System.out.println(str[2 - i]);
//
//        } 
        String str[] = {"aklm", "prs", "j3kab"};
        String[] s = new String[3];
        for (int i = 0; i < 3; i++) {
            s[2 - i] = str[i];
        }
        for (int i = 0; i < 3; i++) {
            String yedek = "";
            for (int j = 0; j < s[i].length(); j++) {
                if (s[i].charAt(j) >= 'a' && s[i].charAt(j) <= 'z') {
                    yedek = yedek + (char) (s[i].charAt(j) - 32);}
                    else if (s[i].charAt(j)>='A' && s[i].charAt(j)<='Z') {
                            yedek=yedek+(char)(s[i].charAt(j)+32);
    
}
                             else 
                            yedek=yedek+s[i].charAt(j);

                }
            }for (int i = 0; i < 3; i++) {
                System.out.println(s[i]);
            }
        }

    }

