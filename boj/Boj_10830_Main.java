import java.util.Scanner;

public class boj_10830_Main {
    static int MOD = 1000, N;
    static int[][] unitMatrix;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        long B = sc.nextLong();

        int[][] matrix = new int[N][N];
        unitMatrix = new int[N][N];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                matrix[i][j] = sc.nextInt() % MOD;

        for (int i = 0; i < N; i++)
            unitMatrix[i][i] = 1;

        matrix = powMatrix(B, matrix);

        for (int[] m : matrix) {
            for (int i : m)
                System.out.print(i + " ");
            System.out.println();
        }
        sc.close();
    }

    static int[][] powMatrix(long n, int[][] matrix) {
        if (n == 0)
            return unitMatrix;
        if (n == 1)
            return matrix;

        int[][] nMatrix = powMatrix(n / 2, matrix);
        nMatrix = multipleMatrix(nMatrix, nMatrix);

        return n % 2 == 0 ? nMatrix : multipleMatrix(nMatrix, matrix);
    }

    static int[][] multipleMatrix(int[][] m1, int[][] m2) {
        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++)
                    matrix[i][j] += (m1[i][k] * m2[k][j]) % MOD;
                matrix[i][j] %= MOD;
            }
        }

        return matrix;
    }
}