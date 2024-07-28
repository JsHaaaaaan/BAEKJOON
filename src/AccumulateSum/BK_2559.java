package AccumulateSum;

import java.io.IOException;
import java.util.Scanner;

public class BK_2559 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] temperature = new int[N];

        for (int i = 0; i < N; i++) {
            temperature[i] = sc.nextInt();
        }

        int[] sumlist = new int[N -K + 1];
        int start = 0;
        int end = K-1;
        int sum = 0;

        for (int i = 0; i <= end; i++) {
            sum += temperature[i];
        }

        int Max = sum;

        while (end < N - 1) {
            end++;
            sum += temperature[end] - temperature[start];
            start++;
            Max = Math.max(sum, Max);
        }

        System.out.println(Max);
    }
}
