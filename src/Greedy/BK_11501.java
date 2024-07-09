package Greedy;

import java.util.Scanner;

public class BK_11501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트케이스 수

        for (int i = 0; i < T; i++){
            int N = sc.nextInt(); // 날
            int[] stock = new int[N];

            for (int j = 0; j < N; j++){
                stock[j] = sc.nextInt();
            }
            long maxstock = 0; // 미래 최대 주식 가격
            long profit = 0; // 최대 이익
            for (int k = stock.length -1; k >= 0; k--){
                if (stock[k] > maxstock){
                    maxstock = stock[k];
                }else {
                    profit += maxstock - stock[k];
                }
            }
            System.out.println(profit);
        }
    }

}

