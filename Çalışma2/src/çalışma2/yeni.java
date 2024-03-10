/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package çalışma2;

/**
 *
 * @author Hazan
 */
public class yeni {
    public static void main(String[] args) {
        int x[]={1,1,1,1,1,1,1,1,1,1};
        int[] y=new int[10];
        x=artir(x);
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
    public static int[] artir(int[]a){
        for (int i = 0; i < a.length; i++) {
            a[i]++;
        }return a;
    }
}
