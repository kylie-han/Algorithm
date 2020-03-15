import java.util.Scanner;

public class k1169_Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//주사위 던질 횟수
		int m = sc.nextInt();//1or2or3
		int[] arr = new int[n+1];//던져나온값저장
		switch (m) {
		case 1:
			m1(n,arr,1);
			break;
		case 2:
			m2(n,arr,1);
			break;
		case 3:
			m3(n,arr,1);
			break;
		default:
			break;
		}
		sc.close();
	}//end of main
	public static void m1(int num, int[] a,int index) {//num : 넘어온 숫자, a : 값을 저장할 배열, index : 배열의 번지수
		if (num<=0) {	//재귀 중단시 출력
			for (int i = 1; i < a.length; i++) {
				System.out.print(a[i]+" ");
			}System.out.println();
		} else {	//배열 a에 0번지부터 하나씩 채움
			for (int i = 1; i <= 6; i++) {
				a[index] = i;
				m1(num-1,a,index+1);//1회 시행후 num(주사위 던지는 수)줄이고 index(배열의 번지수) 증가
			}
		}
	}//end of m1
	public static void m2(int num, int[] a,int index) {//중복되지 않는 조합 출력
		if (num<=0) {//출력
			for (int i = 1; i < a.length; i++) {
				System.out.print(a[i]+" ");
			}System.out.println();
		} else {
			for (int i = 1; i <= 6; i++) {
				if(a[index-1]<=i) {// 같은 조합을 반복하지 않으려면 앞에 나온 수들보다 크거나 같아야함
					a[index] = i;
					m2(num-1,a,index+1);					
				}
			}
		}
	}//end of m2
	public static void m3(int num, int[] a,int index) {// 다른 숫자의 조합
		if (num<=0) {//출력
			for (int i = 1; i < a.length; i++) {
				System.out.print(a[i]+" ");
			}System.out.println();
		} else {
			boolean skip = false;//건너뛰는 곳을 알려주는 flag
			for (int i = 1; i <= 6; i++) {
				for (int j = 0; j < index; j++) {
					if(i==a[j]) skip = true;//앞의 숫자들중 같은 숫자가 있으면 skip
				}
				if(skip) {//건너뛸때skip플래그는 다시 false로 
					skip = false;
					continue;
				}else {//나머지는 재귀함수로 배열에 들어감
					a[index] = i;
					m3(num-1,a,index+1);					
				}
			}
		}
	}//end of m3

}//end of class