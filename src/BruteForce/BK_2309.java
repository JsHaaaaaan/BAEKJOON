package BruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class BK_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] shorts = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            shorts[i] = sc.nextInt();
            sum += shorts[i];
        }
        Arrays.sort(shorts);
        boolean find = false;

        //두명을 선택해서 100으로 만들기
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - shorts[i] - shorts[j] == 100){
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j){
                            System.out.println(shorts[k]);
                        }
                    }
                    find = true;
                    break;
                }
            }
            if (find){
                break;
            }
        }
    }
}
