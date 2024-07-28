package TwoPointer;

import java.util.ArrayList;
import java.util.Scanner;

public class BK_1644 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        ArrayList<Integer> primes = new ArrayList<>();
        boolean[] isprime = new boolean[N + 1];

        for (int i = 2; i <= N ; i++) {
            isprime[i] = true;
        }

        for (int i = 2; i * i <= N ; i++) {
            if (isprime[i]) {
                for (int j = i * i; j <= N; j+=i) {
                    isprime[j] = false;
                }
            }
        }

        for (int i = 2; i <= N ; i++) {
            if (isprime[i]) primes.add(i);
        }

        int result = 0;
        int sum = 0;
        int pone = 0;
        int ptwo = 0;

        while (true) {
            if (sum >= N) {
                sum -= primes.get(pone);
                pone++;
            } else if (ptwo == primes.size()) {
                break;
            } else {
                sum += primes.get(ptwo);
                ptwo++;
            }

            if (sum == N) {
                result++;
            }
        }
        System.out.println(result);
    }
}
