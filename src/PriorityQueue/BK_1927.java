package PriorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class BK_1927 {
    public static void main(String[] args) {
        int N, input;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++){
            input = sc.nextInt();
            if(input == 0){
                if (pq.isEmpty()){
                    System.out.println("0");
                }else{
                    System.out.println(pq.poll());
                }
            }else {
                pq.add(input);
            }
        }
    }
}
