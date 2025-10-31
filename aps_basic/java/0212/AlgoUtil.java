
public class AlgoUtil {

	public static int changeXY(int direct, int pointX, int pointY, int howMany) {
		if(direct == 4) {//상
			pointX = pointX - howMany;
			return pointX;
		} else if(direct == 2) {//하
			pointX = pointX + howMany;
			return pointX;
		} else if(direct == 3) {//좌
			pointY = pointY - howMany;
			return pointY;
		} else if(direct == 1) {//우
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

	public static void print(long [][] arr) {
		for(int a=0; a<arr.length; a++) {
			for(int b=0; b<arr[a].length; b++) {
				System.out.print(arr[a][b] + " ");
			}
			System.out.println();
		}//for a
	}//print

	public static void printTab(int [][] arr) {
		for(int a=0; a<arr.length; a++) {
			for(int b=0; b<arr[a].length; b++) {
				System.out.print(arr[a][b] + "\t");
			}
			System.out.println();
		}//for a
	}//printTab

	public static void printTab(long [][] arr) {
		for(int a=0; a<arr.length; a++) {
			for(int b=0; b<arr[a].length; b++) {
				System.out.print(arr[a][b] + "\t");
			}
			System.out.println();
		}//for a
	}//printTab

	public static void print(int [] arr) {
		for(int a=0; a<arr.length; a++) {
			System.out.print(arr[a] + " ");
		}//for a
		System.out.println();
	}//print

	public static void print(char [] arr) {
		for(int a=0; a<arr.length; a++) {
			System.out.print(arr[a] + " ");
		}//for a
		System.out.println();
	}//print

}
