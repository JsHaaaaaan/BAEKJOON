package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BK_2573 {

    static int N,M;
    static int[][] seamap;
    static boolean[][] visited;
    static int[][] pos = {{0,-1}, {0,1}, {1,0}, {-1,0}}; //위아래 체크용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        seamap = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                seamap[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int year = 0;

        while (true){
            int count = counticeberg();
            //다 녹을때까지 두덩이가 안되면
            if (count == 0){
                System.out.println(0);
                break;
            }
            if (count >= 2){
                System.out.println(year);
                break;
            }
            melting();
            year++;
        }


    }

    public static void melting(){
        int[][] temp = new int[N][M];

        // 빙산이 녹는 과정
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (seamap[i][j] > 0) {
                    int countsea = 0;
                    for (int[] p : pos) {
                        int nx = i + p[0];
                        int ny = j + p[1];
                        if (nx >= 0 && nx < N && ny >= 0 && ny < M && seamap[nx][ny] == 0) {
                            countsea++;
                        }
                    }
                    temp[i][j] = Math.max(0, seamap[i][j] - countsea);
                }
            }
        }
        seamap = temp;
    }

    public static void BFS(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        visited[x][y] = true;
        while (!queue.isEmpty()){
            int[] now = queue.poll();

            for (int[] p : pos){
                int nx = now[0] + p[0];
                int ny = now[1] + p[1];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M && seamap[nx][ny] > 0 && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx,ny});
                }
            }
        }


    }

    public static int counticeberg(){
        visited = new boolean[N][M];
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (seamap[i][j] > 0 && !visited[i][j]){
                    BFS(i,j);
                    count++;
                }
            }
        }
        return count;
    }
}
