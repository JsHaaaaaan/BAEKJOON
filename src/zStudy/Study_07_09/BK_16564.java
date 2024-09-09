package zStudy.Study_07_09;

import java.util.Arrays;
import java.util.Scanner;

public class BK_16564 {
    //최소레벨을 최대로
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //캐릭터개수
        int K = sc.nextInt(); // 올릴 수 있는 레벨 총합

        int[] character = new int[N];
        for (int i = 0; i < N; i++) {
            character[i] = sc.nextInt();
        }

        Arrays.sort(character);

        //가능한 최대레벨을 찾으면서 올린 레벨의 총합이 K를 넘는지 확인
        int minL = character[0];
        int maxL = character[N -1] + K;
        int result = character[0];

        while (minL <= maxL){
            int mid = (minL + maxL) / 2;
            if (increasable(character, mid, K)){
                result = mid;
                minL = mid + 1;
            }else {
                maxL = mid -1;
            }
        }
        System.out.println(result);
    }

    //레벨업 가능한지?
    public static boolean increasable(int[] character, int mid, int K){
        int increaselevel = 0;
        for (int c : character){
            if (c < mid){
                increaselevel += mid - c;
            }
            if (increaselevel > K){
                return false;
            }
        }
        return increaselevel <= K;
    }
}
