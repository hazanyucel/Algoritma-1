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
public class sıfırdadurdur {
    public static void main(String[] args) {
        int t;
        Scanner k=new Scanner(System.in);
        int toplam=0;
        for(;;){ //while(true){ for un içi boş olunca sonsuz döngü demek
        t=k.nextInt();
        if(t==0){
        System.out.println(toplam);System.exit(1);
        }
        toplam+=t;
         
      }
   }
}
