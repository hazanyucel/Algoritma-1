/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fınals;

import java.util.Scanner;

/*
 *Klavyeden girilen sayılar içerisinde sıfır sayısı girildiğinde o ana kadar girilen
 *sayıları toplayan sonucu ekrana yazan ve bu işlemi 10 kez tekrarlayan programı yazınız
 * @author Hazan
 */
public class SORU4 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Sayı Giriniz:");
        for (int i = 0; i < 10; i++) {
            int toplam = 0;
            while (true) {
                int x = k.nextInt();
                if (x==0) {
                    System.out.println("Girdiğiniz sayıların toplamı= "+toplam);
                }else toplam+=x;
            }

        } 
    }
} 
