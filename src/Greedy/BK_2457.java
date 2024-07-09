package Greedy;

import java.util.*;

public class BK_2457 {

    public static void main(String[] args) {
        class Flower implements Comparable<Flower> {
            int start;
            int end;
            public Flower(int start, int end){
                this.start = start;
                this.end = end;
            }
            @Override
            public int compareTo(Flower f){
                if (this.start < f.start){
                    return -1;
                }else if (this.start == f.start){
                    if (this.end > f.end){
                        return -1;
                    } else if (this.end == f.end){
                        return 0;
                    }
                    return 1;
                }else {
                    return 1;
                }
            }
        }

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 꽃들의 총 개수
        Flower[] flowers = new Flower[N];
        for (int i = 0; i < N; i++){
            int start_month = sc.nextInt();
            int start_day = sc.nextInt();
            int end_month = sc.nextInt();
            int end_day = sc.nextInt();
            flowers[i] = new Flower(start_month * 100 + start_day,end_month * 100 + end_day);
        }

        Arrays.sort(flowers);

        int Start = 301;
        int End = 1201;
        int count = 0;
        int nowend = 0;
        int index = 0;

        while (Start < End){
                boolean finded = false;
                for (int i = index; i < N; i ++){
                    if (flowers[i].start > Start){ // 사작일 보다 늦게 피는 꽃만 있을때
                        break;
                    }
                    if (nowend < flowers[i].end){ //현재 가장 늦게 지는 꽃보다 늦게지는 꽃이 있으면 새 꽃
                        finded =  true;
                        nowend = flowers[i].end;
                        index = i + 1;
                    }
                }
                if (finded){ //새꽃을 찾았으면 시작일 변경
                    Start = nowend;
                    count++;
                }else { // 없으면 끝 0 출력
                    break;
                }
        }
        if (nowend < End){
            System.out.println(0);
        }else{
            System.out.println(count);
        }
    }
}
