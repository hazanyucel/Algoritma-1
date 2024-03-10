/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

import java.util.Scanner;


public class sayıbulmaoyunu {
    public static void main(String[] args) {
      int sayi=(int)(Math.random()*21);
      int tahmini_sayi;//tahmini_sayi=-1 
      Scanner oku=new Scanner(System.in);
        System.out.println("0 ile 20 arasındaki sayıyı tahmin ediniz");
        for (int i = 0; i < 10; i++) { //while(sayi!=tahmini_sayi
            System.out.println("Tahmininiz:");
            tahmini_sayi=oku.nextInt();
            if (sayi>tahmini_sayi) {
                System.out.println("Sayı daha büyük");
                
            }
            else if (sayi<tahmini_sayi) {
                System.out.println("Sayi daha küçük");
            }
            else {
                System.out.println("Tebrikler!");
            break;
            }
        }
    }
    
}
//while ile yapınca olanlar için sonsuza kadar istediğin kadar deneyebilmen için.