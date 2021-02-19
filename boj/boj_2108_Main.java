import java.util.Arrays;
import java.util.Scanner;

public class Boj_2108_Main {
	static int N,sum,avg,mid,mod,range;
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N];
		sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		// �Է�, ���
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum+= arr[i];
			if(arr[i]>max)max = arr[i];
			if(arr[i]<min)min = arr[i];
		}
		avg = Math.round((float)sum/N);
		System.out.println(avg);
		Arrays.sort(arr);
		// �߾Ӱ�
		mid = arr[N/2];
		System.out.println(mid);
		// �ֺ�
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
		// ����
		range = max-min;
		System.out.println(range);
		sc.close();
	}
}
