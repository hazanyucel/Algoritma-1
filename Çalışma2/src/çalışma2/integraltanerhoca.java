/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package çalışma2;

/** 
 *
 * @author Hazan
 */
public class integraltanerhoca {
    public static void main(String[] args) {
        double h=0.0001,bas=2.0,son=6.0,alan=0.0,f1,f2;
        for (double i = bas; i <= son; i=i+h) {
            f1=i*i;
            f2=(i+h)*(i+h);
            alan=alan+(f1+f2)*h/2;
        }
        System.out.println(alan); 
    }
}
