/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package study;
import java.util.Scanner;
/**
 *
 * @author Hazan
 */
public class Sıfırdurdur {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int t;
        int toplam=0;
        for (; ;) {
            t=k.nextInt();
            if (t==0) {
                System.out.println(toplam);System.exit(1);
            }
            toplam+=t;
        }
       
    }
   
}
