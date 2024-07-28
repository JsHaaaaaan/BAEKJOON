package Implementation;

import java.io.BufferedReader;
import java.util.Scanner;

public class BK_17837 {
    static class Object{
        int row;
        int col;
        int direction;

        public Object(int row, int col, int direction){
            this.row = row;
            this.col = col;
            this.direction = direction;
        }
    }

    static int[][] board;
    static Object[] objects;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        //보드 입력
        board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        objects = new Object[K];
        //말입력
        for (int i = 0; i < K; i++) {
            objects[i] = new Object(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

    }
}
