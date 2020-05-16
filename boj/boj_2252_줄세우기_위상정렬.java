import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
  * 
위상정렬 : 어떤 일을 하는 순서를 찾는 알고리즘 
	-> 방향그래프에 존재하는 각 정점들의 선행순서를 위배하지 않으면서 모든 정점을 나열하는 것
위상정렬의 특징 : 하나의 방향 그래프에는 여러 위상 정렬이 가능하다.
			위상정렬의 과정에서 선택돠는 정점의 순서를 위상순서라 한다.
			위상정렬의 과정에서 그래프에 남아있는 정점 중에 진입차수가 0인 정점이 없다면, 위상 정렬 알고리즘은 중단되고 이러한 그래


  */
public class boj_2252_줄세우기_위상정렬 {
    static int n;   // 노드 갯수
    static int m;   // 간선 갯수
 
    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	n = sc.nextInt();
    	m = sc.nextInt();
    	// 정점의 개수가 많지 않으므로 정점 리스트를 사용
    	ArrayList<Integer>[] list = new ArrayList[n+1];
    	for (int i = 0; i < n; i++) {
			list[i] = new ArrayList<>();
		}
    	//진입차수 관리
    	//인접리스트 만들면서 진입차수 관리하기 위한 배열
    	int[] indegree = new int[n+1];
    	for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();	
			list[x].add(y);
			indegree[y]++;
		}
    	//진입차수가 0인 것들 큐에 삽입
    	Queue<Integer> queue = new LinkedList<>();
    	for (int i = 1; i < n; i++) {
			if(indegree[i] == 0) {
				queue.offer(i);
			}
		}
    	//사이클 확인
    	if(queue.size() == 0) {
    		System.out.println("사이클 존재");
    		return;
    	}
    	//큐에서 하나 빼서 연결된 애들 진입차수 1씩 감소, 다시 0인 것들은 큐에 삽입
    	//큐에서 하나씩 뺄때 그 내용을 리스트로 정리
    	ArrayList<Integer> result = new ArrayList<>();
    	Integer cur;
    	while(!queue.isEmpty()) {
    		cur = queue.poll();
    		result.add(cur);
    		for(int idx : list[cur]) {
    			indegree[idx]--;
    			if (indegree[idx] == 0) {
    				queue.offer(idx);
    			}
    		}
    	}
    	//사이클 확인
    	if(result.size() != n) {
    		System.out.println("사이클 존재");
    		return;
    	}
    	for(Integer idx : result) {
    		System.out.print(idx+" ");
    	}
    }
}















