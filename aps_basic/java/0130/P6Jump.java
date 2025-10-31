import java.util.Scanner;

public class P6Jump {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		for(int tc=0; tc<testCase; tc++) {
			int sizeX = scan.nextInt() + 1;
			int sizeY = scan.nextInt() + 1;
			int cntPlayer = scan.nextInt();
			//점프 배열
			int [][] arr = new int[sizeX][sizeY];
			for(int x=1; x<arr.length; x++) {
				for(int y=1; y<arr[x].length; y++) {
					arr[x][y] = scan.nextInt();
				}
			}
			//player 배열
			int [][] pArr = new int[cntPlayer][3];
			for(int a=0; a<pArr.length; a++) {
				for(int b=0; b<pArr[a].length; b++) {
					pArr[a][b] = scan.nextInt();
				}
			}
			//함정 입력
			int cntHam = scan.nextInt();
			for(int c=0; c<cntHam; c++) {
				int tmpX = scan.nextInt();
				int tmpY = scan.nextInt();
				arr[tmpX][tmpY] = 0;
			}
			//P_Utility.print(arr);
			//================================================
			int answer = 0;
			for(int idx=0; idx<pArr.length; idx++) {
				int x = pArr[idx][0];
				int y = pArr[idx][1];
				int pCnt = pArr[idx][2];
				for(int go=1; go<=pCnt; go++) {
					int where = arr[x][y] / 10;
					int howmuch = arr[x][y] % 10;
					if(where == 4) {//상
						x = x - howmuch;
					} else if(where == 2) {//하
						x = x + howmuch;
					} else if(where == 3) {//좌
						y = y - howmuch;
					} else if(where == 1) {//우
						y = y + howmuch;
					}
					if(x<=0 || y<=0 || x>=sizeX || y>=sizeY
						|| arr[x][y] == 0) {//실패
						answer = answer - 1000;
						break;
					}
					if(go == pCnt) {//성공
						answer = answer + (arr[x][y] * 100) - 1000;
					}
				}//for go
			}//for pArr idx
			System.out.println("#"+(tc+1)+" "+answer);
		}//for tc
	}//main

}//class





