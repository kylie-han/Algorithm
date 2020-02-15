import java.util.Scanner;

public class Solution_SWEA_1204_최빈수구하기_D2_한지혜 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();//입력될 테스트케이스 갯수
		for (int testCase = 1; testCase <= TC; testCase++) {//테스트 갯수만큼 반복
			int testNum = 0;//테스트케이스 번호
			testNum = sc.nextInt();//테스트 케이스 넘버
			int[] arr = new int[101];//점수의 갯수
			for (int i = 0; i < 1000; i++) {//1000명의 학생들
				int num = sc.nextInt();
				arr[num]++;	//학생들의 점수를 배열에 일대일 대응시켜 갯수 체크
			}
			int mode = 0;	//최빈수의 횟수
			int modeNum = 0;//최빈수
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]>=mode) {
					mode = arr[i];
					modeNum = i;
				}
			}
			System.out.println("#"+testNum+" "+modeNum);
		}
	}
}
