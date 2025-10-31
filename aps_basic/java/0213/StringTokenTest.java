import java.util.StringTokenizer;

public class StringTokenTest {

	public static void main(String[] args) {
		String str = new String("123 456 789");
		StringTokenizer st = new StringTokenizer(str, " ");
		int sum = 0;
		while(st.hasMoreTokens()) {
			//System.out.println(st.nextToken());
			sum = sum + Integer.parseInt(st.nextToken());
		}
		System.out.println(sum);
	}

}
