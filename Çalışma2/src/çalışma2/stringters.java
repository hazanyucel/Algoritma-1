/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package çalışma2;

/**
 *kendisine parametre olarak gelen stringi ters çevirip geri döndüren recursive
 * @author Hazan
 */
public class stringters {
    public static void main(String[] args) {
        String str="hazan";
        String s=ters(str,0);
        System.out.println(s);
    }
    public static String ters(String a,int n){
        if (n==a.length()) {
            return "";
        }else   
            return ters(a,n+1)+a.charAt(n); 
    }
}
