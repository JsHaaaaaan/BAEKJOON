package zStudy.Study_07_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BK_22115_fifth {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 커피의 개수
        int K = Integer.parseInt(st.nextToken()); // 섭취해야하는 카페인의 양

        //커피 입력
        int[] coffees = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            coffees[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[K+1];
        Arrays.fill(dp, 100000);
        dp[0] = 0;

        for (int coffee : coffees){
            for (int i = K; i >= coffee ; i--) {
                dp[i] = Math.min(dp[i], dp[i - coffee] + 1);
            }
        }

        if (dp[K] > 100){
            System.out.println("-1");
        } else {
            System.out.println(dp[K]);
        }
    }
}
