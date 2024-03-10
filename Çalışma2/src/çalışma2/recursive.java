/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package çalışma2;

/*
 *kendisine parametre olarak gelen n tamsayısının faktöriyelini hesaplayan recursive fonksiyonu yazınız.
 * kendisine parametre olarak gelen stringdeki küçük harfleri geri döndüren recursive method. (haftaya yapılır)
 */
public class recursive {
    public static void main(String[] args) {
        int n=fac(5);
        System.out.println(n);
    }
    public static int fac(int a){
        if (a==0)
            return 1;
        else
            return a*fac(a-1);
        
    }
}
