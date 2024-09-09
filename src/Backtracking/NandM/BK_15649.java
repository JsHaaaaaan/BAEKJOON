package Backtracking.NandM;

import java.util.Scanner;

public class BK_15649 {
    static int N,M;
    static boolean[] visited;
    static int[] arr ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();


        visited = new boolean[N + 1];
        arr = new int[M];

        DFS(0);
    }

    public static void DFS(int depth){
        if (depth == M){
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]){
                visited[i] = true;
                arr[depth] = i;
                DFS(depth+1);
                visited[i] = false;
            }
        }
    }
}
