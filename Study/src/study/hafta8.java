package study;
//ilk iki dizideki terimlerin toplamını ucuncu diziye atayan
//tersten atayan
public class hafta8 {

    public static void main(String[] args) {
        int[] dizi = new int[20];
        int[] list = new int[20];
        int[] ucuncu = new int[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100);
            list[i] = (int) (Math.random() * 100);
            ucuncu[i] = dizi[i] + list[i];
            System.out.println(ucuncu[i]);

        } 
        System.out.println("-------------------------");
        int j = list.length - 1;
        for (int i = 0; i < 20; i++) {
            ucuncu[i] = dizi[i] + list[j];
            j--;
            System.out.println(ucuncu[i]);
        }
    }

}
