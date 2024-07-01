package BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BK_10026 {
    static int N;
    static int count = 0;
    static String str;
    static char[][] grid;
    static boolean[][] visit;
    static int[][] pos = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public static void BFS(int x, int y) {
        visit[x][y] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            char tmp = grid[x][y];
            int startx = arr[0];
            int starty = arr[1];
            for (int k = 0; k < pos.length; k++) {
                int nx = startx + pos[k][0];
                int ny = starty + pos[k][1];
                //좌표가 범위내에있고 방문한적없으면
                if (nx >= 0 && nx < N && ny >= 0 && ny < N && grid[nx][ny] == tmp && !visit[nx][ny]) {
                    visit[nx][ny] = true; //방문한걸로 표시
                    queue.add(new int[]{nx, ny});
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        grid = new char[N][N];
        visit = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            str = sc.next();
            for (int j = 0; j < N; j++) {
                grid[i][j] = str.charAt(j);
            }
        }
        //일반인
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visit[i][j]) {
                    BFS(i, j);
                    count++;

                }
            }
        }
        System.out.println(count);
        count = 0;
        visit = new boolean[N][N];
        //적록생맹 G를 R로 변경
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 'G') {
                    grid[i][j] = 'R';

                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visit[i][j]) {
                    BFS(i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
