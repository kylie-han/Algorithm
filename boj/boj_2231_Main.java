import java.util.Scanner;

public class boj_2231_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		int num = N;
		while(num != 0) {
			num = num-1;
			int sum = partSum(num) + num;
			if (sum == N) {
				result = num;
			}
		}
		System.out.println(result);
		sc.close();
	}

	private static int partSum(int num) {
		int sum = 0;
		while(num!=0){
            sum += num%10;
            num /= 10;
        }
		return sum;
	}
	
}
