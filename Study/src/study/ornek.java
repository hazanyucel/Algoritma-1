/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package study;

/**
 *
 * @author Hazan
 */
public class ornek {
    public static void main(String[] args) {
        int[][] A={{2,4,5,6},{4,5,7,9},{4,1,4,6}};
        int[] B=new int[3];
        int[] C=new int[4];
        int t1=0,t2=0,k;
        for (int i = 0; i < 3; i++) {
            t1=0;
            k=0;
            t2=0;
            for (int j = 0; j < 4; j++) {
                t1=t1+A[i][j];
                if (k<3) {
                    t2=t2+A[k][i];
                    k++;
                }
                
            }
            B[i]=t1;
            C[i]=t2;
            System.out.println(C[i]);
        }
        
    }
}
