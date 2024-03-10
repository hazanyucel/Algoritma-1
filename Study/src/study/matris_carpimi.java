/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package study;

/**
 *
 * @author Hazan
 */
public class matris_carpimi {

    public static void main(String[] args) {
        int[][] A = {{2, 1}, {2, 2}, {1, 1}};
        int[][] B = {{2, 1, 2, 1}, {1, 2, 1, 1}};
        int[][] C = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 2; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
                System.out.print(C[i][j] + " ");

            }
            System.out.println();
        }
    }
}
