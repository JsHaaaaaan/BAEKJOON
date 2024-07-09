package HASH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BK_13414 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        String[] A = new String[L];

        for (int i = 0; i < L; i++) {
            A[i] = br.readLine();
        }

        LinkedHashSet<String> set = new LinkedHashSet<>();

        for(String item : A){
            if(set.contains(item)){ //중복이면 제거하고 추가
                set.remove(item);
            }
            set.add(item);
        }

        int temp = 0;

        for(String answer : set){
            temp++;
            System.out.println(answer);
            if(temp == K) break;
        }
    }
}
