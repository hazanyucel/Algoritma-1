/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fınals;

import java.util.Scanner;

/**
 *
 * @author Hazan
 */
public class SORU1 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("İki String giriniz: ");
        String str=k.next();
        String str1=k.next();
       // ayniyerfarklichar(str,str1);
        String sonuc=ayniMi(str,str1);
        System.out.println(sonuc);
        
    }
//    public static void ayniyerfarklichar(String a,String b){
//       
//        for (int i = 0; i < a.length(); i++) {
//            if (a.charAt(i)!=b.charAt(i)) {
//                System.out.print(a.charAt(i)+"" +b.charAt(i));
//                
//            }
//        }
//    }
    public static String ayniMi(String a,String b){
        String birlesim="";
      
        for (int i = 0; i <a.length(); i++) {
            if (a.charAt(i)!=b.charAt(i)) {
                birlesim+=a.charAt(i);
                birlesim+=b.charAt(i);
                
            }
            
            }
        
                return birlesim;
     
    }
}
