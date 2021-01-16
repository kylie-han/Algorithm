import java.util.Scanner;
// ������ �߸� ������.
// ������ ������ ��ٸ��� Ÿ�µ� �̵��� Ƚ���� ���� ª�� �������� ã�� ��.
// ���������� 1���� ��� �ľ��Ͽ� ����->����� Ƚ���� ���� ���� ª�� ���� ã���� ��.
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
			// �ԷµǴ� �� ��ü
			for (int j = 0; j < map.length; j++) {
				for (int k = 0; k < map.length; k++) {
					map[j][k] = sc.nextInt();
					// �Է°��� 2�� ��� ��ź�ڸ�
					if(j == map.length-1 && map[j][k] == 2) {
						bombX = k;
						bombY = j;
					}
				}
			}
			// ��ĭ �ö󰡼�
			bombY--;
			// ������ĭ���� �ݺ�
			while(bombY > 0) {
				System.out.println(bombY +" / "+bombX);
				visited[bombY][bombX] = true;
				// ���ʿ� �湮���� ���� 1�� ������
				if(bombX-1>=0 && !visited[bombY][bombX-1] && map[bombY][bombX-1] == 1) {
					bombX--;
					visited[bombY][bombX] = true;
					// ���� 1�� ���涧���� X--
					while(map[bombY-1][bombX] != 1) {
						bombX--;
						visited[bombY][bombX] = true;
					}
				}
				// �����ʿ� �湮���� ���� 1�� ������
				else if(bombX+1<100 && !visited[bombY][bombX+1] && map[bombY][bombX+1] == 1) {
					bombX++;
					visited[bombY][bombX] = true;
					// ���� 1�� ���涧���� X++
					while(map[bombY-1][bombX] != 1) {
						bombX++;
						visited[bombY][bombX] = true;
					}
				}
				// ���ʿ� �湮���� ���� 1�� ������
				else {
					bombY--;
				}
			}
			ans = bombX;
			
			
			System.out.println("#"+(i+1)+" "+ans);
		}
	}
}
