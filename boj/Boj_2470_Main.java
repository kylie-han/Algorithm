import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Boj_2470_Main {
    public static void main(String[] args) throws IOException {
        long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
        
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int[] arr = new int[N];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // Arrays.sort(arr);
        // int L = 0;
        // int R = N-1;
        // int ansL = 0;
        // int ansR = 0;
        // int zero = Integer.MAX_VALUE;
        // while(zero != 0 && L != R){
        //     int temp = arr[L] + arr[R];
        //     if(zero > Math.abs(temp)){
        //         ansL = arr[L];
        //         ansR = arr[R];
        //         zero = Math.abs(temp);
        //     }
        //     if(temp > 0){
        //         R--;
        //     }else{
        //         L++;
        //     }
            
        // }
        // System.out.println(ansL + " " + ansR);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int N = Integer.parseInt(st.nextToken());
        // List<Integer> arr = new ArrayList<>();
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < N; i++) {
            // arr.add(Integer.parseInt(st.nextToken()));
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // Collections.sort(arr);
        Arrays.sort(arr);
        int L = 0;
        int R = N-1;
        int ansL = 0;
        int ansR = 0;
        int zero = Integer.MAX_VALUE;
        while(zero != 0 && L != R){
            // int temp = arr.get(L) + arr.get(R);
            int temp = arr[L] + arr[R];
            if(zero > Math.abs(temp)){
                // ansL = arr.get(L);
                ansL = arr[L];
                ansR = arr[R];
                // ansR = arr.get(R);
                zero = Math.abs(temp);
            }
            if(temp > 0){
                R--;
            }else{
                L++;
            }
            
        }
        System.out.println(ansL + " " + ansR);

        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
        System.out.println("시간차이(m) : "+secDiffTime);
    }

}
