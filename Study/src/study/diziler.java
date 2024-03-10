package study;

import java.util.Scanner;

public class diziler {

    public static void main(String[] args) {
        //klavyeden girilen sayı dizinin içinde var mı?
        Scanner k = new Scanner(System.in);
        int[] notlar = new int[10];
        for (int i = 0; i < 5; i++) {
            notlar[i] = k.nextInt();
        }
        int x = k.nextInt();
        int yer = -1;
        for (int i = 0; i < notlar.length; i++) {
            if (x == notlar[i]) {
                yer = i;
                break;
            }
        }
        System.out.println(yer);

    }
}
