/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author Hazan
 */
public class vizefinal { 
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("ortalama giriniz:");
        double ort=klavye.nextDouble();
        if(ort>4){
            System.out.println("hatali ortalama");
        }
        else if (ort<=2.0){
            System.out.println("sinifta kaldiniz");
    }
        else if (ort>=3.0){
            System.out.println("onur listesine girdiniz");
        }
        else if ((ort>2)&&(ort<3.0)){
            System.out.println("sinifi geçtiniz");
        }
    }
}
