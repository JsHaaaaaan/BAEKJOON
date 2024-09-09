package Backtracking.NandM;

import java.util.Scanner;

public class BK_15650 {
    static int N, M;
    static boolean[] visited;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        visited = new boolean[N+1];
        arr = new int[M];

        DFS(1, 0);
    }

    public static void DFS(int start, int depth){
        if (depth == M){
            for (int num : arr){
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= N; i++) {
            if (!visited[i]){
                visited[i] = true;
                arr[depth] = i;
                DFS(i + 1, depth + 1);
                visited[i] = false;
            }
        }
    }
}
