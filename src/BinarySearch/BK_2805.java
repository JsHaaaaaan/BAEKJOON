package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BK_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 나무의수
        int M = Integer.parseInt(st.nextToken()); // 가져가려는 나무의 길이

        int[] Tress = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            Tress[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = 1000000000;
        int height = 0;

        while (start <= end){
            int mid = (start + end) / 2;
            if (Cutting(Tress, M, mid)){
                height = mid;
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        System.out.println(height);
    }

    public static boolean Cutting(int[] trees, int m, int length){
        int result = 0;
        for (int cuttree : trees) {
            if (cuttree > length){
                result += (cuttree - length);
            }
            if (result >= m){
                return true;
            }
        }
        return result >= m;
    }
}
