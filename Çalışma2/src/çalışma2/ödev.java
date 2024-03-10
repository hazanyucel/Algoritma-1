
package çalışma2;

/**
 * kendisine parametre olarak gelen dizinin her bir elemanını bir arttırıp geri döndüren recursive fonk
 * kendisine parametre olarak gelen sayının kaç basamaklı old  geri döndüren revcursive
 * kendisine parametre olarak gelen iki stringdeki aynı indisteki karakterlerin aynı olanlarını geri döndüren recursive
 * kendisine parametre olarak gelen stringin palindrom olup olmadığını kontrol eden
 * kendisine parametre olarak gelen tamsayı kadar ekrana adınızı recursive olarak yazan
 * kendisine parametre olarak gelen stringdeki boşukları silip stringi geri döndüren 
 * kendisine parametre olarak gelen stringin küçükleri büyük büyükleri küçük yapan --->YAPTIK
 * @author Hazan
 */
public class ödev {
    public static void main(String[] args) {
        String str="KJLKlkmKMKl";
        String x=buyukkucuk(str,0);
        System.out.println(x);
    }
    public static String buyukkucuk(String a , int i){ 
        if (i==a.length()) {
            return " ";
        }
        else if (a.charAt(i)>='a' && a.charAt(i)<='z') {
            return (char)(a.charAt(i)-32)+buyukkucuk(a,i+1);
        }
        else if (a.charAt(i)>='A' && a.charAt(i)<='Z') {
            return (char)(a.charAt(i)+32)+buyukkucuk(a,i+1);
        }
        else return buyukkucuk(a,i+1);
    }
    
}
