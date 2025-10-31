import java.util.Scanner;

public class Main_563 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] iArr = new int[10];
		for(int a=0; a<iArr.length; a++) {
			iArr[a] = scan.nextInt();
		}//for
		//
		int tmpInt = 0;
		for(int a=0; a<iArr.length; a++) {
			for(int b=a+1; b<iArr.length; b++) {
				if(iArr[b] > iArr[a]) {
					tmpInt = iArr[a];
					iArr[a] = iArr[b];
					iArr[b] = tmpInt;
				}
			}
		}//for
		//
		for(int a=0; a<iArr.length; a++) {
			System.out.print(iArr[a] + " ");
		}//for
	}//main

}
