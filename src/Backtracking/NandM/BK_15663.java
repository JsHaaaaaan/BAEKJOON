package Backtracking.NandM;

import java.util.*;

public class BK_15663 {
    static int N,M;
    static int[] arr; //주어진 N개의 자연수
    static int[] sequence; //M개 담을 수열
    static boolean[] visited;
    static Set<String> isexist = new HashSet<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N];
        sequence = new int[M];
        visited = new boolean[N];

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
            StringBuilder tmpsb = new StringBuilder();
            for (int i = 0; i < M; i++) {
                tmpsb.append(sequence[i]).append(" ");
            }
            String tmp = tmpsb.toString().trim();
            if (!isexist.contains(tmp)){
                isexist.add(tmp);
                sb.append(tmpsb).append("\n");
            }
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]){
                visited[i] = true;
                sequence[depth] = arr[i];
                DFS(depth + 1);
                visited[i] = false;
            }
        }
    }
}
