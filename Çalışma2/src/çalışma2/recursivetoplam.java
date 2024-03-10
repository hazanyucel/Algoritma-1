/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package çalışma2;

/*
 *kendisine parametre olarak gelen n tamsayısına kadarki sayıların toplamını bulan recursive fonksiyonu yazınız.
 */
public class recursivetoplam {

    public static void main(String[] args) {
        int n = toplam(10);
        System.out.println(n);
    }

    public static int toplam(int a) {    //RECURSIVE METOTLARIN İÇİNDE TANIMLAMA YAPILMAZ,DÖNGÜ GİRİLMEZ!!!!!!! DİREKT 0 YAZARIM DEDİ HOCA
        if (a == 0) {
            return 0;
        } else {
            return a + toplam(a - 1);
        }
    }
}
