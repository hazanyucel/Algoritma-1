/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package study;

/**
 *20 elemanlı bir dizide rastgele elemanlar atayarak elemanları ekrana yazdıran program.
 * @author Hazan
 */
public class elemanata {
    public static void main(String[] args) {
        int[] list=new int[20];
        int sayac=0;
        for (int i = 0; i <list.length; i++) {
            list[i]=(int) (Math.random()*100); //Random r=new Random();list[i]=r.nextInt(100);
            if (list[i]<=10) {
                sayac++;//kac tane 10'dan küçük eleman vardır?
                System.out.println(i+". eleman "+list[i]);
            }
        }
        System.out.println(sayac);
        for (int i = list.length-1; i >=0 ; i--) {//tersten yazdırmak için.
            System.out.println(i+". eleman "+list[i]);
        }
    }
}
