package Base.BK_14235;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 아이들과 거점지를 방문한 횟수 n
        for (int i = 0; i < n; i++){
            int a = scanner.nextInt();
            if (a == 0){
                if(q.isEmpty()){
                    System.out.println(-1);
                }
                else{
                    System.out.println(q.poll());
                }
            }else {
                for (int j = 0; j < a; j++){
                    q.add(scanner.nextInt());
                }
            }
        }
    }
}
