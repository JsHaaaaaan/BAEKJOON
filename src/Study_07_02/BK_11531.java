package Study_07_02;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BK_11531 {
    static int penalty = 0;
    static int solved = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> problem = new HashMap<>(); //문제 이름 - 틀린횟수

        while (true){
            String str = sc.nextLine();
            if (str.equals("-1")){
                break;
            }

            String[] line = str.split(" ");
            int time = Integer.parseInt(line[0]);
            String name = line[1];
            String result = line[2];
            if(!problem.containsKey(name)){
                problem.put(name, 0);
                if (result.equals("right")) {
                    penalty += time;
                    solved++;
                }else{
                    problem.put(name, problem.get(name) +1);
                }
            }else if(result.equals("wrong")){
                problem.put(name, problem.get(name) +1);
            }else {
                penalty += (time + problem.get(name) *20);
                solved++;
            }
        }
        System.out.println(solved + " " + penalty);
    }
}
