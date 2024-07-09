package HASH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BK_17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //저장된 사이트 주소수
        int M = Integer.parseInt(st.nextToken()); // 찾으려는 사이트 주소수

        Map<String, String> map = new HashMap<>();
        for (int i=0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String site = st.nextToken();
            String password = st.nextToken();
            map.put(site, password);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String find = br.readLine();
            sb.append(map.get(find)).append('\n');
        }

        // 결과 출력
        System.out.print(sb);
    }
}
