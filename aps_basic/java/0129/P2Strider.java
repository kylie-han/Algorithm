import java.util.Scanner;

public class P2Strider {

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
			int sero = 0, garo = 0, where = 0, answer = 0;
			boolean flag = false;
			for(int strider=0; strider<arrStrider.length; strider++) {
				sero = arrStrider[strider][0];
				garo = arrStrider[strider][1];
				where = arrStrider[strider][2];
				for(int go=3; go>0; go--) {
					if(where == 2) {
						garo = garo + go;
					} else if(where == 1) {
						sero = sero + go;
					}
					if(garo >= lakeSize || sero >= lakeSize) {
						break;
					} else if(lake[sero][garo] == 1) {
						answer = strider+1;
						flag = true;
						break;
					} else {
						lake[sero][garo] = 1;
					}
				}//for go
				if(flag) break;
			}//for strider
			System.out.println("#"+(tc+1)+" "+answer);
		}//for tc
	}//main

}//class
