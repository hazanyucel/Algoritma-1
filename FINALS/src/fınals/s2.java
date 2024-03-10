/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fınals;

/**
 *
 * @author Hazan
 */
public class s2 {

    public static int fak(int sayi) {
        int sonuc = 1;
        for (int i = sayi; i > 0; i--) {
            sonuc *= i;
        }
        return sonuc;
    }

    public static int fonskiyon1() {
        int toplam = 0;
        for (int i = 1; i < 4; i++) {
            double carpim = 1;
            for (int j = 1; j < 4; j++) {
                double sonuc = 1;
                for (int k = 0; k < fak(j); k++) {
                    sonuc *= 1 + i;
                }
                carpim *= sonuc / Math.cos(j);
            }
            toplam += carpim;
        }
        return toplam;
    }

    public static void main(String[] args) {
        System.out.println(fonskiyon1());
    }
}
