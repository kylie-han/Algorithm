import java.util.Arrays;
import java.util.Scanner;

public class Boj_3273_Main {
    static int N,M;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        M = sc.nextInt();
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int tmp = arr[i] + arr[j];
                if(tmp == M){
                    ans++;
                }
                else if(tmp > M){
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
