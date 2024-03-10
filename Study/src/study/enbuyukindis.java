/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package study;

import java.util.Scanner;

/**
 * İki boyutlu tamsayı dizisindeki en büyük elemanın indisini yazdıran.
 *
 * @author Hazan
 */
public class enbuyukindis {

    public static void main(String[] args) {
        int[][] dizi = new int[5][5];
        
        Scanner k = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dizi[i][j] = k.nextInt();
            }

        }
        int enb=dizi[0][0];
        int sat=0,sut=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (dizi[i][j]>enb) {
                    enb=dizi[i][j];
                    sat=i;
                    sut=j;
                }
            }
        }
    }
}
