import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1546_ЦђБе_Main {
	static StringTokenizer st;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double[] subject = new double[n];
		st = new StringTokenizer(br.readLine());
		double max = Integer.MIN_VALUE;
		for (int i = 0; i < subject.length; i++) {
			subject[i] = Integer.parseInt(st.nextToken());
			if (subject[i] > max) { 
				max = subject[i];
			}
		}
		double sum = 0;
		for (int i = 0; i < subject.length; i++) {
			subject[i] = subject[i]/max*100.0;
			sum += subject[i];
		}
		System.out.printf("%.2f",sum/subject.length);
	}//end of main
}//end of class
