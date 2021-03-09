import java.util.Scanner;

public class Boj_1806_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = 0;
        int len = 1;
        int min = N+10;
        int sum = arr[left];
        while (left < arr.length) {
            if (sum >= M) {
                min = min < len ? min : len;
                if(min == 1) break;
                sum -= arr[left];
                left++;
                len--;
            } else if(right+1 <arr.length) {
                right++;
                sum += arr[right];
                len++;
            } else break;
        }
        min = min == N+10?0:min;
        System.out.println(min);
        sc.close();
    }
}
