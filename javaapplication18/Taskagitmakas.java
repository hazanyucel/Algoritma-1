/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

import java.util.Random;
import java.util.Scanner;

public class Taskagitmakas {
    public static void main(String[] args) {
        int pc,kisi;
        Random r=new Random();
        pc=r.nextInt(3)+1;//???????????????????????????
        //System.out.println("pc=" +pc);
        System.out.println("1 Taş");
        System.out.println("2 Kağıt");
        System.out.println("3 Makas");
        System.out.println("Seciminizi belirtiniz:");
        Scanner oku=new Scanner(System.in);
        kisi=oku.nextInt();
            
        
        if (kisi!=1 && kisi!=2 && kisi!=3 ) {
            System.out.println("Yanlis bir secim yaptiniz");
            
        }
        else {
            if (pc==kisi) {
                System.out.println("Pc seçimi:"+pc);
                System.out.println("Berabere");
                
            }
            else if (pc==1 && kisi==2) {
                System.out.println("Pc seçimi:"+pc);
                System.out.println("Kisi kazanir");
                
            }
            else if (pc==1 && kisi==3) {
                System.out.println("Pc seçimi:"+pc);
                System.out.println("Pc kazanir");
                
            }
            else if (pc==2 && kisi==1) {
                System.out.println("Pc seçimi:"+pc);
                System.out.println("Pc kazanir");
            }
            else if (pc==2 && kisi==3) {
                System.out.println("Pc seçimi:"+pc);
                System.out.println("Kisi kazanir");
                
            }
            else if (pc==3 && kisi==1) {
                System.out.println("Pc seçimi:"+pc);
                System.out.println("Kisi kazanir");
                    
                }
            }
           
            }
        }

 