package Implementation;

import java.util.Scanner;

public class BK_14500 {
    static int[][] paper;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        paper = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                paper[i][j] = sc.nextInt();
            }
        }
    }

    public static void CanGo(){

    }
}
