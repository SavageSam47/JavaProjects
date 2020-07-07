package CodingClubQuestions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prob05 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("src/CodingClubQuestions/Prob05.txt"));
        int iterations = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < iterations; i++) {
            double d = Double.parseDouble(scan.nextLine().substring(1));
            System.out.println("Total of the bill: " + d);
            System.out.println("15% = " + (d*0.15));
            System.out.println("18% = " + (d*0.18));
            System.out.println("20% = " + (d*0.20));

        }
    }
}
