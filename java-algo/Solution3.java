import java.util.Scanner;

public class Solution3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int testCase = 1; testCase <= TC; testCase++) {
			String s = sc.next();
			char[] data = s.toCharArray();
			int num=0;
			if (data[0] == '1') num++;
			for (int i = 1; i < data.length; i++) {
				if(data[i-1] != data[i]) num++;
			}
			System.out.println("#"+testCase+" "+num);
		}
		sc.close();
	}
}