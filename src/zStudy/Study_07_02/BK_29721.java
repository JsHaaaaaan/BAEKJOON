package zStudy.Study_07_02;


import java.io.IOException;
import java.util.*;

public class BK_29721 {
    static int Size; //체스판의 크기 N
    static int Dabbaba; // 다바바의 개수 K
    static int[][] pos = {{0,-2}, {-2,0}, {0,2}, {2,0}};

    static Set<String> set;
    static Set<String> Daset;

    static void Move(int x, int y){
        for (int i = 0; i < pos.length; i++){
            int nx = x + pos[i][0];
            int ny = y + pos[i][1];

            if (nx >= 1 && nx <= Size && ny >= 1 && ny <= Size ){
                String str = nx + "," + ny;
                if (!set.contains(str) && !Daset.contains(str)) {
                    set.add((str));
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        Size = sc.nextInt();
        Dabbaba = sc.nextInt();

        set = new HashSet<>();
        Daset = new HashSet<>();
        List<int[]> tmplist = new ArrayList<>();

        for (int i = 0; i < Dabbaba; i++){
            int nowx = sc.nextInt();
            int nowy = sc.nextInt();
            String pos = nowx + "," + nowy;
            Daset.add(pos);
            tmplist.add(new int[]{nowx, nowy});
        }

        for (int[] pos : tmplist){
            Move(pos[0], pos[1]);
        }
        //여기서 결과 출력y
        System.out.println(set.size());

    }
}
