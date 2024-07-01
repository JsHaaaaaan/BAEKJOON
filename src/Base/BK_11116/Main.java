package Base.BK_11116;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); //테스트 케이스의 개수 n
        int[] arrleft = new int[200];
        int[] arrright = new int[200];
        for (int i = 0; i < n; i++){
            int car_num = 0;
            int m = scanner.nextInt(); // 박스에서 측정된 시간 기록 개수
            for (int l = 0; l < m; l++){
                arrleft[l] = scanner.nextInt();
            }
            for (int r = 0; r < m; r++){
                arrright[r] = scanner.nextInt();
            }

            for (int t = 0; t < m-1; t++){
                for (int j = t+1; j < m; j++){
                    if (arrleft[t] + 500 == arrleft[j]){ // 왼쪽에서 500차이 있는지 확인
                        for (int k = 0; k < m; k++){
                            if (arrleft[t] + 1000 == arrright[k]){
                                for (int g = k+1; g < m; g++){
                                    if (arrright[k] + 500 == arrright[g]){
                                        car_num++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(car_num);
        }


    }
}