package zStudy.Study_07_30;


//1번 문제를 시작으로 밀당해서 최댓값 갱신
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class BK_28286_second {

    static int N,K;
    static int[] corret, mingue;
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        corret = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            corret[i] = Integer.parseInt(st.nextToken());
        }

        mingue = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            mingue[i] = Integer.parseInt(st.nextToken());
        }

        pullandpush(mingue, 0);
        System.out.println(result);


    }
    public static void pullandpush(int[] mingue, int moving){
        if (moving > K){
            return;
        }
        int count = calCount(mingue);
        result = Math.max(result, count);

        for (int i = 0; i < N; i++) {
            int[] tmpull = pull(mingue, i);
            pullandpush(tmpull, moving +1);
            int[] tmpush = push(mingue, i);
            pullandpush(tmpush, moving + 1);
        }


    }

    //맞은 문제 개수 계산
    public static int calCount(int[] mingue) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (mingue[i] == corret[i]) {
                count++;
            }
        }
        return count;
    }
    //밀기
    public static int[] pull(int[] mingue, int pos){
        int[] tmp = mingue.clone();
        for (int i = N - 1; i > pos; i--) {
            tmp[i] = tmp[i - 1];
        }
        tmp[pos] = 0;
        return tmp;
    }

    //당기기
    public static int[] push(int[] mingue, int pos){
        int[] tmp = mingue.clone();
        for (int i = pos; i < N -1; i++) {
            tmp[i] = tmp[i + 1];
        }
        tmp[N-1] = 0;
        return tmp;
    }

}
