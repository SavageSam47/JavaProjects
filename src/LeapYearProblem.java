import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeapYearProblem {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("src/Prob03.in.txt"));
        int cases = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < cases; i++) {
            int lines = Integer.parseInt(scan.nextLine());

            for (int j = 0; j < lines; j++) {
                int year = Integer.parseInt(scan.nextLine());
                if(year<1582){
                    System.out.println("NO");
                    continue;
                }
                if(year%4!=0){
                    System.out.println("NO");
                    continue;
                }
                if(year%100!=0){
                    System.out.println("YES");
                    continue;
                }
                if(year%400!=0){
                    System.out.println("NO");
                    continue;
                }

                System.out.println("YES");
            }
        }
    }
}
