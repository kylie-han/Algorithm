import java.util.Scanner;

public class Main_557 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char [] chArr = new char[10];
		for(int i=0; i<chArr.length; i++) {
			chArr[i] = scan.next().charAt(0);
		}
		//for(int i=0; i<chArr.length; i++) {
		//	if((i%3) == 0) System.out.print(chArr[i] + " ");
		//}
		System.out.print(chArr[0] + " " + chArr[3] + " " + chArr[6]);
	}//main

}
