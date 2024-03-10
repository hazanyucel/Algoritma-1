package çalışma2;

import java.util.Scanner;

public class Sıralamaahmethoca {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int dizi[][] = new int[3][4];
        System.out.println("Dizi elemanlarını giriniz.");
        int imax = 0, jmax = 0;
        int max = dizi[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                dizi[i][j] = k.nextInt();

                if (dizi[i][j] > max) {
                    max = dizi[i][j];
                    imax = i;
                    jmax = j;
                }
            }
        }
        System.out.println("En büyük eleman = " + max + " indisi = " + imax + " " + jmax);

        int min = dizi[0][0];
        int imin = 0, jmin = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (dizi[i][j] < min) {
                    min = dizi[i][j];
                    imin = i;
                    jmin = j;

                }
            }
        }
        System.out.println("En küçük eleman = " + min + " indisi = " + imin + " " + jmin);
    }
}
