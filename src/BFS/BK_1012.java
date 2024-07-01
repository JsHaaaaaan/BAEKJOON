package BFS;

import java.util.*;

public class BK_1012 {
    static int case_num;
    static int width, height;
    static int cabbage;
    static boolean[][] visited;
    static int[][] field;
    //static int count; //벌레수
    static int[][] pos = {{0,-1}, {0,1}, {1,0}, {-1,0}}; //위아래 체크용


    public static void BFS(int x, int y){
        visited[x][y] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()){
            int[] arr = queue.poll();
            int startx = arr[0];
            int starty = arr[1];
            for (int k = 0; k < pos.length; k++) {
                int nx = startx + pos[k][0];
                int ny = starty + pos[k][1];
                //좌표가 범위내에있고 방문한적없으면
                if (nx >= 0 && nx < height && ny >= 0 && ny < width && field[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true; //방문한걸로 표시
                    queue.add(new int[]{nx, ny});
                }
            }

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        case_num = sc.nextInt();

        for (int i = 0; i < case_num; i++){
            width = sc.nextInt();
            height = sc.nextInt();
            cabbage = sc.nextInt();
            int count = 0;
            field = new int[height][width];
            visited = new boolean[height][width];

            for (int j = 0; j < cabbage; j++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                field[y][x] = 1;
            }

            for (int h = 0; h < height; h++){
                for (int w = 0; w < width; w++){
                    if(field[h][w] == 1 && !visited[h][w]) {
                        BFS(h, w);
                        count++;
                    }


                }
            }
            System.out.println(count);
        }
    }
}
