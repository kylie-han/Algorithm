import java.util.Arrays;

public class 이진검색_한지혜 {
	public static void main(String[] args) {
		int[] a = {4,9,11,23,2,19};
		int n = 9;
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			if (a[a.length/2] == n) {
				System.out.println("검색 성공");
				continue;
			}
			else if (a[a.length/2] > n) {
			
			}
			else if (a[a.length/2] < n) {
				
			}
		}
//		System.out.print(Arrays.toString(a));
	}//end of main
}//end of class
