  
import java.util.Arrays;

public class 이진검색_한지혜 {
	public static void main(String[] args) {
		int[] a = {4,9,11,23,2,19};
		int find = 5;//찾고자 하는 값
		int n = 0;
		Arrays.sort(a);//주어진 배열 정렬
		n = a.length/2;
//		System.out.println(Arrays.toString(a));//배열 확인
		for (int i = 0; i < a.length; i++) {
			if (a[n] == find) {
				System.out.println("검색 성공");
				break;
			}
			else if (a[n] > find) {
				n = n/2;
				if(n/2 == 0) n--;
			}
			else if (a[n] < find) {
				n = n+n/2;
				if(n/2 == 0) n++;
			}
		}
	}//end of main
}//end of class