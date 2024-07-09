package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//정렬후 인덱스를 부여
public class BK_18869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken()); // 우주의 개수
        int N = Integer.parseInt(st.nextToken()); // 각 우주의 행성 개수

        List<int []> universes = new ArrayList<>();

        //입력
        for (int i = 0; i < M; i++) {
            int[] universe = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                universe[j] = Integer.parseInt(st.nextToken());
            }
            universes.add(universe);
        }

        //인덱스 부여 & 정렬
        List<int[]> sortuniverses = new ArrayList<>();

        for (int[] universe : universes){
            Integer[] index = new Integer[N];
            for (int i = 0; i < N; i++) {
                index[i] = i;
            }
            //행성크기 값으로 인덱스 정렬
            Arrays.sort(index, Comparator.comparingInt(x -> universe[x]));
            //인덱스 부여
            int[] sortuni = new int[N];

            for (int i = 0; i < N; i++) {
                sortuni[i] = index[i];
            }
            // 우주들 리스트에 추가
            sortuniverses.add(sortuni);
        }

        //쌍 개수 구하기
//        int result = 0;
//        Map<String, Integer> pair = new HashMap<>();
//
//        for (int[] s : sortuniverses){
//            StringBuilder sb = new StringBuilder();
//            for (int i : sortuni){
//                sb.append(i).append(" ");
//            }
//
//        }
//        for (int count : pair.values()){
//            if (count > 1){
//                result += (count * (count - 1)) / 2;
//            }
//        }
//        System.out.println(result);
    }
}
