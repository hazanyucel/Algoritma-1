/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

import java.util.Scanner;

//klavyeden girilen pozitif tamsayıya kadar olan tam sayıları ekrana yazan programı yapınız.

public class tamsayıahmethoca {
    public static void main(String[] args) {
        int x;
        Scanner k=new Scanner(System.in); 
        System.out.println("Bir pozitif tamsayı giriniz:");
        //new ifadesi somutlaştırmadır.Hafızada gerçekleşir.
        x=k.nextInt();
        if (x<=0) System.exit(1); //programdan çıkış için kullanılır.() çıkılacak yer ile ilgili
        for (int i = 1; i < x; i++) {
            System.out.print("\n"+i);
        }
        //for döngüsünde kullanılan değişkenin son değeri her zaman için bir sonraki değeri gösterir.
        
            
        
        
    } 
    
}
