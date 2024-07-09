package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BK_14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] T = new int[N];
        int[] P = new int[N];


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N+1]; //N일의 수익까지 저장

        for (int i = 0; i < N; i++) {
            //상담 안하는 경우
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);

            //상담 하는 경우
            if(i + T[i] <= N){
                dp[i + T[i]] = Math.max(dp[i + T[i]], dp[i] + P[i]);
            }
        }
        System.out.println(dp[N]);
    }
}
