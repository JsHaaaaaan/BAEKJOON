package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BK_17136 {
        static int[][] map = new int[10][10];
        static int[] paper = {0, 5, 5, 5, 5, 5};

    static int result = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //입력
        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        calMin(0, 0, 0);

        if (result == Integer.MAX_VALUE){
            System.out.println(-1);
        }else {
            System.out.println(result);
        }
    }

    public static void calMin(int row, int col, int count){
        //행의 끝을 넘으면 최소 종이수 갱신
        if (row == 10){
            result = Math.min(result, count);
            return;
        }

        //열의 끝을 넘으면 다음줄로
        if (col == 10){
            calMin(row + 1, 0, count);
            return;
        }

        //0이면 다음칸
        if (map[row][col] == 0){
            calMin(row, col + 1, count);
            return;
        }

        //5x5부터 확인
        for (int i = 5; i >= 1; i--) {
            //붙일수 있는지 확인
            if (canattach(row, col, i)){
                //색종이를 붙이고 때면서 갱신
                setpaper(row, col, i, 0); //색종이 붙임
                paper[i]--;; // 사용한 색종이 개수 감소
                calMin(row, col + i, count + 1);
                setpaper(row, col, i, 1); //색종이 제거
                paper[i]++; // 색종이 개수 복구
            }
        }
    }

    //붙일수 있는지 확인
    public static boolean canattach(int row, int col, int size){
        if (paper[size] == 0){
            return false;
        }

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (i >= 10 || j >= 10 || map[i][j] == 0){ //색종이가 종이를 넘어가거나 0이면 false
                    return false;
                }
            }
        }
        return true;
    }

    public static void setpaper(int row,  int col, int size, int set){
        for (int i = row; i < row + size; i++){
            for (int j = col; j < col + size; j++) {
                map[i][j] = set;
            }
        }
    }
}

