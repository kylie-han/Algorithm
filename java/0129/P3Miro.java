import java.util.Scanner;

public class P3Miro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		for(int tc=0; tc<testCase; tc++) {
			int arrSize=scan.nextInt()+1;
			int [][] arr = new int [arrSize][arrSize];
			int startX=scan.nextInt();
			int startY=scan.nextInt();
			int cntJumper=scan.nextInt();
			for(int idx=0; idx<cntJumper;idx++) {
				int tmpX = scan.nextInt();
				int tmpY = scan.nextInt();
				arr[tmpX][tmpY] = 1;
			}
			int cntOrder=scan.nextInt();
			int [][] arrOrder = new int [cntOrder][2];
			for(int idx=0; idx<arrOrder.length;idx++) {
				arrOrder[idx][0] = scan.nextInt();
				arrOrder[idx][1] = scan.nextInt();
			}//입력 완료
			int where=0, howmuch=0, newX=startX, newY=startY;
			int answerX=0, answerY=0;
			boolean flag = false;
			for(int idx=0; idx<arrOrder.length;idx++){
				where = arrOrder[idx][0];
				howmuch = arrOrder[idx][1];
				for(int go=1; go<=howmuch; go++) {
					if(where == 1) newX = newX-1;
					else if (where == 3) newX = newX+1;
					else if (where == 2) newY = newY+1;
					else if (where == 4) newY = newY-1;
					if(newX<=0 || newY<=0
						|| newX>=arrSize || newY>=arrSize
						|| arr[newX][newY] == 1) {
						flag = true;
						answerX=0;
						answerY=0;
						break;
					}
					if(go == howmuch) {
						System.out.println(newX+" "+newY);
						answerX=newX;
						answerY=newY;
					}
				}//go
				if(flag) break;
			}//for
			System.out.println("#"+(tc+1)+" "+answerX+" "+answerY);
		}//for testCase
	}//main

}//class
