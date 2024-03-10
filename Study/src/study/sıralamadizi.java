package study;
//diziyi küçükten büyüğe sıralayan.
public class sıralamadizi {

    public static void main(String[] args) {
        int[] dizi = new int[20];
        int temp = 0, ek = 0, sayac = 0;
        for (int i = 0; i < 20; i++) {
            dizi[i] = (int) (Math.random() * 100);
            System.out.println(dizi[i]);
        }
        System.out.println("*************");
        for (int i = 0; i < 20; i++) {
            ek = dizi[i];
            for (int j = i + 1; j < 20; j++) {
                if (dizi[j] < ek) {
                    ek = dizi[j];
                    sayac = j; 
                }
 
            } 
            temp = dizi[i];
            dizi[i] = ek;
            dizi[sayac] = temp;
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(dizi[i]);
        }
    }
}
