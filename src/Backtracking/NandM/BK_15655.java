package Backtracking.NandM;


import java.util.Arrays;
import java.util.Scanner;

public class BK_15655 {
    static int N, M;
    static int[] arr;
    static int[] origin;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        origin = new int[N];
        for (int i = 0; i < N; i++) {
            origin[i] = sc.nextInt();
        }
        Arrays.sort(origin);

        arr = new int[M];
        visited = new boolean[N];

        DFS(0,0);

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

        for (int i = start; i < N; i++) {
                if (!visited[i]){
                    visited[i] = true;
                    arr[depth] = origin[i];
                    DFS(i + 1,depth + 1);
                    visited[i] = false;
                }
        }
    }
}
