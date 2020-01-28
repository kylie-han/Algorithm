import java.util.Scanner;

public class 정올_Main_1175_주사위던지기2_한지혜 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//주사위 던지는 횟수
		int m = sc.nextInt();//원하는 주사위 눈의 합
		int[] dice = {1,2,3,4,5,6};//주사위의 눈
		int[] arr = new int[n+1];
		dice(n,m,arr,1);
	}//end of main
	public static void dice(int num,int sum, int[] a,int index) {
		if (num<=0) {//출력
			int x=0;
			for (int i = 1; i < a.length; i++) {
				x+=a[i];
			}
			if(x == sum) {
				for (int i = 1; i < a.length; i++) {
					System.out.print(a[i]+" ");
				}System.out.println();
			}
		} else {	//배열 a에 0번지부터 하나씩 채움
			for (int i = 1; i <= 6; i++) {
				a[index] = i;
				dice(num-1,sum,a,index+1);//1회 시행후 num(주사위 던지는 수)줄이고 index(배열의 번지수) 증가
			}
		}
	}//end of dice
}//end of class
