package CodingClubQuestions;
//TODO: Incomplete
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Prob15 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("src/CodingClubQuestions/Prob15.txt"));
        PrintWriter pw = new PrintWriter(new File("src/CodingClubQuestions/Prob15OUT.txt"));
        int cases = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < cases; i++) {
            int routes = Integer.parseInt(scan.nextLine());
            HashMap<String, String> travels = new HashMap<String, String>();
            for (int j = 0; j < routes; j++) {
                String[] temp = scan.nextLine().split(" ");
                travels.put(temp[0], temp[1]);
            }
            String first = "";
            for (String s : travels.keySet()) {
                if(!travels.containsKey(s)){
                    first = s;
                }
            }
        }
    }
}
