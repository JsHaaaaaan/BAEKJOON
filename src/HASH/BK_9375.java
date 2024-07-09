package HASH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class BK_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int case_num = Integer.parseInt(br.readLine());

        for (int c = 0; c < case_num; c++){
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++){
                String str = br.readLine().split(" ")[1]; //옷의 종류만 필요
                if (map.containsKey(str)){
                    map.put(str, map.get(str)+1); //기존에 있으면 +1
                }else {
                    map.put(str, 1); // 없으면 1로 초기화
                }
            }
            //결과 구하기
            int result = 1;
            for (int kind : map.values()){
                result *= (kind + 1);
            }
            result -= 1;
            System.out.println(result);
        }

    }
}
