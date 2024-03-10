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
public class AmiralBattı {
    public static void main(String[] args) {
        System.out.println("İsminizi Giriniz:");
        Scanner k=new Scanner(System.in);
        String isim1=k.nextLine();
        System.out.println("Sevgilinizin ismini giriniz:");
        String isim2=k.nextLine();
        int puan=isim1.length()+isim2.length(); 
        if (isim1.length()>isim2.length()) {
            puan-=3;}
        else{
            puan+=3;
        }
        puan=puan*69/(100+isim2.length());
        if (puan>10) {
            puan=10;
        }
        System.out.println(isim1+ " ile " +isim2+" çiftinin aşk puanı: "+puan);
    } 
 
}
