/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package çalışma2;

/**
 *
 * @author Hazan
 */
public class enbenk {
    public static void main(String[] args) {
        int x[]={3,7,5,6,1};
        int[] y=new int[2];
        y=enbenk(x);
        System.out.println(y[0]+" ve "+y[1]);
        
    }
    public static int[] enbenk(int[]a){
        int enk=a[0];
        int enb=a[0];
        int[] list=new int[2];
        for (int i = 0; i < a.length; i++) {
            if (enk>a[i]) 
                enk=a[i];
            if (enb<a[i]) 
                enb=a[i];
     
                    }list[0]=enk;
                    list[1]=enb;
                    return list; 
    }


}