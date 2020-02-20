import java.util.Scanner;

public class Main_562 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] iArr = new int[10];
		int holSum = 0, zakSum = 0;
		for(int a=0; a<iArr.length; a++) {
			iArr[a] = scan.nextInt();
			if(((a+1)%2) == 1) {//hol
				holSum += iArr[a];
			} else {//zak
				zakSum += iArr[a];
			}
		}//for
		System.out.println("sum : " + zakSum);
		System.out.printf("avg : %.1f", holSum/5.0);
	}

}
