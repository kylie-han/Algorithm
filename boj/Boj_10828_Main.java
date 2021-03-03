import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj_10828_Main {
    static List<Integer> stack = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine().trim());
            if(st.nextToken().equals("push")){
                stack.add(Integer.parseInt(st.nextToken()));
            }else if(st.nextToken().equals("pop")){
                stack.
            }else if(st.nextToken().equals("size")){
            }else if(st.nextToken().equals("empty")){
            }else if(st.nextToken().equals("top")){

            }
        }
    }
    private static void push(int x){

    }
}
