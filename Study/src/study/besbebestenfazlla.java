package study;

import java.util.Scanner;

/**
 * Klavyeden girilen 5'e 5'lik bir dizide 5 ve 5ten fazla uzunluğa sahip olan
 * stringleri ekrana yazan program.
 *
 * @author Hazan
 */
public class besbebestenfazlla {

    public static void main(String[] args) {
        String[][] str = new String[5][5];
        Scanner k = new Scanner(System.in);
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                str[i][j] = k.nextLine();
                if (str[i][j].length() >= 5) {
                    System.out.println(str[i][j]);
                }
            }

        }
    }
}
