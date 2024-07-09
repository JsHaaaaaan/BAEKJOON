package Greedy;

import java.util.*;

//0을 이용해서 음수 제거
//1은 그냥 더하기
// 0과 음수, 1, 1보다 큰 양수로 분류
public class BK_1744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 수열의 크기
        int sum = 0;


        List<Integer> negative = new ArrayList<>();
        List<Integer> positive = new ArrayList<>();
        for (int i = 0; i < N; i++){
            int number = sc.nextInt();
            if (number <= 0){
                negative.add(number);
            }else if (number == 1){
                sum += 1;
            }else {
                positive.add(number);
            }
        }
        // 1이상
        Collections.sort(positive, Collections.reverseOrder());
        for (int i = 0; i < positive.size() -1; i+=2){
            sum += positive.get(i) * positive.get(i + 1);
        }
        if (positive.size() % 2 == 1){ //1 이상이 홀수 개 일때 마지막은 그냥 더하기
            sum += positive.get(positive.size() -1);
        }

        //0이하
        Collections.sort(negative);
        for (int i = 0; i < negative.size() -1; i+=2){
            sum += negative.get(i) * negative.get(i + 1);
        }
        if (negative.size() % 2 == 1){
            sum += negative.get(negative.size() - 1);
        }

        System.out.println(sum);
    }
}
