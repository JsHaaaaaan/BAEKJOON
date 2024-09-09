package zStudy.Study_07_09;

import java.util.Scanner;

public class BK_25644 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //기간
        int[] stack = new int[N];

        for (int i = 0; i < N; i++) {
            stack[i] = sc.nextInt();
        }

        int maxprofit = 0; // 얻을수 있는 최대 이득
        int minstack = stack[0]; // 최소 주가
        for (int i = 0; i < N; i++) {
            if (stack[i] < minstack){
                minstack = stack[i];
            }else {
                int gap = stack[i] - minstack;
                if (gap > maxprofit){
                    maxprofit = gap;
                }
            }
        }
        System.out.println(maxprofit);
    }
}
