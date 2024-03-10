package study;
//Random 10 elemanlı bir dizinin elemanları ortalamasını alan program.
public class diziort {

    public static void main(String[] args) {
        int[] dizi = new int[10];
        int top = 0, ort = 0;
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 999);
            top += dizi[i];
            ort = top / dizi.length;
        }
        System.out.println("Dizinin ortalaması= " + ort);
    }
}
