package Base.TEST;

import java.util.Scanner;
import java.util.stream.IntStream;

public class GuGuDan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
//        for (int k = 1; k < 10; k++){
//            System.out.println(N + " * " + k + " = " + N * k);
//        }
//        IntStream.rangeClosed(1, 9).forEach(j -> {
//            System.out.println(N + " * " + j + " = " + N*j);
//        });
        IntStream.rangeClosed(1, 9)
                .mapToObj(j -> N + " * " + j + " = " + N * j)
                .forEach(System.out::println);
    }
}
