import java.util.Scanner;

public class SWEA_Solution_2050_알파벳을숫자로변환_kylie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inData = sc.nextLine();//입력은 문자열
		char[] inD_arr = inData.toCharArray();//문자열 -> 배열
		//값 출력
		for (int i = 0; i < inD_arr.length; i++) {
			System.out.print((int)inD_arr[i]-64 + " ");//(int)'A' = 65
		}
	}//main
}//class
