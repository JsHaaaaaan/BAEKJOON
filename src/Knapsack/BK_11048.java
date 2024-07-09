package Knapsack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BK_11048 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] miro = new int[N][M];
        for (int n = 0; n < N; n++) {
            st = new StringTokenizer(br.readLine());
            for (int m = 0; m < M; m++) {
                miro[n][m] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] dp = new int[N][M];
        dp[0][0] = miro[0][0];

        //시작점에서 아래로
        for (int i = 1; i < N; i++) {
            dp[i][0] = dp[i - 1][0] + miro[i][0];
        }
        //시작점에서 위로
        for (int j = 1; j < M; j++) {
            dp[0][j] = dp[0][j - 1] + miro[0][j];
        }
        //나머지
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < M; j++) {
                dp[i][j] = Math.max(dp[i][j-1], Math.max(dp[i-1][j], dp[i-1][j-1])) + miro[i][j];
            }
        }
        System.out.println(dp[N -1][M -1]);
    }
}
