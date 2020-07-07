package CodingClubQuestions;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prob01 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("src/CodingClubQuestions/Prob01.txt"));
        int cases = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < cases; i++) {
            String[] test = scan.nextLine().split(" ");
            int intervals = Integer.parseInt(test[0]);
            int highest = 0;
            int current = 0;
            int totalClimb = 0;
            for (int j = 1; j < intervals + 1; j++) {
                int movement = Integer.parseInt(test[j]);
                if(movement>0){
                    totalClimb+=movement;
                }

                if(current+movement<0){
                    current = 0;
                }
                else{
                    current += movement;
                }

                if(current>highest){
                    highest = current;
                }
            }
            System.out.println(highest + " " + current + " " + totalClimb);
        }
    }
}
