/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package study;

import java.util.Scanner;

/**
 * iki boyutlu string dizisindeki stringleri birleştiren her bir satırını ayrı
 * ayrı birleştirip string dizisi oluşturan satırlarını birleştiren sütunlarını
 * birleştirip tek string
 *iki boyutlu mtris toplamı çarpımı transpouzunu alan ÖDEV
 * @author Hazan
 */
public class stringdizi {

    public static void main(String[] args) {
        String str[][] = {{"ab", "ef", "kl"}, {"37", "2af", "bd"}, {"aaa", "ddbcd", "a"}};
        String[] yedek = new String[3];
        String s = "";
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                s += str[i][j];//1. soru 3. soru
                yedek[i] = yedek[i] + str[i][j];//ikinci soru
            }                          // j  i  
        }
        System.out.println(s);
        for (int i = 0; i < yedek.length; i++) {//2.
            System.out.println(yedek[i]);//2.
        }
        System.out.println(s);//3. soru
        s = "";//3.soru
    }

}
