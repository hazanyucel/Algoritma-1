/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author Hazan
 * 
klavyeden girilen iki tamsayı arasındaki sayıları kendileri de dahil olmak üzere ekrana yazan progrmı yapınız.
 */
public class aradakisayi {
    public static void main(String[] args) {
        int a,b;
        Scanner k=new Scanner(System.in);
        a=k.nextInt();
        b=k.nextInt();
        if(a==b) System.out.println("SAYILAR EŞİT");
        else if(a<b){ for (int i = a; i < b; i++){ System.out.println(i);}}
        else{ for (int i = a; i < b; i--) System.out.println(i);}

}
        
                
            }
    
    

//sayı değişken tiplerinde sayı değişken tiplerinin başına unsigned yazılırsa sayının bütün değerleri pozitif olarak kullanılabilir.