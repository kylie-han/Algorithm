import java.util.Scanner;

public class Main_566 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] arr = new int[100];
		arr[0] = 100;
		arr[1] = scan.nextInt();
		int lastNo = 0;
		for(int a=2; a<arr.length; a++) {
			arr[a] = arr[a-2] - arr[a-1];
			if(arr[a] < 0) {
				lastNo = a;
				break;
			}
		}//for
		//
		for(int b=0; b<=lastNo; b++) {
			System.out.print(arr[b] + " ");
		}
	}//main

}
