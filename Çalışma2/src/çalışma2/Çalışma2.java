package çalışma2;

public class Çalışma2 {
//iki boyutlu matrisin toplamını,farkını ,çarpımını,bir tane matrisin transpozamını(ins böyle yazılıyordur) alan program.

    public static void main(String[] args) {

        int top = 0, sayac = 0,fark=0,carp=1;
        int matris[][] = {{1, 2, 3}, {3, 4, 5}, {6, 2, 5}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                top += matris[i][j];
                fark=fark-matris[i][j];
                carp*=matris[i][j];
            }
        }

        System.out.println(top);
        System.out.println(fark);
        System.out.println(carp);
    }
}
