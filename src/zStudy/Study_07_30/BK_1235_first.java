package zStudy.Study_07_30;
//1자리부터 시작해서 모두 다른지 확인하고 같으면 자리수 늘리기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BK_1235_first {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); //학생수
        String[] students = new String[N];
        int K = 1; //최소는 1투터



        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            students[i] = String.valueOf(st.nextToken());
        }

        while (true){
            boolean isduplicate = false;
            Set<String> set = new HashSet<>();
            for (int i = 0; i < N; i++) {
                String tmp = students[i].substring(students[i].length() - K);
                if (set.contains(tmp)){ //중복이면 break
                    isduplicate = true;
                    break;
                }
                set.add(tmp); //중복아니면 set에 저장
            }
            if (!isduplicate){ //중복이 없으면 그게 최소 K
                System.out.println(K);
                break;
            }
            K++;
        }


    }
}
