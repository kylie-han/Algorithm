import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution_4408 {
	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("C:/sample_input.txt"));
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		int [] arr;
		int studentCnt;
		int [] arrStart;
		int [] arrEnd;
		for(int tc = 1; tc <= testCase; tc++) {

			arr = new int [201];
			studentCnt = scan.nextInt();
			arrStart = new int [studentCnt];
			arrEnd = new int [studentCnt];
			int tmpStart, tmpEnd;
			for(int a=0; a<studentCnt; a++) {
				tmpStart = scan.nextInt();
				tmpEnd = scan.nextInt();
				if (tmpStart > tmpEnd) {
					int tmpInt = tmpStart;
					tmpStart = tmpEnd;
					tmpEnd = tmpInt;
				}
				arrStart[a] = tmpStart/2;
				if(tmpStart%2 == 1) arrStart[a] = arrStart[a] + 1;
				arrEnd[a] = tmpEnd/2;
				if(tmpEnd%2 == 1) arrEnd[a] = arrEnd[a] + 1;
			}

			for(int a=0; a<arrStart.length; a++) {
				for(int b=arrStart[a]; b<=arrEnd[a]; b++) {
					arr[b] = arr[b] + 1;
				}
			}
			//AlgoUtil.print(arr);
			Arrays.sort(arr);
			System.out.println("#"+tc+" "+arr[200]);

		}//for tc
	}//main
}//class
/*
3    
4   
10 20  
30 40
50 60
70 80
2  
1 3
2 200
3
10 100
20 80
30 50
*/
