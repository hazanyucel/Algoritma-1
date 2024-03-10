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
public class sagadonduren {

    public static void main(String[] args) {
        int list[] = {1,7,2,9,0,8,3,5,6,4};
       int yedek=list[9];
        for (int i = 8; i >=0; i--) {
            list[i+1]=list[i];
        }
        list[0]=yedek;
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        }
        
    }

