import java.util.Scanner;

public class Main_JO1828 {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int loopCnt = scan.nextInt();
		int [][] inArr = new int[loopCnt][2];
		for(int a=0; a<inArr.length; a++) {
			for(int b=0; b<inArr[a].length; b++) {
				inArr[a][b] =scan.nextInt();
			}
		}
		//AlgoUtil.print(inArr);
		int tmpLow = 0, tmpHigh = 0;
		for(int a=0; a<inArr.length; a++) {
			for(int c=a+1; c<inArr.length; c++) {
				if(inArr[a][1]>inArr[c][1]) {
					tmpLow = inArr[a][0];
					tmpHigh = inArr[a][1];
					inArr[a][0] = inArr[c][0];
					inArr[a][1] = inArr[c][1];
					inArr[c][0] = tmpLow;
					inArr[c][1] = tmpHigh;
				}
			}
		}
		//AlgoUtil.print(inArr);
		int max=inArr[0][1], answer = 1;
		for(int a=1; a<inArr.length; a++) {
			if(inArr[a][0]>max) {
				answer++;
				max=inArr[a][1];
			}
		}//for a
		System.out.println(answer);
	}
}
/*
4
-15 5
-10 36
10 73
27 44
*/
