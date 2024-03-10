package study;

public class hafta10 {
//dizi nedir onu anlatıyo

    public static void main(String[] args) {
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = (int) (Math.random() * 100);
                B[i][j] = (int) (Math.random() * 100);
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println("");
        }

    }

}
