import java.util.Scanner;

public class k539_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//입력받는 메소드
		int a = 0;
		int sum = 0;//총합
		int cnt = 0;//평균을 구하기 위해 갯수 세기
		while(a<100) {//100이 들어 올 때까지 반복
			a = sc.nextInt();//
			sum += a;
			cnt++;
		}
		System.out.println(sum);
		if(cnt != 0){
			System.out.println(String.format("%.1f", ((float)sum/cnt)));//14.15의 1째까지 반올림하기 위해 format 사용
			System.out.printf("%.1f",((float)sum/cnt));
		}
		sc.close();
	}//main
}//class
