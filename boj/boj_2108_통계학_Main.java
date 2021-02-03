import java.util.Arrays;
import java.util.Scanner;

public class boj_2108_통계학_Main {
	static int N,sum,avg,mid,mod,range;
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N];
		sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		// 입력, 평균
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum+= arr[i];
			if(arr[i]>max)max = arr[i];
			if(arr[i]<min)min = arr[i];
		}
		avg = Math.round((float)sum/N);
		System.out.println(avg);
		Arrays.sort(arr);
		// 중앙값
		mid = arr[N/2];
		System.out.println(mid);
		// 최빈값
		int[] cnt = new int[max-min+1];
		for (int i = 0; i < arr.length; i++) {
			cnt[arr[i]-min]++;
		}
		int idx = 0;
		for (int i = cnt.length-1; i >= 0; i--) {
			if(cnt[i] > cnt[idx]) {
				idx = i;
				mod = i;
			}else if(cnt[i] == cnt[idx]) {
				mod = idx;
				idx = i;
			}
		}
		mod += min;
		System.out.println(mod);
		// 범위
		range = max-min;
		System.out.println(range);
	}
}
