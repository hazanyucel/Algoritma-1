/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;
import java.util.Scanner;
public class Sayısıralama {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        char ara;
        System.out.println("üç karakter giriniz:");
        char a=k.next().charAt(0);
        char b=k.next().charAt(0);
        char c=k.next().charAt(0);
        if (a>b){
            ara=a; a=b; b=ara;
        }
        if (a>c){
            ara=a; a=c; c=ara;
        }        
        if(b>c){
            ara=b; b=c; c=ara;
        }
        System.out.println("sıralanmış karakterler:"+a+""+b+""+c);
    }
    
}
