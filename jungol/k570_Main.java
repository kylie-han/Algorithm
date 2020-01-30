
public class k570_Main {
	public static void main(String[] args) {
		int[][] arr = new int[7][7];
		for (int i = 1; i < arr[i].length-1; i++) {
			for (int j = 1; j < arr.length-1; j++) {
				if(i==1 || j==1) {
					arr[i][j] = 1;
				}else {
					arr[i][j] = arr[i-1][j] + arr[i][j-1];
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}//end of for
	}//end of main
}//end of class
