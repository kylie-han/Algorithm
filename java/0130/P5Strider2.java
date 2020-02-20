import java.util.Scanner;

public class P5Strider2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		for(int tc=0; tc<testCase; tc++) {
			int lakeSize = scan.nextInt();
			int [][] lake = new int[lakeSize][lakeSize];
			int cntStrider = scan.nextInt();
			int [][] arrStrider = new int[cntStrider][3];
			for(int strider=0; strider<arrStrider.length; strider++) {
				for(int idx=0; idx<arrStrider[strider].length; idx++) {
					arrStrider[strider][idx] = scan.nextInt();
				}
			}
			//================================================
			int answer = arrStrider.length;
			for (int idx=0; idx<arrStrider.length; idx++) {
				int x = arrStrider[idx][0];
				int y = arrStrider[idx][1];
				int direct = arrStrider[idx][2];
				boolean flag = false;
				for(int go=3; go>0; go--) {
					if(direct == 1) {//╩С
						x = x - go;
					} else if(direct == 2) {//го
						x = x + go;
					} else if(direct == 3) {//аб
						y = y - go;
					} else if(direct == 4) {//©Л
						y = y + go;
					}
					if(x<0 || y<0
						|| x>=lake.length || y>=lake.length
						|| lake[x][y] == 1) {
						flag = true;
						answer--;
						break;//break go
					}
					if(go == 1) lake[x][y] = 1;
				}//for go
			}//for idx

			System.out.println("#"+(tc+1)+" "+answer);
		}//for tc
	}//main

}//class





