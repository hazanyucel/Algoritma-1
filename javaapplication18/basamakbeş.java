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
public class basamakbeş {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        boolean t=true;
        String x=k.next();
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i)>='0'&& x.charAt(i)<='9') {
                t=true;
                
                
            }
            
        }
                
    }
}
