
package javaapplication18;

import java.util.Scanner;

//Kullanıcı tarafından yapılacak seçime göre gerekli işlemi yapan ve sonuç döndüren bir hesap makinası tasarlayınız.
//Kullanıcının sayıları girmesi sağlandıktan sonra bir menü sunulmalı ve seçim yapması sağlanmalıdır. 
//Programın sonunda ise kullanıcının seçtiği işlem ve işlemin sonucu gösterilmelidir.


class hesapmakinesi {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        System.out.println("İşlem Menüsü\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");

        int islem;
        while(true){

            System.out.println("Lütfen İşlem Seçiniz (1-4) :");
            islem = scanner.nextInt();

            if(islem > 0 && islem < 5) {
                System.out.println("Lütfen bir sayı giriniz");
                break;

            }
        }

        System.out.println("1.Sayı:");
        int s1 = scanner.nextInt();

        System.out.println("2.Sayı:");
        int s2 = scanner.nextInt();

        if(islem == 1){

            System.out.println(s1 + " + " + s2 + " = " + (s1+s2));

        }
        else if(islem == 2){

            System.out.println(s1 + " - " + s2 + " = " + (s1-s2));

        }
        else if(islem == 3){

            System.out.println(s1 + " * " + s2 + " = " + (s1*s2));

        }
        else if(islem == 4){ 

            System.out.println(s1 + " / " + s2 + " = " + ((float)s1/(float)s2));

        }



    }





    }

