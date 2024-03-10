/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package çalışma2;

import java.util.Scanner;

/**
 *kendisine parametre olarak gelen sayının kaç basamaklı olduğunu hesaplayan
 * 
 * @author Hazan
 */
public class kacbasamak {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int x=k.nextInt();
        int n=basamak(x);
        System.out.println(n);
    }
    public static int basamak(int a){
        if (a>=-9 && a<=9) 
            return 1;
        else
            return 1+basamak(a/10); 
    }
}
