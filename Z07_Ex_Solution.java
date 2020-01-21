
public class Z07_Ex_Solution {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];//2차원 배열의 선언
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i*5+j;
			}
		}
			
		for (int i = 0; i < arr.length; i++) {//2차원 배열 출력
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d",arr[i][j]);
			}
			System.out.println();
		}
		
		int sum = 0;		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				//a의 상하좌우
				if(i-1 >= 0) {//상
					int diff = arr[i-1][j] - arr[i][j];
					if (diff < 0) diff = -diff;
					sum += diff;
				}if(i+1 < arr.length) {//하
					int diff = arr[i+1][j] - arr[i][j];
					if (diff < 0) diff = -diff;
					sum += diff;
				}if(j-1 >= 0) {//좌
					int diff = arr[i][j-1] - arr[i][j];
					if (diff < 0) diff = -diff;
					sum += diff;
				}if(j+1 < arr[i].length) {//우
					int diff = arr[i][j+1] - arr[i][j];
					if (diff < 0) diff = -diff;
					sum += diff;
				}
			}
		}
		System.out.println(sum);

		int[] dc = {0,0,-1,1,};//dx
		int[] dr = {-1,1,0,0,};//dy
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < dc.length; k++) {
					if ( i+dr[k] < 0 || i+dr[k] >= arr[i].length || i+dc[k] < 0 || i+dc[k] >= arr[i].length) {
						continue;
					}
					int diff = arr[i+dr[k]][j+dc[k]] - arr[i][j];
					if (diff < 0) diff = -diff;
					total += diff;
				}
			}
		}
		System.out.println(total);
	}//end of main
}//end of class
