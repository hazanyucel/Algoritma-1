/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package çalışma2;

/**
 * kendisine parametre olarak gelen pozitif tam sayının sayının asal sayı olup
 * olmadıgını geri döndüren method
 *
 * @author Hazan
 */
public class asalsayımethod {

    public static void main(String[] args) {
        boolean x = asalbul(13);
        if (x) {
            System.out.println("Asaldır");

        } else {
            System.out.println("Asal Degil");
        }
    }

    public static boolean asalbul(int a) {
        boolean kontrol = true;

        for (int i = 2; i < Math.sqrt(a); i++) { //bir sayının karekökune kadar kontrol etmek yeterli asallıgı anlamak için
            if (a % i == 0) {
                kontrol = false;
            }
            break;
        }

        return kontrol;
    }
}
 