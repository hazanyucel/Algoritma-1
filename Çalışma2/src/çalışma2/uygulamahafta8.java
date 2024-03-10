
package çalışma2;

import java.util.Scanner;

public class uygulamahafta8 {
       public static boolean polindrom(String kelime){
      boolean  kontrol=true;
        int low=0;
        int high=kelime.length()-1;
       while(low<high){
           if (kelime.charAt(low)!=kelime.charAt(high)) {
               kontrol=false;
               break;
           }
      low++;
       high--;}
        
    return kontrol;
    }
    public static void main(String[] args) {
     Scanner oku=new Scanner(System.in);
     String kelime1=oku.next();
       
            System.out.println(polindrom(kelime1));
        

        }
   /* public static void main(String[] args) {
            String[] kelimeler={"kabak,yapay,okul,yatay"};
            for (int i = 0; i <kelimeler.length; i++) {
                System.out.println(kelimeler[i]+" "+polindrom(kelimeler[i]));
        }
    }*/
}