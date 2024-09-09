package Backtracking.NandM;


import java.util.Scanner;

public class BK_15652 {
    static int N, M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M];

        DFS(1,0);

        System.out.println(sb);
    }

    public static void DFS(int start, int depth){
        if (depth == M){
            for (int i = 0; i < M; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i <= N; i++) {
                arr[depth] = i;
                DFS(i ,depth + 1);
        }
    }
}
