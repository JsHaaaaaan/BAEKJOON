package TwoPointer;

import java.util.Scanner;

public class BK_13144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int count = 0;
        boolean[] check = new boolean[100001];

        for (int end = 0; end < N; end++) {
            while (check[arr[end]]) {
                check[arr[start]] = false;
                start++;
            }

            check[arr[end]] = true;
            count += (end - start + 1);
        }


        System.out.println(count);
    }
}


