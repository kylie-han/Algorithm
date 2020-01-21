import java.util.Arrays;

public class Z07_Ex {
	public static void main(String[] args) {
		//2차 배열에 순서대로 초기화
		int[][] origin = new int[5][5];
		int n = 0;
		for (int i = 0; i < origin.length; i++) {
			for (int j = 0; j < origin[i].length; j++) {
				origin[i][j] = n;
				n++;
			}
		} 
		//상하좌우의 값 추출
		int[] dx = {0,0,-1,1,};
		int[] dy = {-1,1,0,0,};
		int mode = 0;
		int[][] arr_o = new int[5][5];
		for (int i = 0; i < origin.length; i++) {
			for (int j = 0; j < origin[i].length; j++) {
				for (int k = 0; k < dy.length; k++) {
					//차의 절댓값의 합을 2차배열에 저장
					int tx = i + dx[mode];
					int ty = i + dy[mode];
					arr_o[i][j] +=  Math.abs(origin[i][j] - origin[tx][ty]);
				}
			}
		}
		System.out.println(Arrays.toString(arr_o[0]));
	}//end of main
}//end of class
