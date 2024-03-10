
package çalışma2;

/*
 *kendisine parametre olarak gelen Stringi büyük harflere çeviren 
 */
public class Stringmethod {
    public static void main(String[] args) {
        String str="aliVE?a";
        String y=buyuk(str);
        System.out.println(y);
        
    }
    public static String buyuk(String s1){
        String bos="";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)>='a' && s1.charAt(i)<='z'  ) {
                bos+=(char)(s1.charAt(i)-32);//(char) parantezini unuttuğunda hata vermişti.
                
                
            }else
                bos+=(char)(s1.charAt(i)+32); 
            
                    
        }
        return bos;
    }
}
