package study;

import java.util.Scanner;
//tek boyutlu string dizisindeki stringleri tersten ekrana yazan
public class ccalısma {
//tersten yazan
    public static void main(String[] args) {
        String[][] dizi = new String[2][2];
        Scanner k=new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                dizi[i][j]=k.nextLine();
            }
            
        }System.out.println("   ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int l = dizi[i][j].length()-1; l >=0; l--) {
                    System.out.print(dizi[i][j].charAt(l));
                }System.out.println("  ");
            }
            System.out.println("  ");
        }

    }
}
