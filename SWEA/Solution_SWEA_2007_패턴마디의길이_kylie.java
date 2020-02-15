import java.util.Scanner;

public class Solution_SWEA_2007_패턴마디의길이_kylie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int testCase = 1; testCase <= TC; testCase++) {
			String str = sc.next();
			int len = 0;
			//길이를 처리하는 부분
			for (int i = 10; i > 0 ; i--) {//반복문자열 최대길이가 10
				if(str.substring(0, i).equals(str.substring(i,i+i))) {//10개가 반복되는지 체크->9개가 반복되는지 체크->...
					len = i;
					if(len>=i)len =i;//반복되는 것중 가장 짧은 것을 저장
				}
			}
		System.out.println("#"+testCase+" "+len);//출력
		}
	}
}
