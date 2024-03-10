/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package çalışma2;

/**
 * kendisine parametre olarak gelen 10 elemanlı tamsayı dizisindeki pozitif 
 * sayıların adedini yazan
 *
 * @author Hazan
 */
public class pozitifsayısayısı {

    public static void main(String[] args) {
        int[] x = {1, 2, 3, -3, 4, -5, 6, 7, -8, 9};
        int s = pozitif(x, 0);
        System.out.println(s);
    }

    public static int pozitif(int[] a, int n) {
        if (n == a.length) {
             return 0;
        } else if (a[n] > 0) {
            return 1 + pozitif(a, ++n);
        } else {
            return pozitif(a, ++n);
        }

    }
}
