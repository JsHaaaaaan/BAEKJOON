package Greedy;

import java.util.*;

public class BK_11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 사람 수

        int[] P = new int[N];
        for (int i = 0; i < N; i++){
            P[i] = sc.nextInt();
        }

        Arrays.sort(P);

        int total = 0;
        int temp = 0;
        for (int i = 0; i < N; i++){
            temp += P[i];
            total += temp;
        }
        System.out.println(total);
    }
}
