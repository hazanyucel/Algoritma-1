/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package çalışma2;

/**
 * kendisine parametre olarak gelen tamsayı dizisinin sıralı olup olmadığını
 * geri döndüren
 *
 * @author Hazan
 */
public class Sıralamarecursive {

    public static void main(String[] args) {
        int x[] = {1, 2, 3, 6, 5};
        boolean t = siralimi(x, 0);
        System.out.println(t);
    }

    public static boolean siralimi(int[] a, int n) {
        if (n == a.length - 1) {
            return true;
        } else if (a[n] < a[n + 1]) {
            return siralimi(a, ++n);
        }

        return false;
    }
}
