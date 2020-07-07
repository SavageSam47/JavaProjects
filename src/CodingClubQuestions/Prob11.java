package CodingClubQuestions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Prob11 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("src/CodingClubQuestions/Prob11.txt"));
        PrintWriter pw = new PrintWriter(new File("src/CodingClubQuestions/Prob11OUT.txt"));
        int cases = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < cases; i++) {
            int bytes = Integer.parseInt(scan.nextLine());

            for(int x=0;x<Math.pow(2, bytes);x++) {
                String base = Integer.toBinaryString(x);
                for(int y=base.length();y<bytes;y++){
                    base = "0" + base;
                }
                pw.println(base);
            }
            pw.println();
        }
        pw.close();
    }
}
