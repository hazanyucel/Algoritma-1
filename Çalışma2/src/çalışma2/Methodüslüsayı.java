/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package çalışma2;

import java.util.Scanner;

/**
 *
 * @author Hazan
 */
public class Methodüslüsayı {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int x,y,z;
        x=k.nextInt();
        y=k.nextInt();
        z=us(x,y);
        System.out.println(z);
    }
    public static int us(int a,int b){
        int f=1;
        for (int i = 0; i < b; i++) {
            f=f*a;
        }return f;
    }}
    


