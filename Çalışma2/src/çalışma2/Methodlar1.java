/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package çalışma2;

/**
 *kendisine parametre olarak gelen iki boyutlu string dizisindeki küçük karakterleri geri döndüren method yazınız
 * @author Hazan
 */
public class Methodlar1 {
    public static void main(String[] args) {
        String[][] str={{"HazAn","ZeyNep"},{"IlKiN","iLAYDA"}};
        String x=kucuk(str);
        System.out.println(x);
    }
    public static String kucuk(String[][] a){
        String bos="";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                for (int k = 0; k < a[i][j].length(); k++) {
                    if (a[i][j].charAt(k)>='a' && a[i][j].charAt(k)<='z' ) {
                        bos=bos+a[i][j].charAt(k);
                    }
                }
                        
                    }
                }
        return bos; 
            }
        }
    

