import java.io.File;
import java.util.Scanner;

public class GrainsOfSandProblem {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("src/Prob02.in.txt"));
        int cases = Integer.parseInt(scan.nextLine());
        for(int x=0;x<cases;x++){
            int runs = Integer.parseInt(scan.nextLine());
            int build = 0;
            for(int y=0;y<runs;y++){
                build += Integer.parseInt(scan.nextLine());
            }
            System.out.println(build);
        }
    }
}
