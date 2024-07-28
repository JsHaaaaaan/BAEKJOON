package BruteForce;


import java.util.Scanner;
public class BK_14889 {
    static int N;
    static int[][] map;
    static boolean[] select;
    static int min= Integer.MAX_VALUE;



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); // 사람의 수
        map = new int[N][N];
        select = new boolean[N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        selectTeam(0,0);
        System.out.println(min);
    }

    public static void selectTeam(int index, int count){
        //고른 사람이 N/2명이 되면 차이를 구하고 재귀 종료
        if (count == N/2){
            min = Math.min(min, difference());
            return;
        }


        for (int i = index; i < N; i++) {
            if (!select[i]){
                select[i] = true;
                selectTeam(i + 1, count + 1);
                select[i] = false;
            }
        }
    }

    public static int difference(){
        int startsum = 0;
        int linksum = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (select[i] && select[j]){
                    startsum += map[i][j];
                } else if (!select[i] && !select[j]) {
                    linksum += map[i][j];
                }
            }
        }
        return Math.abs(startsum - linksum);
    }
}
