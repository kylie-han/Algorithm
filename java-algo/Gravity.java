import java.util.Arrays;

public class Gravity {
	public static void main(String[] args) {//전체화면 단축키 : ctrl + M
		int[] box = {7,4,2,0,0,6,0,7,0};
/*		
//		System.out.println(Arrays.toString(box));	//배열의 원소를 간단하게 화면에 출력하는 방법
		int[][] map = new int[8][9];
		
		//1차원배열을 2차원배열로만든다(박스가 있으면 1, 없으면 0)
		for (int c = 0; c < map.length; c++) {	//c:열
			for (int r = map.length-1; r >= 0; r--) {	//r:행
				if (box[c] <= 0) {//박스의 개수가 0보다 작거나 같으면 빠져나감
					break;
				}
				box[c]--;
				map[r][c] = 1;
			}
		}//map 완성
		//2차원배열을 회전
		int[][] room = new int[9][8];
		for (int i = 0; i < room.length; i++) {	//9
			for (int j = 0; j < room[i].length; j++) {	//8
				room[i][j] = map[map.length-1-j][i];
			}
		}
				
		//중력을 발생시키고
		
		//낙차계산, 그중 최대
		
		//결과확인
		for (int i = 0; i < map.length; i++) {
			System.out.println(Arrays.toString(room[i]));
		}
*/
		int max = 0;
		for (int i = 0; i < box.length; i++) {
			int cnt = 0;
			for (int j = 0; j < box.length; j++) {
				if(box[i]>box[j]) {
					cnt++;
				}
			}
			if(max<cnt) {
				max = cnt;
			}
		}
		System.out.println("최대낙차 : "+max);
		//=> 다하면 오래걸리고 내 오른쪽에 나보다 작은 수가 몇개 있는지 확인
	}//end of main
}//end of class
