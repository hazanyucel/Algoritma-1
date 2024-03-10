/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package çalışma2;

/**
 *kendisine parametre olarak gelen dizideki en büyük elemanı bulan recursive
 * @author Hazan
 */
public class buyukeleman {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,2};
        int x=buyuk(a,0,0);
        System.out.println(x);
    }
    public static int buyuk(int[] a,int b,int c){
        if (b==a.length) {
            return a[c];
        }
        else if (a[b]>a[c]) {
            return  buyuk(a,b+1,b);
        }
      else
            return buyuk(a,b+1,c);
    }
}
