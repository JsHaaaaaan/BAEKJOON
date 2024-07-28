package TwoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class BK_2330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] numlist = new int[N];
        for (int i = 0; i < N; i++) {
            numlist[i] = sc.nextInt();
        }

        Arrays.sort(numlist);

        int pone = 0;
        int ptwo = 0;
        int result = 2000000000;

        while (ptwo < N && pone <= ptwo){
            if (pone == ptwo){
                ptwo++;
            } else if (numlist[ptwo] - numlist[pone] > M) {
                result = Math.min(result, numlist[ptwo] - numlist[pone]);
                pone++;
            } else if (numlist[ptwo] - numlist[pone] == M) {
                result = M;
                break;
            } else {
                ptwo++;
            }
        }
        System.out.println(result);
    }
}
