import java.util.Arrays;
import java.util.Scanner;

public class SWEA_Solution_1210_Ladder1_D4_한지혜 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TN = sc.nextInt();	//테스트케이스
		int[][] arr = new int[12][12];	//배열의 크기 : 100,100
		int x = 10,y = 0;
		//배열 생성
		for (int i = 0; i < 1; i++) {//테스트 케이스 10개
			for (int j = 1; j < arr.length-1; j++) {
				for (int k = 1; k < arr[i].length-1; k++) {
					arr[j][k] = sc.nextInt();
					if(arr[j][k] == 2) y = j; 
				}
			}
		}
		//배열 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println("arr["+x+"],["+y+"]="+arr[x][y]);//도착점의 위치->10
		x--;//9
		for (int i = 0; i < 100 ; i++) {
			if(arr[x-1][y] == 1) x--;
			else if(arr[x+1][y] == 1) x++;
			else {
				y--;
				if (x<=0) {
					System.out.println(x);
					break;
				}
			}
			System.out.println(x+","+y);
		}
		System.out.println(y);
	}//end of main
}//end of class

	

/*
1
1 0 0 0 1 0 1 0 0 1 1 0 0 0 1 0 1 1 1 1 1 0 0 0 1 0 1 0 0 1 1 0 0 0 1 1 1 0 0 1 1 0 0 0 1 0 1 0 0 1 1 1 1 1 1 0 1 1 1 1 1 0 0 0 1 0 1 0 0 1 1 1 1 1 1 0 1 0 0 1 1 0 0 0 1 1 1 0 0 1 1 0 0 0 1 0 1 0 0 2
*/