package BinarySearch;

import java.util.*;

public class BK_10815 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //가지고 있는 카드 개수
        int[] having = new int[N];
        for (int i = 0; i < N; i++){
            having[i] = sc.nextInt();
        }
        Arrays.sort(having);

        int M = sc.nextInt(); //가지고있는지 확인할 개수
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < M; i++){
            int temp = sc.nextInt();
            result.append(BinarySearch(having, N, temp)).append(" ");
        }
        System.out.println(result.toString().trim());


    }
    public static int BinarySearch(int[] h, int N, int f){
        int start = 0;
        int end = N -1;
        int mid = 0;

        while (start <= end){
            mid = (start + end) / 2;
            if (h[mid] == f){
                return 1;
            }else {
                if (h[mid] < f) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return 0;
    }
}
