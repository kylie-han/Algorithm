  
import java.util.Arrays;

public class 이진검색_한지혜 {
	public static void main(String[] args) {
		int[] a = {4,9,11,23,2,19,10};
		int find = 9;
		int n = 0;
		Arrays.sort(a);
		n = a.length/2;
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			int correct = 0;
			int right = 0;
			int left = 0;
			if (a[n] == find) {
				correct = 1;
			}
			else if (a[n] > find) {
				left = 1;
			}
			else if (a[n] < find) {
				right = 1;
			}
			System.out.println(correct+","+right+","+left);
			if(correct == 1){
				System.out.println("검색 성공");
				break;
			}
			else if (right == 1) {
				n = n+n/2;
				if(n/2 == 0) n++;
			}
			else if (left == 1) {
				n = n/2;
				if(n/2 == 0) n--;
			}
			System.out.println(n);
		}
	}//end of main
}//end of class