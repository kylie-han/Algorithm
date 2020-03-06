import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_SWEA_1247_최적경로_ssafyLive {
    static int N, p[]; // N: 고객 수, p: 고객 순서를 만들 순열 용 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testCase = 1; testCase <= T; testCase++) {
            N = Integer.parseInt(br.readLine());
            int[][] customers = new int[N][2]; //N명의 고객 좌표
            int[][] distance = new int[N+2][2]; //회사 좌표(0), N명의 고객 좌표(순열로 순서 결정: 1~N), 집 좌표(N+1)
            p = new int[N];
            int min = Integer.MAX_VALUE;

            st = new StringTokenizer(br.readLine());
            distance[0][0] = Integer.parseInt(st.nextToken()); //회사
            distance[0][1] = Integer.parseInt(st.nextToken());
            distance[N+1][0] = Integer.parseInt(st.nextToken()); //집
            distance[N+1][1] = Integer.parseInt(st.nextToken());
            for (int i=0; i<N; i++){
                customers[i][0] = Integer.parseInt(st.nextToken());
                customers[i][1] = Integer.parseInt(st.nextToken());
                p[i] = i+1;
            }
            //end of input

            do{
                //순열로 처리
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

    //boolean : true => 다음 순열 생성 ok, false => 다음 순열 생성 불가 (이미 가장 큰 순열)
    static boolean nextPermutation() {
        // 1. 뒤쪽부터 탐색하며 꼭대기(i) 찾기 : i-1이 교환 위치
        int i = p.length-1;
        while(i>0 && p[i-1] >= p[i]) --i;
        if(i == 0) return false; //이미 제일 큰 마지막 순열이므로 다음 순열 없음

        // 2. 뒤쪽부터 탐색하며 교환할 큰 값(j) 찾기
        int j = p.length-1;
        while(p[i-1] >= p[j]) --j;

        // 3. 교환
        int temp = p[j];
        p[j] = p[i-1];
        p[i-1] = temp;

        // 4. i부터 N-1(맨 뒤)까지 내림차순 형태의 숫자를 오름차순으로 (가장 작은 수로 만들기 위해) 정렬 (교환)
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