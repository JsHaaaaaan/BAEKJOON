package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BK_1822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); //A 개수
        int b = Integer.parseInt(st.nextToken()); //B 개수
        int count = 0;

        int[] Aset = new int[a];
        st = new StringTokenizer(br.readLine());
        for (int i  = 0; i < a; i++){
            Aset[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(Aset);

        int[] Bset = new int[b];
        st = new StringTokenizer(br.readLine());
        for (int i  = 0; i < b; i++){
            Bset[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(Bset);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a; i++){
            if (BinarySearch(Bset, b, Aset[i]) != 0){
                sb.append(Aset[i]).append(" ");
                count++;
            }
        }
        System.out.println(count);
        if (count != 0) {
            System.out.println(sb.toString().trim());
        }
    }

    public static int BinarySearch(int[] Bset, int b, int search){
        int start = 0;
        int end = b -1;
        int mid = 0;

        while (start <= end){
            mid = (start + end) / 2;
            if (Bset[mid] == search){
                return 0;
            }else {
                if (Bset[mid] < search) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return search;
    }
}
