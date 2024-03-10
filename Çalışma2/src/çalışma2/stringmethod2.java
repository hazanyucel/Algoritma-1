
package çalışma2;

import java.util.Scanner;

/*
 *
 * @author Hazan
 */
public class stringmethod2 {

    public static void main(String[] args) {
        String[][] str = {{"ali", "veli"}, {"abc", "de"}};
        String[] y = new String[2];
        y = satirtop(str);
        System.out.println(y[0] + "" + y[1]);
    }

    public static String[] satirtop(String[][] s1) {
        String[] s2 = new String[2];
        for (int i = 0; i < s1.length; i++) {
            s2[i]="";
            for (int j = 0; j < s1[i].length; j++) {
                s2[i] += s1[i][j]; 
            }
        }
        return s2;
    }
}
