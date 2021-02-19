import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Boj_11286_Main {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        n = sc.nextInt();
        Queue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a == 0){
                if(q.isEmpty()){
                    sb.append("0\n");
                }else{
                    sb.append(q.poll()+"\n");
                }
            }else{
                q.add(a);
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
