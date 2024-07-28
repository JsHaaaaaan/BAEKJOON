package BruteForce;

import java.util.Scanner;

//이동하고자하는 채널과 가장 가까운 채널로 이동후 창지만큰 위아래 이동
public class BK_1107 {
    static boolean[] brokenbutoon = new boolean[10];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //이동하고자하는 채널
        int M = sc.nextInt(); //고장난 숫자 버튼의 개수

        for (int i = 0; i < M; i++) {
            int number = sc.nextInt();
            brokenbutoon[number] = true;
        }
        int Min = Math.abs(N - 100); //위아래 버튼으로만 이동하는 경우

        for (int i = 0; i < 999999; i++) {
            int press = oneQ(i);
            //눌러서 이동한 경우
            if(press > 0){
                int totalpress = Math.abs(N - i) + press;
                if (totalpress < Min){
                    Min = totalpress;
                }
            }
        }
        System.out.println(Min);
    }
    
    
    //숫자버트을 통하여 갈수있는 채널의 수를 구하고 버튼누른 횟수 반환
    public static int oneQ(int channel){
        int press = 0;

        if (channel == 0){
            if (brokenbutoon[0]){
                return 0;
            }else {
                return 1;
            }
        }

        while (channel > 0){
            //1의 자리가 고장나면 불가능
            if (brokenbutoon[channel % 10]){
                return 0;
            }
            //1의 자리가 되면 그 다음 확인
            channel /= 10;
            press++;
        }
        return press;
    }
    
}
