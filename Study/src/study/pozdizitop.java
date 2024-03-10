/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package study;

import java.util.Scanner;

/**
 *poz sayı ortalama bulduran
 * @author Hazan
 */
public class pozdizitop {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int[] list=new int[10];
        int say=0,top=0;
        for (int i = 0; i <list.length; i++) {
            list[i]=k.nextInt();
            if (list[i]>0) {
                top+=list[i];
                say++;

            }
        }
        if (say==0) {
            System.out.println("Pozitif yok!!");
        }
        else
            System.out.println((double)top/say); 
    }
         
}
