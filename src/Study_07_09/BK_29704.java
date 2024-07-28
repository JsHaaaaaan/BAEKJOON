//package Study_07_09;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.StringTokenizer;
//
//public class BK_29704 {
//    static class Problem{
//        int day;
//        int penalty;
//
//        public Problem(int day, int penalty){
//            this.day =day;
//            this.penalty = penalty;
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st= new StringTokenizer(br.readLine());
//
//        int N = Integer.parseInt(st.nextToken()); //문제의 개수
//        int T = Integer.parseInt(st.nextToken()); //남은 제출기한
//        int result = 0;
//        Problem[] problems = new Problem[N];
//
//        for (int n = 0; n < N; n++) {
//            st = new StringTokenizer(br.readLine());
//            int day = Integer.parseInt(st.nextToken());
//            int penalty = Integer.parseInt(st.nextToken());
//            problems[n] = new Problem(day, penalty);
//        }
//
//        //정렬 벌금 순으로
//        Arrays.sort(problems, (a ,b) -> b.penalty - a.penalty);
//
//        int[] dp = new int[T + 1]; //벌금을 저장
//        int leftday = T;
//        for (int i = 0; i < N; i++){
//           //문제를 안 풀 경우
////            dp[i + 1] = Math.max(dp[])
////            //문제를 풀경우
////            if (leftday < T){
////                dp[i + 1] =
//
//            }
//        }
//
//    }
//}
