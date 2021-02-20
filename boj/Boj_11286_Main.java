import java.util.PriorityQueue;
import java.util.Scanner;

public class Boj_11286_Main {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        n = sc.nextInt();
        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> {
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);

            if(abs1 == abs2) return o1 > o2 ? 1 : -1;
            return abs1 - abs2;
        });
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a == 0){
                if(q.isEmpty()) sb.append("0\n");
                else sb.append(q.poll()+"\n");
            }else{
                q.add(a);
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
