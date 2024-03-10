/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package study;

import java.util.Scanner;

/**
 * 10 elemanlı string dizisindeki en uzun ikinci elemanın yeri
 *
 * @author Hazan
 */
public class NewClass {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int enb1, enb2;
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = k.nextInt();
        }
        if (list[0] > list[1]) {
            enb1 = list[0];
            enb2 = list[1];
        } else {
            enb1 = list[1];
            enb2 = list[0];
        }
        for (int i = 2; i < list.length; i++) {
            if (list[i] > enb1) {
                enb2 = enb1;
                enb1 = list[i];
            }
            if (list[i] < enb1 && list[i] > enb2) {
                enb2 = list[i];
            }
        }
        System.out.println(enb2);
    }

}
