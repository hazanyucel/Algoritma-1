/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author Hazan
 */
public class study {

    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        /* int id=1000;
        int nextId=id+1;
        System.out.println("Kimlik"+id+nextId);*/

 /*int yaricap ;
        double alan , pi=3.14;
        Scanner k=new Scanner(System.in);
        System.out.println("Bir r değeri giriniz");
        yaricap=k.nextInt();
        alan=yaricap*yaricap*pi;
        System.out.println("ALAN="+alan);*/
 /*Scanner oku=new Scanner(System.in);
        double sicaklik;
        System.out.println("Hava sıcaklığını giriniz:");
        sicaklik=oku.nextDouble();
        if (sicaklik<=4) {
            System.out.println("Önerilen Etkinlik:Kayak");
        }
        else if(sicaklik>=30) { 
            System.out.println("Önerilen Etkinlik:Yüzme");
        }
        else {
            System.out.println("Önerilen Etkinlik:Sinema");
        }*/
//        int i=1;
//        while(i<=100){
//            if (i%2==0) {
//                System.out.println(i);
//            }
//            i++;
//        }
//        
//        Scanner scan=new Scanner(System.in);
//        int toplam=0;
//        int input;
//        while(true){
//            System.out.println("Lütfen Sayı Giriniz:");
//            input=scan.nextInt();
//            if (input<0) {
//                System.out.println("Program bitti negatif sayı girdiniz!!");
//                System.out.println("girilen tek sayılar toplamı "+toplam);
//                break;}
//            if (input%2==1) {
//                toplam=input;
//            }
//                
//            }
//        System.out.println("Sayı Giriniz:");
//        int input = k.nextInt();
//        int a = 1;
//        while (a <= input) {
//            System.out.println(a);
//            a = a * 2;
//        }
//        System.out.println("Harmonik Sayısı Giriniz:");
//        double h=k.nextDouble();
//        double harmonic=0.0;
//        while(h>0){
//            harmonic=harmonic+(1/h);
//            h--;
//        }
//        System.out.println(harmonic);
//        System.out.println("bir sayı giriniz");
//        int star = k.nextInt();
//        int i = 1;
//        while (i <= star) {
//            int b = 1;
//            while (b <= i) {
//                System.out.print("*");
//                b++;
//            }
//
//            System.out.println();
//            i++;
//        }
//          int sayi1,sayi2,sonuc=1;
//          System.out.println("Üssü alınacak sayıyı giriniz:");
//          sayi1=k.nextInt();
//          System.out.println("Üssü giriniz:");
//          sayi2=k.nextInt();
//          for (int i = 1; i <= sayi2; i++) {
//            sonuc=sonuc*sayi1;
//        }
//          
        // System.out.println("Sonuç: "+sonuc);
//          int sayi,toplam=0,sayac=0;
//          while(true){
//              System.out.println("Bir sayı giriniz: ");
//              sayi=k.nextInt();
//              if (sayi<0) {
//                  System.out.println("Hatalı Giriş , Negatif Sayı Girişi!!");
//                  break;
//              } 
//              if (sayi%2==0) {
//                  toplam+=sayi;
//                  sayac++;
//              }
//          
//          }
//          System.out.println("TOPLAM: "+toplam);
//         int input;
//            boolean asal=true;
//            do {
//            System.out.println("Bir sayı giriniz: ");
//            input=k.nextInt();
//        } while (input<2);
//            for (int i = 2; i < input; i++) { 
//                if (input%i==0) {
//                asal=false;
//                break;
//                }
//        }
//            if (asal) {
//                System.out.println("Girilen sayı " +input+" asaldır.");
//        }
//            else  {
//                System.out.println("Girilen sayı: "+input+" asal değildir");
//            }
      /*     int a=1;
           int b=1;
           int c;
           System.out.println(a);
           System.out.println(b);
           for (int i = 2; i < 10; i++) {
            c=a+b;
            a=b;
            b=c;
               System.out.println(c);
                    
        }*/
//       Scanner read = new Scanner(System.in);
//        System.out.println("bir string giriniz");
//       String str= read.nextLine();
//       
//       int sayac=0;
//       
//       for(int i=0;i<str.length();i++){
//           
//           char harf = str.charAt(i);
//           
//           int ascii = (int) harf;
//           
//           if((ascii>=97) && (ascii<=122)){
//               sayac+=1;
//           }
//       }
//       
//        System.out.println(sayac+" tane küçük harf bulundu");


//           double temperature;
//           System.out.println("Fahrenheit: ");
//           temperature = k.nextDouble();
//           double celcius=((temperature - 32)*5)/9;
//           System.out.println("Celcius: "+celcius);
//           int a, b;
//           double c;
//           System.out.println("Kenar giriniz: ");
//           a=k.nextInt();
//           System.out.println("Kenar giriniz: ");
//           b=k.nextInt();
//           c = Math.sqrt((a*a)+(b*b));
//           System.out.println("Hipotenüs: "+c);
//              int km;
//              double perKm=2.20,total ,startPrice=10;
//              System.out.println("Mesafeyi km cinsinden giriniz:");
//              km=k.nextInt();
//              total =(km*perKm);
//              total+=startPrice;
//              total=(total<20)?20:total;
//              System.out.println("Toplam Tutar: "+total+"TL");
//               
//           double kilo,boy,indeks;
//            System.out.println("Boyunuzu Giriniz: ");
//            boy=k.nextDouble();
//            System.out.println("Kilonuzu Giriniz: ");
//            kilo=k.nextDouble();
//            indeks=kilo/(boy*boy);
//            System.out.println("Vücut Kitle İndeksiniz: "+indeks);
//            if (indeks<18.5) {
//                System.out.println("ZAYIF");
//            
//        }
//            else if (indeks>=25 && indeks<=29.9 ) {
//                System.out.println("ŞİŞMAN");
//        }
//            else if (indeks>=30 && indeks<=34.9 ) {
//                System.out.println("OBEZ");
//        }
//            else if (indeks>=35) {
//                System.out.println("AŞIRI OBEZ!!!");
//        }
//            else 
//                System.out.println("İDEAL KİLODASINIZ :)");
//        Scanner k = new Scanner(System.in);
//        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.00, adet, para;
//        int urun;
//        System.out.println("Alacağınız miktarı giriniz(kg cinsinden): ");
//        adet = k.nextInt();
//        System.out.println("Alacağınız ürünü seçiniz: " + "1-Armut" + "2-Elma" + "3-Domates" + "4-Muz" + "5-Patlıcan");
//        urun = k.nextInt();
//        if (urun == 1) {
//            para = (adet * armut);
//            System.out.println("Ödenecek miktar:" + para + "TL");
//
//        } else if (urun == 2) {
//            para = (adet * elma);
//            System.out.println("Ödenecek miktar:" + para + "TL");
//        } else if (urun == 3) {
//            para = (adet * domates);
//            System.out.println("Ödenecek miktar:" + para + "TL");
//        } else if (urun == 4) {
//            para = (adet * muz);
//            System.out.println("Ödenecek miktar:" + para + "TL");
//        } else {
//            para = (adet * patlıcan);
//            System.out.println("Ödenecek miktar:" + para + "TL");
//        }


