import java.util.Scanner;

public class P1PreRobotInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		int arrSz;
		char [][] arr;
		for(int tc=0; tc<testCase; tc++) {
			arrSz = scan.nextInt();
			arr = new char[arrSz][arrSz];
			for(int sero=0; sero<arr.length; sero++) {
				for(int garo=0; garo<arr[sero].length; garo++) {
					arr[sero][garo] = scan.next().charAt(0);
				}
			}//for - end input
			//print for confirm start
			for(int sero=0; sero<arr.length; sero++) {
				for(int garo=0; garo<arr[sero].length; garo++) {
					System.out.print(arr[sero][garo] + " ");
				}
				System.out.println();
			}//for
			//print for confirm end
		}//for tc
	}//main

}
