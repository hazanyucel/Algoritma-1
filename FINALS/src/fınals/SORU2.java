/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fınals;
/**
 *
 * @author Hazan
 */
public class SORU2 {

 

    public static int faktoriyel(int k) {
        int f = 1;
        for (int i = k; i >0; i--) {
            f = f * i;
        }
        return f;
    }

    public static double soru2(int sonuc) {
        int toplam = 0, carpim = 1;
        for (int j = 1; j <4; j++) {
            for (int k = 1; k <4; k++) { 
                carpim*= (Math.pow(1+j, faktoriyel(k)) / Math.cos((k * 6.28) / 360.0));
                toplam+=carpim;
            }
        }
        return carpim;

    }
    public static void main(String[] args) {
        int a=0;
        System.out.println(soru2(a));
    }
}
