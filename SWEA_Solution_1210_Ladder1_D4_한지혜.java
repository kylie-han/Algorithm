import java.util.Arrays;
import java.util.Scanner;

public class SWEA_Solution_1210_Ladder1_D4_한지혜 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TN = sc.nextInt();	//테스트케이스
		int[][] arr = new int[10][10];	//배열의 크기 : 100,100
		int x = 0,y = 9;
		//배열 생성
		for (int i = 0; i < 1; i++) {//테스트 케이스 10개
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr[i].length; k++) {
					arr[k][j] = sc.nextInt();
					if(arr[k][j] == 2) x = j; 
				}
			}
		}
		//배열 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println(x);//도착점의 위치->9
		y--;//8
		for (int i = 0; i < 100 ; i++) {
			if(arr[x-1][y] != 0) x--;
			else if(arr[x+1][y] != 0) x++;
			else {
				y--;
				if (y<=0) {
					System.out.println(y);
					break;
				}
			}
			System.out.println(x+","+y);
		}
		System.out.println(y);
	}//end of main
}//end of class
