import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_4344_평균은넘겠지_Main {
	static StringTokenizer st;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for (int t = 0; t < tc; t++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			double[] student = new double[n];
			double sum = 0;
			for (int i = 0; i < student.length; i++) {
				student[i] = Integer.parseInt(st.nextToken());
				sum += student[i];
			}
			double avg = sum/student.length;
			int cnt = 0;
			for (int i = 0; i < student.length; i++) {
				if(student[i] > avg) cnt++;
			}
			System.out.printf("%.3f%%\n",(double)cnt/student.length*100.0);
			
		}//end of for tc
	}//end of main
}//end of class
