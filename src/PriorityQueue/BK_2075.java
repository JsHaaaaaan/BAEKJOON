package PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BK_2075 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                pq.offer(sc.nextInt());
            }
        }

        for (int i = 0; i < N-1; i++){
            pq.poll();
        }

        System.out.println(pq.poll());
    }
}
