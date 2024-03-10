/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package çalışma2;

import java.util.Arrays;

/**
 *oarametre olarak gelen tek boyutlu iki dizinin toplamını geri döndüren method
 * parametre olarak gelen tek boyutlu iki dizi içerisindeki her bir indisteki büyük olan sayıyı geri döndüren 
 * @author Hazan
 */
public class uygulama {
    public static void main(String[] args) {
        int [] dizi={1,2,3,4};
        int [] list={1,5,2,6};
        int[] ucuncu=top(dizi,list);
             for (int i = 0; i < ucuncu.length; i++) {
                 System.out.print(ucuncu[i]);
        }
        
       
    }
    public static int[] top(int[] a,int[] b){
         int[] k = new int[a.length];
        for (int i = 0; i < a.length; i++) {
             k[i]=a[i]+b[i]; 
        }
        return k;
    }
}
