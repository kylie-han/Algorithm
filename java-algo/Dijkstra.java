import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Node implements Comparable<Node>{
    private int index;
    private int distance;
    public Node(int index, int distance){
        this.index = index;
        this.distance = distance;
    }
    
    @Override
    public int compareTo(Node o) {
        if(this.distance < o.distance) return -1;
        return 1;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

}
public class Dijkstra {
    static final int INF = Integer.MAX_VALUE;
    static int N,M,C;
    static int[] d = new int[30001];
    static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        C = sc.nextInt();
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<Node>());
        }
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            graph.get(x).add(new Node(y,z));
        }
        Arrays.fill(d, INF);
        dijkstra(C);
        int count = 0;
        int maxDistance = 0;
        for (int i = 0; i < N; i++) {
            if(d[i]!= INF){
                count+=1;
                maxDistance = Math.max(maxDistance,d[i]);
            }
        }
        System.out.println((count-1) +" "+maxDistance);
        
    }

    public static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start,0));
        d[start] = 0;
        while(!pq.isEmpty()){
            Node node = pq.poll();
            int dist = node.getDistance();
            int now = node.getIndex();
            if(d[now] < dist) continue;
            for (int i = 0; i < graph.get(now).size(); i++) {
                int cost = d[now] + graph.get(now).get(i).getDistance();
                if(cost < d[graph.get(now).get(i).getIndex()]){
                    d[graph.get(now).get(i).getIndex()] = cost;
                    pq.offer(new Node(graph.get(now).get(i).getIndex(),cost));
                }
            }
        }
    }

}