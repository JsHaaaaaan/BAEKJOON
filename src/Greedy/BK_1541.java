package Greedy;

import java.util.Scanner;

public class BK_1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] spline = line.split("-");

        int result = 0;
        boolean isFirst = true;
        for (int i = 0; i < spline.length; i++){
            int tmpresult = 0;
             if (spline[i].contains("+")){
                 String[] tmp = spline[i].split("\\+");
                 for (int j = 0; j < tmp.length; j++) {
                     tmpresult += Integer.parseInt(tmp[j]);
                 }
             }else {
                 tmpresult = Integer.parseInt(spline[i]);
             }
            if (isFirst){
                result = tmpresult;
                isFirst = false;
            }else{
                result -= tmpresult;
            }
        }
        System.out.println(result);
    }
}
