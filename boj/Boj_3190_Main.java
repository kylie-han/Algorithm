import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj_3190_Main {
    static int N, K, L;
    static boolean[][] map;
    static char[] dirChange = new char[100];
    static int ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new boolean[N+1][N+1];
        K = sc.nextInt();
        for (int i = 0; i < K; i++) {
            map[sc.nextInt()][sc.nextInt()] = true;
        }
        L = sc.nextInt();
        for (int i = 0; i < L; i++) {
            dirChange[sc.nextInt()] = sc.next().charAt(0);
        }
        // input
        // position(start, end point)
        Queue<Snake> snake = new LinkedList<>();
        Snake head = new Snake(1, 1);
        snake.add(head);
        // direction
        int[] dir = { 0, 1 };
        while (true) {
            System.out.println(head.row);
            System.out.println(head.col);
            dir = direction(dirChange[ans++], dir);
            head.row += dir[0];
            head.col += dir[1];
            // 벽 만나는지 확인, 만나면 종료
            if (head.row > N || head.col > N || head.row <= 0 || head.col <= 0) {
                System.out.println(head.row);
                System.out.println(head.col);
                break;
            }
            // 꼬리만나는지 확인, 만나면 종료
            if (snake.contains(new Snake(head.col, head.row))) {
                System.out.println(2);
                break;
            }
            snake.add(new Snake(head.col, head.row));
            // 사과가 있는지 확인, map사과 소진시 종료
            if (map[head.row][head.col]) {
                K--;
            } else {
                snake.poll();
            }
        }
        System.out.println(ans);
    }

    private static int[] direction(char LD, int[] RC) {
        // 01 10 0-1 -10
        int[] newRC = new int[2];
        if (LD == 'D') {
            newRC[0] = RC[1];
            newRC[1] = RC[0] * -1;
        } else if (LD == 'L') {
            newRC[0] = RC[1] * -1;
            newRC[1] = RC[0];
        } else {
            newRC = RC;
        }
        return newRC;
    }
}

class Snake {
    int row;
    int col;

    Snake(int row, int col) {
        row = this.row;
        col = this.col;
    }
}
