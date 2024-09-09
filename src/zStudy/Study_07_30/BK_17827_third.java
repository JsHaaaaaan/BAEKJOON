package zStudy.Study_07_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class BK_17827_third {
    static int N,M,V;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); //노드 개수
        M = Integer.parseInt(st.nextToken()); //질문 횟수
        V = Integer.parseInt(st.nextToken()); //N번, 마지막 노트가 가리키는 노드 번호(순서)

        int[] snaillist = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            snaillist[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int question = Integer.parseInt(br.readLine());
            if (question < N){
                sb.append(snaillist[question]).append("\n");
            }else {
                sb.append(snaillist[V - 1 + (question - N) % (N - V + 1)]).append("\n");
            }
        }

        System.out.println(sb);
    }
}
