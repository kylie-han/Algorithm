import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Boj_1644_Main {
    // 소수의 연속합
    // 연속된 소수의 합으로 입력값N을 만들 수 있는 경우의 수를 출력
    static int N;
    static boolean[] pb;
    static List<Integer> prime;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        pb = new boolean[N+1];
        prime = new ArrayList<>();
        prime(N);
    }

    private static void prime(int n) {
        pb[0] = pb[1] = true;
        for (int i = 2; i < N; i++) {
            
        }
    }
}
