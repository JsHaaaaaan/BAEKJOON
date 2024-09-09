//N개의 강의중 K개를 택하여 들었을때 각 역량별 합 구하고
// 두가지 역량의 합 3종류를 구해?

package zStudy.Study_07_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BK_27922_fourth {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 총 강의 개수
        int K = Integer.parseInt(st.nextToken()); // 수강할 강의 개수
    }
}
