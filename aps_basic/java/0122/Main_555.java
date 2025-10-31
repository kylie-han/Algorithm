import java.util.Scanner;

public class Main_555 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String strLine = scan.nextLine();
		System.out.println("strLine : " + strLine);
		String [] strArr = strLine.split(" ");
		for(String s : strArr) {
			System.out.print(s);
		}
		/*
		char [] chArr = new char[10];
		for(int i=0; i<10; i++) {
			chArr[i] = scan.next().charAt(0);
		}
		for(char c : chArr) {
			System.out.print(c);
		}
		*/
	}//main

}
