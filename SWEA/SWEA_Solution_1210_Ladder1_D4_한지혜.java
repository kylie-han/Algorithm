  
import java.util.Arrays;
import java.util.Scanner;

public class SWEA_Solution_1210_Ladder1_D4_한지혜 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[102][102];	//배열의 크기 : 100,100
		//배열 생성
		for (int i = 0; i < 10; i++) {//테스트 케이스 10개			
			int x = 100,y = 0;
			int TN = sc.nextInt();	//테스트케이스
			for (int j = 1; j < arr.length-1; j++) {
				for (int k = 1; k < arr[i].length-1; k++) {
					arr[j][k] = sc.nextInt();
					if(arr[j][k] == 2) y = k;
				}
			}
//			System.out.println("arr["+x+"],["+y+"]="+arr[x][y]);//도착점의 위치->10			
//			//배열 출력
//			for (int i1 = 0; i1 < arr.length; i1++) {
//				System.out.println(Arrays.toString(arr[i1]));
//			}
			x--;//9
			int mark = 0;
			for (int j = 0; x > 0 ; j++) {
				if(arr[x][y-1] == 1 && mark != 1 ) {
					y--;
					mark = 0;
				}
				else if(arr[x][y+1] == 1 && mark != 0 ) {
					y++;
					mark = 1;
				}
				else {
					x--;
					mark = 2;
				}
			}
			System.out.println("#"+TN+" "+(y-1));
		}
	}//end of main
}//end of class



/*
1
1 0 0 0 1 0 1 0 0 1 1 0 0 0 1 0 1 1 1 1 1 0 0 0 1 0 1 0 0 1 1 0 0 0 1 1 1 0 0 1 1 0 0 0 1 0 1 0 0 1 1 1 1 1 1 0 1 1 1 1 1 0 0 0 1 0 1 0 0 1 1 1 1 1 1 0 1 0 0 1 1 0 0 0 1 1 1 0 0 1 1 0 0 0 1 0 1 0 0 2
*/
