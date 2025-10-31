import java.util.Scanner;

public class Solution_SWEA_1209_Sum_kylie {
	static int[][] map = new int[100][100];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			int tc = sc.nextInt();
			int max = 0;
			for (int j = 0; j < map.length; j++) {
				int rs = 0;
				for (int j2 = 0; j2 < map[j].length; j2++) {
					map[j][j2] = sc.nextInt();
					rs += map[j][j2]; 
				}
				if(max<rs) max = rs;
			}
			for (int j = 0; j < map.length; j++) {
				int cs = 0;
				for (int k = 0; k < map[j].length; k++) {
					cs += map[k][j];
				}
				if(max<cs) max = cs;
			}
			int s1 = 0,s2 = 0;
			for (int j = 0; j < map.length; j++) {
				s1 += map[j][j];
				s2 += map[j][99-j];
			}
			if(max < s1) max = s1;
			if(max < s2) max = s2;
			System.out.println("#"+tc+" "+max);
		}
	}
}
