package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BK_17144 {

    static int R, C, T;
    static int[][] room;
    static int[] aircleaner;
    static int[][] direction = {{0, -1}, {-1, 0}, {0, 1}, {1, 0}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        room = new int[R][C];
        aircleaner = new int[2];
        int cleanindex = 0;

        for (int i = 0; i < R; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < C; j++) {
                room[i][j] = Integer.parseInt(st.nextToken());
                if (room[i][j] == -1) {
                    aircleaner[cleanindex++] = i;
                }
            }
        }

        for (int i = 0; i < T; i++) {
            spread();
            move();
        }

        int result = 0;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (room[i][j] > 0){
                    result += room[i][j];
                }
            }
        }
        System.out.println(result);
    }

    public static void spread() {
        int[][] spreadroom = new int[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                spreadroom[i][j] = room[i][j];
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (room[i][j] > 0) {
                    int spreaddust = room[i][j] / 5;
                    int spreadcount = 0;

                    for (int[] d : direction) {
                        int row = i + d[0];
                        int col = j + d[1];

                        if (row >= 0 && row < R && col >= 0 && col < C && room[row][col] != -1) {
                            spreadroom[row][col] += spreaddust;
                            spreadcount++;
                        }
                    }
                    spreadroom[i][j] -= spreaddust * spreadcount;
                }
            }
        }
        room = spreadroom;
    }

    public static void move(){
        int top = aircleaner[0];
        int bottom = aircleaner[1];
        //위쪽
        for (int i = top -1; i > 0; i--) { //아래로
            room[i][0] = room[i - 1][0];
        }
        for (int i = 0; i < C-1; i++) { //왼쪽으로
            room[0][i] = room[0][i+1];
        }
        for (int i = 0; i < top; i++) { //위로
            room[i][C-1] = room[i+1][C-1];
        }
        for (int i = C-1; i > 1; i--) { //오른쪽으로
            room[top][i] = room[top][i-1];
        }
        room[top][1] = 0;

        //아래쪽
        for (int i = bottom + 1; i < R - 1; i++) { //위로
            room[i][0] = room[i+1][0];
        }
        for (int i = 0; i < C-1; i++) { //왼쪽으로
            room[R-1][i] = room[R-1][i+1];
        }
        for (int i = R -1; i > bottom; i--) { //아래로
            room[i][C-1] = room[i-1][C-1];
        }
        for (int i = C-1; i > 1; i--) { //오른쪽으로
            room[bottom][i] = room[bottom][i-1];
        }
        room[bottom][1] = 0;
    }
}
