package BK_25601;

import org.w3c.dom.Node;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 클래스 개수
         for (int i = 1; i < N; i++){
             String A = scanner.nextLine();
             String B = scanner.nextLine();

         }

         class Node{
             String name;
             Node child;

             public Node(String name){
                 this.name = name;
                 child = null;
             }
         }


    }
}
