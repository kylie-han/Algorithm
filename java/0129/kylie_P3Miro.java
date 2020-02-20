import java.util.Scanner;

/**
 * 

3
8 5 3 4
1 8 5 5 1 2 6 7
5
1 3 2 1 3 1 4 1 1 2
7 4 4 4
1 7 5 5 1 2 6 3
4
4 3 3 1 2 2 3 2 
5 1 1 1
1 2
5
3 2 2 1 3 3 2 4 3 1

#1 1 3 
#2 0 0
#3 0 0

 */
public class kylie_P3Miro{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int testCase = 1; testCase <= TC; testCase++) {
			int n = sc.nextInt();
			int[][] a = new int[n+2][n+2];
			int start_x = sc.nextInt();
			int start_y = sc.nextInt();
			int jumper = sc.nextInt();
			for (int i = 0; i < jumper; i++) {
				int jumper_x = sc.nextInt();
				int jumper_y = sc.nextInt();
				a[jumper_x][jumper_y] = -1;
			}
			/////////////////////////////////////////////
			int move = sc.nextInt();
			int flag = 0;
			for (int i = 0; i < move; i++) {
				int move_v = sc.nextInt();
				int move_n = sc.nextInt();
				switch (move_v) {
				case 1:
					for (int j = 0; j < move_n; j++) {
						if(a[start_x--][start_y]==-1) flag = 1;
						else if(start_x<1||start_y<1||start_x>n||start_y>n) flag = 2;
					}
					break;
				case 2:
					for (int j = 0; j < move_n; j++) {
						if(a[start_x][start_y++]==-1) flag = 1;
						else if(start_x<1||start_y<1||start_x>n||start_y>n) flag = 2;
					}
					break;
				case 3:
					for (int j = 0; j < move_n; j++) {
						if(a[start_x++][start_y]==-1) flag = 1;
						else if(start_x<1||start_y<1||start_x>n||start_y>n) flag = 2;
					}
					break;
				case 4:
					for (int j = 0; j < move_n; j++) {
						if(a[start_x][start_y--]==-1) flag = 1;
						else if(start_x<1||start_y<1||start_x>n||start_y>n) flag = 2;
					}
					break;

				default:
					break;
				}
			}
			if(flag == 0) {
				System.out.println("#"+testCase+" "+start_x+ " "+start_y);
			}else if(flag == 2||flag == 1) {
				System.out.println("#"+testCase+" 0 0");
			}
			
			
		}//end of for tc
	}//end of main
}//end of class


















