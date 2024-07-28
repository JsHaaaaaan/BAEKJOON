package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BK_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 펼쳐진 카드 개수
        int M = Integer.parseInt(st.nextToken()); // 타겟
        int Max = 0;
        st = new StringTokenizer(br.readLine());

        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N-2; i++) {
            for (int j = i + 1; j < N-1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum <= M && sum > Max){
                        Max = sum;
                    }
                }
            }
        }
        System.out.println(Max);
    }
}
