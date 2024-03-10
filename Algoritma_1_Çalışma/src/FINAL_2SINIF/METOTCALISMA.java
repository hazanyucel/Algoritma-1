/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FINAL_2SINIF;

/**
 *
 * @author Hazan
 */
public class METOTCALISMA {

    public static void main(String[] args) {
        //us(2, 3);
        System.out.println(basamak(624));
        int dizi[] = {1, 2, 3, 4, 5};
        int dizi2[] = {1, 2, 3, 4, 5};
        int yenidizi[] = new int[5];
        String [][] x={{"hazan","Ayşe","Ankara"},{"fatma","anne","Aybala"}};

        System.out.println(dizitoplam(dizi));
        yenidizi = dizibirartir(dizi);
        for (int i = 0; i < 5; i++) {
            System.out.print(yenidizi[i] + " ");

        }
        tersten("hazan");
        int faktoriyel1 = faktoriyel(5);
        System.out.println("\n" + faktoriyel1);
        System.out.println(topcarp());
        System.out.println(boslukSil("hazan yucel"));
        for (int i = 0; i < EnbEnk(dizi2).length; i++) {
            System.out.println(EnbEnk(dizi2)[i]);
        }
        String b=AvarMi(x);
        System.out.println(b);
        int [] dizin={2,4,5,9,3,8};
        int sayac=ciftadedi(dizin);
        System.out.println(sayac);
        harffarki("hAzNaOnuR");

    }

    public static int us(int a, int b) {
        int us = 1;
        for (int i = 0; i < b; i++) {
            us *= a;
        }
        return us;
    }

    public static int basamak(int a) {
        int bas = 0;
        while (a > 0) {
            a = a / 10;
            bas++;
        }
        return bas;
    }

    public static int dizitoplam(int[] dizi) {
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];

        }
        return toplam;
    }

    public static int[] dizibirartir(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] += 1;
        }
        return dizi;
    }

    public static void tersten(String a) {
        String ters = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            System.out.print(a.charAt(i));
        }

    }

    public static int faktoriyel(int a) {
        int fak = 1;
        for (int i = a; i > 0; i--) {
            fak = fak * i;
        }
        return fak;
    }

    public static double topcarp() {
        double top = 0;
        double carp = 1;
        for (int j = 1; j <= 3; j++) {
            for (int k = 1; k <= 3; k++) {
                carp *= us((1 + j), faktoriyel(k)) / Math.cos(k);
            }
            top += carp;
        }
        return top;
    }

    public static String boslukSil(String a) {
        String b = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != ' ') {
                b += a.charAt(i);
            }
        }
        return b;
    }

    //S.1. Kendisine parametre olarak gelen tek boyutlu sayısal dizi içindeki en 
    //büyük sayıyı ve en küçük sayıyı bulup geri döndüren metodu yazınız. Not: sadece metodu yazılacaktır.
    public static int[] EnbEnk(int[] dizi) {
        int enk = dizi[0];
        int enb = dizi[0];

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > enb) {
                enb = dizi[i];

            }
            if (dizi[i] < enk) {
                enk = dizi[i];

            }
        }
        int[] a = new int[2];
        a[0] = enb;
        a[1] = enk;

        return a;
        //S.2. İki boyutlu string dizisi içindeki ilk karakteri 'A' olan stringleri bulup ekrana yazan programı 
        //çalışır şekilde veriniz. Not: Sadece main fonksiyonu yazılması yeterlidir

    }

    public static String AvarMi(String[][] a) {
        String b="";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[i].length; j++) {
                if (a[i][j].charAt(0)=='A') {
                    b+=a[i][j];
                    b+=' ';
                }
            }
        }
        return b;

    }
    
    public static int ciftadedi(int[] n){
        int sayac=0;
        for (int i = 0; i <n.length; i++) {
            if (n[i]%2==0) {
                sayac++;
            }
        }return sayac;
    }
    public static void harffarki(String kelime){
        int fark=0, kucuk=0,buyuk=0;
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i)>=97&& kelime.charAt(i)<=122) {
                kucuk++;
            }else{
                buyuk++;
            }
        }
        fark=Math.abs(kucuk-buyuk);
        System.out.println(fark);
    }
}
