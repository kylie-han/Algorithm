import java.util.Scanner;

public class P4Building {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		for(int tc=0; tc<testCase; tc++) {
			int arrSize = scan.nextInt();
			char [][] arr = new char[arrSize][arrSize];
			for(int a=0; a<arr.length; a++) {
				for(int b=0; b<arr[a].length; b++) {
					arr[a][b] = scan.next().charAt(0);
				}
			}//for a
			//P_Utility.print(arr);
			//========================================
			int [] sero = {-1,-1,-1,    1,1,1,   0,0};//8방탐색
			int [] garo = {-1,0,1,     -1,0,1,  -1,1};
			//String [] jisi = {"상전","상","상후",  "하전","하","하후",  "좌","우"};
			int answer = 0;
			for(int a=0; a<arr.length; a++) {
				for(int b=0; b<arr[a].length; b++) {

					boolean flag = true;
					if(arr[a][b] == 'B') {
						for(int c=0; c<sero.length; c++) {//8방탐색
							int newX = a+sero[c];
							int newY = b+garo[c];
							if(newX<0 || newY<0
								|| newX>=arr.length || newY>=arr.length) continue;
							if(arr[newX][newY] == 'G') {
								answer = 2;
								flag = false;
								break;
							}
						}//for c
						if(flag == true) {
							int thisTimeAnswer = 1;//현재 위치의 B count 1
							//System.out.println(a + " : " + b);
							for(int up=a-1; up>=0; up--) {//상//현재 위치 제외
								if(arr[up][b] == 'B') thisTimeAnswer++;
							}
							for(int down=a+1; down<arr.length; down++) {//하//현재 위치 제외
								if(arr[down][b] == 'B') thisTimeAnswer++;
							}
							for(int left=b-1; left>=0; left--) {//좌//현재 위치 제외
								if(arr[a][left] == 'B') thisTimeAnswer++;
							}
							for(int right=b+1; right<arr.length; right++) {//우//현재 위치 제외
								if(arr[a][right] == 'B') thisTimeAnswer++;
							}
							if(thisTimeAnswer > answer) {
								answer = thisTimeAnswer;
							}
							break;
						}// if true
					}//if Building

				}//for b
			}//for a
			System.out.println("#"+(tc+1)+" "+answer);
		}//for tc
	}//main

}//class
