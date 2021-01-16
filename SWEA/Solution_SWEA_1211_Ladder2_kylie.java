import java.util.Scanner;
// 가장 짧은 거리를 찾아야한다는 조건을 놓쳐 fail..
public class Solution_SWEA_1211_Ladder2_kylie {
	static int[][] map = new int[100][100];
	static boolean[][] visited;
	static int bombX = 99, bombY = 99;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			visited = new boolean[100][100];
			int ans = 0;
			// input tc
			sc.nextInt();
			// 입력되는 값 전체
			for (int j = 0; j < map.length; j++) {
				for (int k = 0; k < map.length; k++) {
					map[j][k] = sc.nextInt();
					// 입력값이 2일 경우 폭탄자리
					if(j == map.length-1 && map[j][k] == 2) {
						bombX = k;
						bombY = j;
					}
				}
			}
			// 한칸 올라가서
			bombY--;
			// 가장위칸까지 반복
			while(bombY > 0) {
				System.out.println(bombY +" / "+bombX);
				visited[bombY][bombX] = true;
				// 왼쪽에 방문하지 않은 1이 있으면
				if(bombX-1>=0 && !visited[bombY][bombX-1] && map[bombY][bombX-1] == 1) {
					bombX--;
					visited[bombY][bombX] = true;
					// 위에 1이 생길때까지 X--
					while(map[bombY-1][bombX] != 1) {
						bombX--;
						visited[bombY][bombX] = true;
					}
				}
				// 오른쪽에 방문하지 않은 1이 있으면
				else if(bombX+1<100 && !visited[bombY][bombX+1] && map[bombY][bombX+1] == 1) {
					bombX++;
					visited[bombY][bombX] = true;
					// 위에 1이 생길때까지 X++
					while(map[bombY-1][bombX] != 1) {
						bombX++;
						visited[bombY][bombX] = true;
					}
				}
				// 양쪽에 방문하지 않은 1이 없으면
				else {
					bombY--;
				}
			}
			ans = bombX;
			
			
			System.out.println("#"+(i+1)+" "+ans);
		}
	}
}
