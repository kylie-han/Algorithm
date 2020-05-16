import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
  * 
�������� : � ���� �ϴ� ������ ã�� �˰��� 
	-> ����׷����� �����ϴ� �� �������� ��������� �������� �����鼭 ��� ������ �����ϴ� ��
���������� Ư¡ : �ϳ��� ���� �׷������� ���� ���� ������ �����ϴ�.
			���������� �������� ���õ´� ������ ������ ��������� �Ѵ�.
			���������� �������� �׷����� �����ִ� ���� �߿� ���������� 0�� ������ ���ٸ�, ���� ���� �˰����� �ߴܵǰ� �̷��� �׷�


  */
public class boj_2252_�ټ����_�������� {
    static int n;   // ��� ����
    static int m;   // ���� ����
 
    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	n = sc.nextInt();
    	m = sc.nextInt();
    	// ������ ������ ���� �����Ƿ� ���� ����Ʈ�� ���
    	ArrayList<Integer>[] list = new ArrayList[n+1];
    	for (int i = 0; i < n; i++) {
			list[i] = new ArrayList<>();
		}
    	//�������� ����
    	//��������Ʈ ����鼭 �������� �����ϱ� ���� �迭
    	int[] indegree = new int[n+1];
    	for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();	
			list[x].add(y);
			indegree[y]++;
		}
    	//���������� 0�� �͵� ť�� ����
    	Queue<Integer> queue = new LinkedList<>();
    	for (int i = 1; i < n; i++) {
			if(indegree[i] == 0) {
				queue.offer(i);
			}
		}
    	//����Ŭ Ȯ��
    	if(queue.size() == 0) {
    		System.out.println("����Ŭ ����");
    		return;
    	}
    	//ť���� �ϳ� ���� ����� �ֵ� �������� 1�� ����, �ٽ� 0�� �͵��� ť�� ����
    	//ť���� �ϳ��� ���� �� ������ ����Ʈ�� ����
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
    	//����Ŭ Ȯ��
    	if(result.size() != n) {
    		System.out.println("����Ŭ ����");
    		return;
    	}
    	for(Integer idx : result) {
    		System.out.print(idx+" ");
    	}
    }
}















