package BFS;


import java.util.*;

public class BK_1926 {
    static int width, height; //도화지 가로, 세로 길이
    static int[][] paper; //도화지
    static boolean[][] visited; //다녀간 좌표인지 확인
    static int count= 0; //그림개수
    static int[][] pos = {{0,-1}, {0,1}, {1,0}, {-1,0}}; //위아래 체크용

    static void BFS(int x, int y){
        visited[x][y] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()){
            int[] arr = queue.poll();
            int nowX = arr[0];
            int nowY = arr[1];

            for (int i = 0; i < pos.length; i++){
                int nx = nowX + pos[i][0];
                int ny = nowY + pos[i][1];

                if (nx >= 0 && nx < height && ny >= 0 && ny < width && paper[nx][ny] == 1 && !visited[nx][ny]){
                    count++;
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx,ny});
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        height = scanner.nextInt();
        width = scanner.nextInt();
        boolean zero = true; //0 확인
        List<Integer> answer = new ArrayList<>();

        paper = new int[height][width];
        visited = new boolean[height][width];

        for(int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                paper[i][j] = scanner.nextInt();
                if(paper[i][j] == 1){
                    zero = false; //1있으면 zero값 false
                }
            }
        }
        //1이 하나도 없을때
        if(zero){
            System.out.println(0);
            System.out.println(0);
            return;
        }

        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                count= 0;
                if(paper[i][j] == 1 && !visited[i][j]){
                    count++;
                    BFS(i, j);
                    answer.add(count);
                }
            }
        }

        Collections.sort(answer);
        System.out.println(answer.size());
        System.out.println(answer.get(answer.size() - 1));


    }
}