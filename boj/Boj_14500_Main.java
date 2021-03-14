import java.util.Arrays;
import java.util.Scanner;

public class Boj_14500_Main {
    static int N,M,max;
    static int[][] map;
    static int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
    static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N+2][M+2];
        visited = new boolean[N+2][M+2];
        for (int i = 1; i < map.length-1; i++) {
            for (int j = 1; j < map[0].length-1; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        // 1.DFS 4개, 사방탐색, 최대값(max) 저장할거야. 
        max = 0;
        for (int i = 1; i < map.length-1; i++) {
            for (int j = 1; j < map[0].length-1; j++) {
                tetromino(0,i,j,0);
                specialCase(i,j);
            }
        }
        System.out.println(max);
    }
    private static void tetromino(int depth, int r, int c, int sum){
        if(depth >= 4) {
            max = Math.max(max, sum);
            return;
        }
        sum+=map[r][c];
        visited[r][c] = true;
        for (int i = 0; i < 4; i++) {
            if(r+dir[i][0]>=1 && r+dir[i][0]<N+1 && c+dir[i][1]>=1 && c+dir[i][1]<M+1 && !visited[r+dir[i][0]][c+dir[i][1]]){
                tetromino(depth+1, r+dir[i][0], c+dir[i][1], sum);
            }
        }
        visited[r][c] = false;
    }
    private static void specialCase(int r, int c){
        int[] numbers = new int[4];
        for (int i = 0; i < dir.length; i++) {
            numbers[i] = map[r+dir[i][0]][c+dir[i][1]];
        }
        Arrays.sort(numbers);
        int sum = map[r][c];
        for (int i = 1; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        max = Math.max(max, sum);
    }
}
