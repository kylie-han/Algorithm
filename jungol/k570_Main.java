/**
[출력]
 1  1  1  1  1 
 1  2  3  4  5 
 1  3  6 10 15 
 1  4 10 20 35 
 1  5 15 35 70 

 * @author jh han
 *
 */
public class k570_Main {
	public static void main(String[] args) {
		int[][] arr = new int[7][7];
		for (int i = 1; i < arr.length-1; i++) {//배열에서 
			for (int j = 1; j < arr[i].length-1; j++) {
				if(i==1 && j==1) {//1행1열은 1
					arr[i][j] = 1;
				}else {
					arr[i][j] = arr[i-1][j] + arr[i][j-1];
				}
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}//end of for
	}//end of main
}//end of class
