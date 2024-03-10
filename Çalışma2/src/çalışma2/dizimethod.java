/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package çalışma2;

import java.util.Scanner;

/**
 *
 * @author Hazan
 */
public class dizimethod {
    public static void main(String[] args) {
        int x[]={1,7,3,6,5,2};
        Scanner k=new Scanner(System.in);
        double y=toplam(x);
        System.out.println(y);
    }
    public static double toplam(int[]a){
        int top=0;
        for (int i = 0; i < a.length; i++) {
            top+=a[i];
        }
        return top/6.0;
    } 
} 
