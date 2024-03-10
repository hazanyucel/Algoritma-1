
package javaapplication18;

import java.util.Scanner;



public class Çarpım {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int number1, number2, number3, carpim;
        System.out.println("Write a number:");
        number1=read.nextInt();
        System.out.println("Write another number:");
        number2=read.nextInt();
        System.out.println("Write third number:");
        number3=read.nextInt();
        carpim=number1*number2*number3; 
        System.out.println("Multiplications="+carpim);
        
        
    }
    
}
