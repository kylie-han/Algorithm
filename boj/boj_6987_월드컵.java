import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 5 0 0 4 0 1 2 2 1 2 0 3 1 0 4 0 0 5
public class boj_6987_¿ùµåÄÅ {
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 4; i++) {
			st = new StringTokenizer(br.readLine());
			int[] scores = new int[6*3];
			boolean f = true;
			for (int j = 0; j < scores.length; j++) {
				scores[j] = Integer.parseInt(st.nextToken());
				if (scores[j] > 6)f = false;
			}
//			System.out.println(Arrays.toString(scores));
			// ´Ù¸¥ ÆÀµéÀÇ ÆÐ¼ö - ¿ì¸®ÆÀ ½Â¼ö>=0 && ´Ù¸¥ ÆÀµéÀÇ ÆÐ¼ö - ¿ì¸®ÆÀ ½Â¼ö == ´Ù¸¥ ÆÀµéÀÇ ½Â¼ö - ¿ì¸®ÆÀ ÆÐ¼ö
			// ´Ù¸¥ ÆÀµéÀÇ ¹«½ÂºÎ¼ö > ¿ì¸®ÆÀ ¹«½ÂºÎ¼ö && ´Ù¸¥ ÆÀµéÀÇ ¹«½ÂºÎ¼ö + ¿ì¸®ÆÀ ¹«½ÂºÎ¼ö %2 == 0
			for(int k = 0; k < 6; k++) {
				int myWin = scores[k*3];
				int myDraw= scores[k*3+1];
				int myLose= scores[k*3+2];
				int win = 0;
				int draw = 0;
				int lose = 0;
				for (int j = 0; j < 6; j++) {
					if (k == j) continue;
					win += scores[j*3];
					draw += scores[j*3+1];
					lose += scores[j*3+2];
				}
//				System.out.println(myWin+" "+myDraw+" "+myLose);
//				System.out.println(win+" "+draw+" "+lose);
//				System.out.println("======================");
				if (lose-myWin <0 || lose-myWin != win-myLose) {
					f = false;
				}
				if (draw < myDraw || (draw+myDraw)%2 !=0) {
					f = false;
				}
			}
			System.out.print((f?1:0)+" ");
		}
	}
}
