import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
  
public class Solution_1494 {

	static int[][] arr;
    static boolean[] visited;
    static long answer;
    static int size_arr;
    public static void main(String[] args) throws Exception {
    	//System.setIn(new FileInputStream("C:/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        for(int test=1;test<=t;test++) {
        	size_arr = Integer.parseInt(br.readLine().trim());
            arr = new int [size_arr][2];
            visited = new boolean[size_arr];
            for(int i=0; i<size_arr; i++) {
                String[] s = br.readLine().split(" ");
                arr[i][0] = Integer.parseInt(s[0]);
                arr[i][1] = Integer.parseInt(s[1]);
            }
            //AlgoUtil.print(arr);
            answer = Long.MAX_VALUE;
            recur(0,0);
            System.out.println("#"+test+" "+answer);
        }
    }//main
    static void recur(int now,int cnt) {
        if(cnt == size_arr/2) {
            long x = 0;
            long y = 0;
            for(int i=0; i<size_arr; i++) {
                if(visited[i]) {
                    x += arr[i][0];
                    y += arr[i][1];
                } else {
                    x -= arr[i][0];
                    y -= arr[i][1];                    
                }
            }
            answer = Math.min(answer, x*x+y*y);
            return;
        }
        for(int i=now; i<size_arr; i++) {
            if(visited[i]) continue;
            visited[i] = true;
            recur(i+1, cnt+1);
            visited[i] = false;   
        }
    }//recur

}//class
