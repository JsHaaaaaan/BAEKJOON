package Study_07_09;

import java.util.Scanner;

public class BK_25176 {
    //길이 2N, N이 4일때 -> 1,1,2,2,3,3,4,4로 구성
    //1~N까지 수들 사이 각각마다 합이 최소
    //붙여서 이동
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= N; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
