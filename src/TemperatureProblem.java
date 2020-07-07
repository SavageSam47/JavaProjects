import java.io.File;
import java.util.Scanner;

public class TemperatureProblem {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("src/Prob04.in.txt"));
        int cases = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < cases; i++) {
            int lines = Integer.parseInt(scan.nextLine());
            for (int j = 0; j < lines; j++) {
                String[] raw = scan.nextLine().split(" ");
                String character = raw[1];
                double number = Double.parseDouble(raw[0]);
                if(character.equals("C")){
                    double newN = number;
                    newN *= (1.8);
                    newN += 32;
                    System.out.println(number + " " + character + " = " + newN + " F");
                }
                if(character.equals("F")){
                    double newN = number;
                    newN -=32;
                    newN *= (5.0/9);
                    System.out.println(number + " " + character + " = " + newN + " C");
                }

            }
        }
    }
}
