import java.util.Scanner;

public class Solution_SWEA_2047_신문헤드라인_kylie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();//문자열 입력
		char[] arr = str.toCharArray();//문자배열로 변환
        //소문자에 한해 대문자로 변환하고 출력
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >= 'a'&&arr[i]<='z') arr[i] -=32;
			System.out.print(arr[i]);
		}
	}//main
}//class