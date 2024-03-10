/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package study;

import java.util.Scanner;

/**
 * en uzun sayının yeri/ en uzun stringin yeri
 *
 * @author Hazan
 */
public class enuzunstring {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int[] list = new int[10];//String dizisi tanımlarsın
        for (int i = 0; i < list.length; i++) {
            list[i] = k.nextInt(i);//k.next();

        }
        int enb = list[0];// int enb=list[0].length();
        int yer = 0;
        for (int i = 1; i < list.length; i++) {
            if (enb < list[i]) {//list[i].length();
                enb = list[i];
                yer = i;
            }

        }
    }
}
