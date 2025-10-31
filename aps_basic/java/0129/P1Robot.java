import java.util.Scanner;

public class P1Robot {

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
			//testPrint(arr);
			int answer = 0;
			for(int sero=0; sero<arr.length; sero++) {
				for(int garo=0; garo<arr[sero].length; garo++) {
					if(arr[sero][garo] == 'A') {
						answer = answer + checkRight(arr, sero, garo);
					} else if(arr[sero][garo] == 'B') {
						answer = answer + checkRight(arr, sero, garo);
						answer = answer + checkLeft(arr, sero, garo);
					} else if(arr[sero][garo] == 'C') {
						answer = answer + checkRight(arr, sero, garo);
						answer = answer + checkLeft(arr, sero, garo);
						answer = answer + checkUp(arr, sero, garo);
						answer = answer + checkDown(arr, sero, garo);
					}
				}//for garo
			}//for sero
			System.out.println("#"+(tc+1)+" "+answer);
		}//for tc
	}//main
	public static int checkRight(char [][] arr, int sero, int garo) {
		int answer = 0;
		for(int check=garo+1; check<arr[garo].length; check++) {
			if(arr[sero][check] == 'W' || arr[sero][check] == 'A'
					|| arr[sero][check] == 'B' || arr[sero][check] == 'C') break;
			else if(arr[sero][check] == 'S') answer++;
		}
		return answer;
	}
	public static int checkLeft(char [][] arr, int sero, int garo) {
		int answer = 0;
		for(int check=garo-1; check>=0; check--) {
			if(arr[sero][check] == 'W' || arr[sero][check] == 'A'
					|| arr[sero][check] == 'B' || arr[sero][check] == 'C') break;
			else if(arr[sero][check] == 'S') answer++;
		}
		return answer;
	}
	public static int checkUp(char [][] arr, int sero, int garo) {
		int answer = 0;
		for(int check=sero-1; check>=0; check--) {
			if(arr[check][garo] == 'W' || arr[check][garo] == 'A'
					|| arr[check][garo] == 'B' || arr[check][garo] == 'C') break;
			else if(arr[check][garo] == 'S') answer++;
		}
		return answer;
	}
	public static int checkDown(char [][] arr, int sero, int garo) {
		int answer = 0;
		for(int check=sero+1; check<arr[sero].length; check++) {
			if(arr[check][garo] == 'W' || arr[check][garo] == 'A'
					|| arr[check][garo] == 'B' || arr[check][garo] == 'C') break;
			else if(arr[check][garo] == 'S') answer++;
		}
		return answer;
	}
	public static void testPrint(char [][] arr) {
		for(int sero=0; sero<arr.length; sero++) {
			for(int garo=0; garo<arr[sero].length; garo++) {
				System.out.print(arr[sero][garo] + " ");
			}
			System.out.println();
		}//for
	}//testPrint

}//class



