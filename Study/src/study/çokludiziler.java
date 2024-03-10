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
public class çokludiziler {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int [][] list=new int[2][2];
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                list[i][j]=k.nextInt();
                
            }
        }
        for (int i = 0; i <list.length ; i++) {
           int top=0;
            for (int j = 0; j < list[i].length; j++) {
                top+=list[i][j];
            }
            System.out.println(top);
        }
         
    }
}
