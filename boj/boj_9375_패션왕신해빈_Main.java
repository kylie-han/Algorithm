import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class boj_9375_ÆÐ¼Ç¿Õ½ÅÇØºó_Main {
	static int T, N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		T = Integer.parseInt(st.nextToken());
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				String val = st.nextToken();
				String key = st.nextToken();
				if (map.containsKey(key)) {
					map.put(key, map.get(key) + 1);
				} else {
					map.put(key, 1);
				}
			}
			int ans = 1;
			for (String k : map.keySet()) {
				ans *= map.get(k) + 1;
			}
			System.out.println(ans - 1);
		}
	}
}
