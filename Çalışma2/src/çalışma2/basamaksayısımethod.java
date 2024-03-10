/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package çalışma2;

import java.util.Scanner;

/**
 * parametre olarak gelen pozitif tamsayının basamak sayısı
 *
 * @author Hazan
 */
public class basamaksayısımethod {

    public static void main(String[] args) {
        int x, y;
        Scanner k = new Scanner(System.in);
        x = k.nextInt();
        y = basamak(x);
        System.out.println(y);
    }

    public static int basamak(int a) {
        int bass = 1;//1den başlatma sebebim 0dan 9a kadar olan sayılar 10a bölünmez ama 1 basamaklıdır onun basamağını da saydım
        while (a / 10 > 0) {
            bass++;
            a = a / 10;
        }

        return bass;

    }
}
