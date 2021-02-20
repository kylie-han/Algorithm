import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Boj_1655_Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> small = new PriorityQueue<>((o1,o2) -> o2-o1);
        PriorityQueue<Integer> large = new PriorityQueue<>((o1,o2) -> o1-o2);
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int a = Integer.parseInt(br.readLine());
            if(large.size() == small.size()) small.offer(a);
            else large.offer(a);

            if(!large.isEmpty() && !small.isEmpty() && large.peek() < small.peek()){
                    int tmp = large.poll();
                    large.offer(small.poll());
                    small.offer(tmp);
                }

            sb.append(small.peek()+"\n");
        }
        System.out.println(sb);
    }
}
