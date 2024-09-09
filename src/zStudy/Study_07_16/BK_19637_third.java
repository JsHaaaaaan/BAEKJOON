package zStudy.Study_07_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BK_19637_third {
    static int N, M;
    static String[] titlenames;
    static int[] forces;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 칭호의 개수
        M = Integer.parseInt(st.nextToken()); // 캐릭터들의 개수

        titlenames = new String[N];
        forces = new int[N];

        //칭호 입력
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            titlenames[i] = st.nextToken();
            forces[i] = Integer.parseInt(st.nextToken());
        }

        // 캐릭터 별 칭호 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int inputForce = Integer.parseInt(br.readLine());
            sb.append(BinarySearch(inputForce)).append("\n");
        }
        System.out.print(sb);
    }

    //각각에 맞는 칭호 구분
    public static String BinarySearch(int f) {
        int left = 0;
        int right = N;
        String invest = "";

        while (left <= right){
            int mid = (left + right) /2;
            if (forces[mid] >= f){
                right = mid - 1;
                invest = titlenames[mid];
            }else if(forces[mid] < f){
                left = mid + 1;
            }
        }
        return invest;
    }
}

