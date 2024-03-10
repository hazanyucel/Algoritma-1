/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package study;
//ilk dizideki tek sayıları ikinci diziye atayan 
public class dizi {

    public static void main(String[] args) {
        int[] dizi = new int[20];
        int sayac = 0;
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100);
            if (dizi[i] % 2 == 1) {
                sayac++;

            }
            System.out.println(i+". eleman "+dizi[i]);
        }
        System.out.println("----------------");
        int[] list = new int[sayac];
        int j = 0;
        for (int i = 0; i < list.length; i++) {
            if (dizi[i]%2==1) {
                list[j]=dizi[i];
                j++;
            }
            
                
            }
        for (int i = 0; i < sayac; i++) {
            System.out.println("tek dizi "+i+". elemanı= "+list[i]);
        }
        }
    }

