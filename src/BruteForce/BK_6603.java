package BruteForce;

import java.util.Scanner;

public class BK_6603 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            int K = sc.nextInt();
            if (K == 0){
                break;
            }

            int[] bind = new int[K];
            for (int i = 0; i <K ; i++) {
                bind[i] = sc.nextInt();
            }

            boolean[] visited = new boolean[K];
            Lotto(bind, visited, 0, K, 0);
            System.out.println();
        }
    }

    public  static void Lotto(int[] bind, boolean[] visited, int start, int k, int c){
        if(c == 6) {
            for (int i = 0; i < k; i++) {
                if (visited[i]) {
                    System.out.print(bind[i] + " ");
                }
            }
            System.out.println();
            return;
        }

        for (int i = start; i < k; i++) {
            visited[i] = true;
            Lotto(bind, visited, i+1, k, c+1);
            visited[i] = false;
        }
    }
}
