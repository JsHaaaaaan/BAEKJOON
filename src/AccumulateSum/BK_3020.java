package AccumulateSum;


import java.util.Scanner;

public class BK_3020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 동굴 길이
        int H = sc.nextInt(); // 동굴 높이
        // 장애물 길이별로 카운트
        int[] top = new int[H + 1];
        int[] bottom = new int[H + 1];
        for (int i = 0; i < N / 2; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            bottom[a]++;
            top[b]++;
        }

        //누적합 계산 - 각 높이 이하이 장애풀 수
        int[] bottomSum = new int[H+1];
        int[] topSum = new int[H+1];

        for (int i = 1; i <= H; i++) {
            bottomSum[i] = bottomSum[i - 1] + bottom[i];
            topSum[i] = topSum[i - 1] + top[i];
        }

        int min = Integer.MAX_VALUE;
        int count = 0;

        //각 구간에서의 장애물 수 계산
        for (int i = 1; i <= H; i++) {
            int obstacle = (bottomSum[H] - bottomSum[i -1]) + (topSum[H] - topSum[H - i]);
            if (obstacle < min){
                min = obstacle;
                count = 1;
            } else if (obstacle == min) {
                count++;
            }
        }
        System.out.println(min + " " + count);
    }
}
