import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_SWEA_5643_Ű����_�α� {
    private static int[][] a;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine().trim()); // 1 <= TC <= 15
        for (int testCase = 1; testCase <= TC; testCase++) {
            int N = Integer.parseInt(br.readLine().trim()); // �л����, 2 <= N <= 500
            int M = Integer.parseInt(br.readLine().trim()); // ��Ƚ��, 0 <= M <= N*(N-1)/2
            a = new int[N+1][N+1]; // 0�� �Ⱦ�, �������

            for (int i = 0; i < M; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                int small = Integer.parseInt(st.nextToken());
                int tall  = Integer.parseInt(st.nextToken());
                a[small][tall] = 1; // �ܹ���
            }

            for (int i = 1; i < a.length; i++) {
                up(i);
            }
            // up ���� �ϸ鼭 ū ģ������ ������Ŀ� �����ϰ� ����, ���������� ����ϸ� ������ ���� �л� ���� �˼� ���� 
            int totalN = 0; // �ڽ��� ������ ��Ȯ�� �� �� �ִ� �л� ��
            for (int i = 1; i < a.length; i++) {
                int sum = 0;
                for (int j = 1; j < a.length; j++) {
                    sum += a[i][j] + a[j][i]; // i���� ū �л�(����), i���� ���� �л�(����) ���� ����
                }
                if (sum == N-1) { // �ڽ��� ������ ��Ȯ�� �� �� ������ N-1
                    totalN++;
                }
            }
            System.out.println("#"+testCase+" "+totalN);
        } // end of for testCase
    } // end of main

public static void up(int v) {
    if (a[v][0] == -1) return; // �޸������̼�, 0�� ���� ���� -1�̸� �����ߴٴ� �ǹ�
    for (int i = 1; i < a.length; i++) {
        if (a[v][i] == 1) { // v ���� i �� ŭ
            up(i);
            for (int j = 1; j < a.length; j++) {
                a[v][j] |= a[i][j]; // ������ ū �л��� ������� ���� ���� �࿡ ���� �� (or ����)
            }
        }
    }
    a[v][0] = -1; // �������� ǥ��
}
} // end of class

