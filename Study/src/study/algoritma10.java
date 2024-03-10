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
public class algoritma10 {
    public static void main(String[] args) {
        //klavyeden girilen 10 elemanlı dizinin toplamını yazın
       Scanner k=new Scanner(System.in);
       int top=0;
       int[] notlar=new int[10];
        for (int i = 0; i < 10; i++) {
            notlar[i]=k.nextInt();
            top=top+notlar[i];
            
        }
        System.out.println(top); 
        
    }
}
