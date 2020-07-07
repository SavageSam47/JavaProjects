import java.io.*;
import java.util.Scanner;

public class MonogramProblem {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("src/Prob01.in.txt"));
        int cases = Integer.parseInt(scan.nextLine());
        for(int x=0;x<cases;x++){
            int iterations = Integer.parseInt(scan.nextLine());
            for(int y=0;y<iterations;y++){
                String[] work = scan.nextLine().split(" ");
                String build = "";
                for(String s : work){
                    build += s.charAt(0);
                }
                System.out.println(build.toUpperCase());
            }
        }
    }
}
