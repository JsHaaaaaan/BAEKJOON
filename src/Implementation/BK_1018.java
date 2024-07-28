package Implementation;

import java.util.Scanner;

//1. 맨왼쪽 위칸을 기준을 시작으로 8x8크기 체스판 생성
//2. 칠해야하는 칸 개수 구하고
//3. 그 다음 칸 기준으로 체스판 생성
//4. 칠해아하는 칸 새구 구하고 그 전 체스판과 비교하여 갱신
public class BK_1018 {
    static char[][] board;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = scanner.nextLine().toCharArray();
        }

        int minpaint = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                minpaint = Math.min(minpaint, paintcount(i,j, 'W'));
                minpaint = Math.min(minpaint, paintcount(i,j, 'B'));
            }
        }
        System.out.println(minpaint);
    }

    public static int paintcount(int startx, int starty, char color){
        int count = 0;
        char current = color;

        for (int i = startx; i < startx + 8; i++) {
            for (int j = starty; j < starty + 8; j++) {
                if (board[i][j] != current){
                    count++;
                }
                current = (current == 'W') ? 'B' : 'W'; //색 바꾸기
            }
            current = (current == 'W') ? 'B' : 'W'; //색 바꾸기
        }
        return count;
    }

}
