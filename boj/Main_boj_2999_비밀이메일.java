
import java.util.Arrays;
import java.util.Scanner;

public class Main_boj_2999_비밀이메일 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//			0.주어진 문자열 입력
		String pw = sc.next();
//			1. 문자열의 길이를 세고
//			2. 주어진 조건에 맞는 R, C를 찾는다.
		int r = 0;
		int c = 0;
		for (int i = (int) Math.sqrt(pw.length()); i >= 1; i--) {
			if (pw.length() % i == 0 && i <= pw.length() / i) {
				r = i;
				c = pw.length() / i;
				break;
			}
		}
//			System.out.println(r);
//			3. 행 : R, 열 : C인 행렬을 만든다.
		char[][] arr = new char[r][c];

//			4. 행렬의 상하방향우선으로 값을 채워넣는다.
		int pwChar = 0;
		for (int j = 0; j < c; j++) {
			for (int i = 0; i < r; i++) {
				arr[i][j] = pw.charAt(pwChar++);
			}
		}
//			for (int i = 0; i < arr.length; i++) {
//				System.out.println(Arrays.toString(arr[i]));
//			}
//			5. 행렬의 좌우방향으로 값을 읽어낸다.
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j]);
			}
		}
	}// end of main
}// end of class
