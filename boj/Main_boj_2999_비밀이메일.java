
import java.util.Arrays;
import java.util.Scanner;

public class Main_boj_2999_����̸��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//			0.�־��� ���ڿ� �Է�
		String pw = sc.next();
//			1. ���ڿ��� ���̸� ����
//			2. �־��� ���ǿ� �´� R, C�� ã�´�.
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
//			3. �� : R, �� : C�� ����� �����.
		char[][] arr = new char[r][c];

//			4. ����� ���Ϲ���켱���� ���� ä���ִ´�.
		int pwChar = 0;
		for (int j = 0; j < c; j++) {
			for (int i = 0; i < r; i++) {
				arr[i][j] = pw.charAt(pwChar++);
			}
		}
//			for (int i = 0; i < arr.length; i++) {
//				System.out.println(Arrays.toString(arr[i]));
//			}
//			5. ����� �¿�������� ���� �о��.
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j]);
			}
		}
	}// end of main
}// end of class
