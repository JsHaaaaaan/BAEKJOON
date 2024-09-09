package Backtracking.NandM;

import java.util.Arrays;
import java.util.Scanner;

public class BK_15656 {
    static int N,M;
    static int[] arr; //주어진 N개의 자연수
    static int[] sequence; //M개 담을 수열
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N];
        sequence = new int[M];

        //N개의 자연수 입력
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        DFS(0);
        System.out.println(sb);
    }

    public static void DFS(int depth){
        if (depth == M){
            for (int i = 0; i < M; i++) {
                sb.append(sequence[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            sequence[depth] = arr[i];
            DFS(depth+1);
        }
    }
}
