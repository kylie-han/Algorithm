
public class Array4 {

	public static void main(String[] args) {
		int [][] arr = new int [2][];
		arr[0] = new int [5];
		arr[1] = new int [10];
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		for(int a=0; a<arr.length; a++) {
			for(int b=0; b<arr[a].length; b++) {
				System.out.print(arr[a][b] + " ");
			}
			System.out.println();
		}//for
	}

}