          //2nin üslerini yazan program;
//          int n;
//          System.out.println("Sınır sayısını giriniz:  ");
//          n=k.nextInt();
//          for (int i = 1; i <= n; i*=2) {
//              System.out.println(i); }
//        }


//          Scanner input=new Scanner(System.in);
//          double n,k;
//          System.out.println("Üssü alınacak sayı: ");
//          n=input.nextDouble();
//          System.out.println("Üs olacak sayı: ");
//          k=input.nextDouble();
//          double total=0.0;
//          double i=1.0;
//          while(i<=k){
//              total*=n;
//              i++;
//           
//          
//          }
//                  System.out.println("Cevap= "+total);


//Çarpım tablosu:
//             int altcizgi, i, j; 
//     System.out.println(" 1 2 3 4 5 6 7 8 9 10 ");  
//     for(altcizgi=1; altcizgi<=70; altcizgi++) //döngüyle uzunca bir çizgi çizelim
//      { 
//        System.out.print("_"); 
//       } 
//     System.out.println(); 
//     for (i =1; i<=10; i++) 
//      { 
//        System.out.print(i+" | "); 
//        for (j=1 ; j<=10 ; j ++) 
//         { 
//           System.out.print(i*j +" "); 
//          } 
//        System.out.println(); 
//       } 
    }
}
