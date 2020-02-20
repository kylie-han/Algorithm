
public class P_Utility {

	public static int changeXY(int direct, int pointX, int pointY, int howMany) {
		if(direct == 4) {//╩С
			pointX = pointX - howMany;
			return pointX;
		} else if(direct == 2) {//го
			pointX = pointX + howMany;
			return pointX;
		} else if(direct == 3) {//аб
			pointY = pointY - howMany;
			return pointY;
		} else if(direct == 1) {//©Л
			pointY = pointY + howMany;
			return pointY;
		}
		return -1;
	}

	public static void print(char [][] arr) {
		for(int a=0; a<arr.length; a++) {
			for(int b=0; b<arr[a].length; b++) {
				System.out.print(arr[a][b] + " ");
			}
			System.out.println();
		}//for a
	}//print

	public static void print(int [][] arr) {
		for(int a=0; a<arr.length; a++) {
			for(int b=0; b<arr[a].length; b++) {
				System.out.print(arr[a][b] + " ");
			}
			System.out.println();
		}//for a
	}//print

}
