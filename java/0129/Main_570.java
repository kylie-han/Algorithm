
public class Main_570 {

	public static void main(String[] args) {
		int [][] arr = new int [5][5];
		for(int sero=0; sero<arr.length; sero++) {
			for(int garo=0; garo<arr[sero].length; garo++) {
				if(sero == 0 || garo == 0) {
					arr[sero][garo] = 1;
				} else {
					arr[sero][garo]
						= arr[sero-1][garo] + arr[sero][garo-1];
				}
				System.out.print(arr[sero][garo] + " ");
			}
			System.out.println();
		}//for

	}

}
