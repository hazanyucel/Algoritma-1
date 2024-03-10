 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package çalışma2;

/*
 *kendisine parametre olarak gelen stringdeki küçük karakterlerin sayısını geri döndüren rekürsif fonksiyonu yazınız.
 * @author Hazan
 */
public class recursive3 {
    public static void main(String[] args) {
        String str1="JSNKGJFaHGKFkS";
        int k=kucuk(str1,0,0);
        System.out.println(k);
    }
    public static int kucuk(String a,int b,int c){
        if (c==a.length())
            return 0;
        else if  (a.charAt(c)>='a' && a.charAt(c)<='z') {
            return 1+kucuk(a,b+1,c+1);
        }
        return kucuk(a,b,c+1);
    }
}
 