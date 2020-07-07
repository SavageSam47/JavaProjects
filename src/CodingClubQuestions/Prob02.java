package CodingClubQuestions;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prob02 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("src/CodingClubQuestions/Prob02.txt"));
        int cases = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < cases; i++) {
            String[] line = scan.nextLine().split(" ");
            double money = Double.parseDouble(line[line.length-1]);
            double outstanding = 0.0;
            for (int j = 1; j < line.length-1; j+=2) {
                outstanding+= Integer.parseInt(line[j]) * Double.parseDouble(line[j+1]);
            }
            if(outstanding>money){
                System.out.println("BOOMER NEEDS MORE MONEY");
            }
            else if(((int)(outstanding*100))/100.0==((int)(money*100))/100.0){
                System.out.println("BOOMER HAS THE EXACT AMOUNT HE NEEDS");
            }
            else if(outstanding<money){
                System.out.println("BOOMER HAS MORE THAN ENOUGH");
            }
        }
    }
}
