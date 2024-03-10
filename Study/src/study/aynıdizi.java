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
public class aynıdizi {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int[][] list = new int[5][5];
        for (int i = 0; i <=5; i++) {
            for (int j = 0; j <= 5; j++) {
                list[i][j] = k.nextInt();
            }
        }
        for (int i = 0; i <list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i]==list[j]) {
                    System.out.println("eşittir"); //???????????????????????????
                }
            }
        }
    }
}
