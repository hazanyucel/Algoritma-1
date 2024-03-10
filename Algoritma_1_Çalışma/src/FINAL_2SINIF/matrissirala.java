/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FINAL_2SINIF;

import java.util.Scanner;

/**
 *
 * @author Hazan
 */
public class matrissirala {
       public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int [][] a=new int [3][4];
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j <a[i].length; j++) {
                a[i][j]=klavye.nextInt();
            }
        }
       
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j <a[i].length-1; j++) {
                for (int k = 0; k <a[i].length-j-1; k++) {
                    if (a[i][k]>a[i][k+1]) {
                        // elemanları yer degıstır
                        int temp=a[i][k];
                        a[i][k]=a[i][k+1];
                        a[i][k+1]=temp;
                    }
                    
                }
               
            }
        }
        
        System.out.println("sıralanmıs matrıs");
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j <a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        
        
       }

}
