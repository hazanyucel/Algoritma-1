/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package study;

/**
 * küçükten büyüğe sıralama
 *yaptığımız bubblesort algoritması oluyor.
 * @author Hazan
 */
public class zor {

    public static void main(String[] args) {
        int list[] = {1, 7, 2, 9, 0, 8, 3, 5, 6, 4};
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    int yedek = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = yedek;
                }

            }

        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
