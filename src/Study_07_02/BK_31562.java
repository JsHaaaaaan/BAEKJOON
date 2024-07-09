package Study_07_02;


import java.util.*;

public class BK_31562 {
    static int N; //정환이 음을 아는 노래 개수
    static int M; //정환이 맞히기를 시도할 노래의 개수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        Map<String, String> list = new HashMap<>();

        for (int i=0; i < N; i++){
            int Length = sc.nextInt();
            String title = sc.next();
            String three = sc.nextLine().replaceAll("\\s+", "").substring(0, 3);
            if(list.containsKey(three)) {
                list.put(three, "?");
            }else {
                list.put(three, title);
            }
        }

        for (int i=0; i < M; i++){
            String find = sc.nextLine().replaceAll("\\s+", "");
            if(list.containsKey(find)){
                System.out.println(list.get(find));
            }else {
                System.out.println("!");
            }
        }
    }
}
