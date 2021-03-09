import java.util.Scanner;

public class Boj_13458_Main {
    static int N, B, C;
    static int[] A;
    static long ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        B = sc.nextInt();
        C = sc.nextInt();
        for (int i = 0; i < A.length; i++) {
            ans++;
            A[i] -= B;
            if (A[i] > 0) {
                ans += A[i] / C;
                if (A[i] % C > 0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
