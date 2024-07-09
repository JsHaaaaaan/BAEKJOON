package Study_07_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BK_20291 {
    public static void main(String[] args) throws IOException {
        int N; //바탕화면에 있는 파일 개수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> filetype = new HashMap<>(); //확장자명을 키 - 갯수를 값

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++){
            String file = br.readLine().split("\\.")[1]; //파일명은 필요없고 확장자 이름만
            if(filetype.containsKey(file)){
                filetype.put(file, filetype.get(file) + 1); // 이미 있으면 +1
            }else{
                filetype.put(file, 1); //없으면 개수 1로 설정
            }
        }
        //키만 정렬하면 되는데 ....
        ArrayList<String> sort_Key = new ArrayList<>(filetype.keySet());
        Collections.sort(sort_Key); // 키정렬 근데이거 왜돼?


        StringBuilder sb = new StringBuilder();
        for(String file : sort_Key){
            sb.append(file).append(' ').append(filetype.get(file)).append('\n');
        }
        System.out.println(sb);
    }
}
