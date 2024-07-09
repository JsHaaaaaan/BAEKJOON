package Knapsack;

import java.util.Scanner;

public class BK_3067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // 동전 가지수
            int[] coins = new int[N];
            for (int i = 0; i <N; i++) {
                coins[i] = sc.nextInt();
            }
            int M = sc.nextInt(); //만들어야할 금액

            int[] dp = new int[M+1];
            dp[0] = 1;

            for (int coin : coins){
                for (int j = coin; j <= M; j++) {
                    dp[j] += dp[j - coin];
                }
            }
            System.out.println(dp[M]);
        }
    }
}
