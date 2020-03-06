import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_SWEA_1247_�������_ssafyLive {
    static int N, p[]; // N: �� ��, p: �� ������ ���� ���� �� �迭

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testCase = 1; testCase <= T; testCase++) {
            N = Integer.parseInt(br.readLine());
            int[][] customers = new int[N][2]; //N���� �� ��ǥ
            int[][] distance = new int[N+2][2]; //ȸ�� ��ǥ(0), N���� �� ��ǥ(������ ���� ����: 1~N), �� ��ǥ(N+1)
            p = new int[N];
            int min = Integer.MAX_VALUE;

            st = new StringTokenizer(br.readLine());
            distance[0][0] = Integer.parseInt(st.nextToken()); //ȸ��
            distance[0][1] = Integer.parseInt(st.nextToken());
            distance[N+1][0] = Integer.parseInt(st.nextToken()); //��
            distance[N+1][1] = Integer.parseInt(st.nextToken());
            for (int i=0; i<N; i++){
                customers[i][0] = Integer.parseInt(st.nextToken());
                customers[i][1] = Integer.parseInt(st.nextToken());
                p[i] = i+1;
            }
            //end of input

            do{
                //������ ó��
                for(int i=0; i<N; i++){
                    distance[p[i]] = customers[i];
                }
                int d = 0;
                for (int i = 0; i <= N; i++) {
                    d += Math.abs(distance[i][0] - distance[i+1][0]) + Math.abs(distance[i][1] - distance[i+1][1]);
                }
                if(min > d) min = d;
            }while(nextPermutation());

            //output
            sb.append('#').append(testCase).append(' ').append(min).append('\n');
        }
        System.out.print(sb);
    } //end of main

    //boolean : true => ���� ���� ���� ok, false => ���� ���� ���� �Ұ� (�̹� ���� ū ����)
    static boolean nextPermutation() {
        // 1. ���ʺ��� Ž���ϸ� �����(i) ã�� : i-1�� ��ȯ ��ġ
        int i = p.length-1;
        while(i>0 && p[i-1] >= p[i]) --i;
        if(i == 0) return false; //�̹� ���� ū ������ �����̹Ƿ� ���� ���� ����

        // 2. ���ʺ��� Ž���ϸ� ��ȯ�� ū ��(j) ã��
        int j = p.length-1;
        while(p[i-1] >= p[j]) --j;

        // 3. ��ȯ
        int temp = p[j];
        p[j] = p[i-1];
        p[i-1] = temp;

        // 4. i���� N-1(�� ��)���� �������� ������ ���ڸ� ������������ (���� ���� ���� ����� ����) ���� (��ȯ)
        int k = p.length-1;
        while(i<k) {
            temp = p[i];
            p[i] = p[k];
            p[k] = temp;
            ++i;
            --k;
        }
        return true;
    }
    
} //end of class