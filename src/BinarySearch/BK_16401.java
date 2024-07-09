package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//과자들을 조카들에게 줄 과자의 최대길이로 나누었을때 몫이 조카의 수가 되게

public class BK_16401 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken()); // 조카의 수
        int N = Integer.parseInt(st.nextToken()); // 과자의 수

        int[] snacks = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            snacks[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(snacks);

        int start = 1;
        int end = 1000000000;
        int mid = 0;
        int maxlen = 0;

        while(start <= end){
            mid = (start + end) / 2;
            if (Distributable(snacks, mid, M)){
                maxlen = mid;
                start = mid + 1; // 되면 더 긴 길이도 가능한지 확인
            }else {
                end = mid - 1; // 안되면 더 작은 길이로 확인
            }
        }
        System.out.println(maxlen);
    }
    public static boolean Distributable(int[] snack, int length, int M){ //과자배열, 나눌 길이, 조카수
        int quotient = 0;
        for (int s : snack){
            quotient += (s / length);
        }
        return quotient >= M;
    }
}
