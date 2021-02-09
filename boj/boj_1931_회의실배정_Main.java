import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class boj_1931_회의실배정_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		int[][] arr = new int[N][2];
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		Arrays.sort(arr,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) return o1[0]-o2[0];
				return o1[1]-o2[1];
			}
		});
		int end = 0;
		for (int i = 0; i < arr.length; i++) {
			if(end <= arr[i][0]) {
				end = arr[i][1];
				ans++;
			}
		}
		System.out.println(ans);
	}
}
