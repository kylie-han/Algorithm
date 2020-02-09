import java.util.Scanner;

public class Main_boj_2991_사나운개 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();//a분동안 공격적
		int b = sc.nextInt();//b분동안 쉼
		int c = sc.nextInt();//다른 개 c분동안 공격적
		int d = sc.nextInt();//다른 개 d분동안 쉼
		int p = sc.nextInt();//우체부의 도착시간
		int m = sc.nextInt();//우유배달원의 도착시간
		int n = sc.nextInt();//신문배달원의 도착시간
		int[] arr = {p,m,n};
		for (int i = 0; i < arr.length; i++) {
			int cnt = 0;
			if(arr[i]%(a+b) <= a && arr[i]%(a+b)!=0) cnt++;
			if(arr[i]%(c+d) <= c && arr[i]%(c+d)!=0) cnt++;
			System.out.println(cnt);
		}
	}//end of main
}//end of class
