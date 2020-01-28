import java.util.Arrays;
import java.util.Scanner;

public class 정올_Main_1169_주사위던지기1_한지혜 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] dice = {1,2,3,4,5,6};
		int[] arr = new int[n];
		switch (m) {
		case 1:
			m1(n,arr,0);
			break;
		case 2:
			m2(n,arr,0);
			break;
		case 3:
			
			break;

		default:
			break;
		}
		
	}//end of main
	public static void m1(int num, int[] a,int index) {
		if (num<=0) {
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]+" ");
			}System.out.println();
		} else {
			for (int i = 1; i <= 6; i++) {
				a[index] = i;
				m1(num-1,a,index+1);
			}
		}
	}//end of m1
	public static void m2(int num, int[] a,int index) {
		if (num<=0) {
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]+" ");
			}System.out.println();
		} else {
			for (int i = index; i <= 6; i++) {
				a[index] = i;
				m2(num-1,a,index+1);
			}
		}
	}//end of m2
	public static void m3(int num, int[] a,int index) {
		if (num<=0) {
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]+" ");
			}System.out.println();
		} else {
			for (int i = 1; i <= 6; i++) {
				a[index] = i;
				m3(num-1,a,index+1);
			}
		}
	}//end of m2
}//end of class