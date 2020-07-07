package CodingClubQuestions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Prob04 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("src/CodingClubQuestions/Prob04.txt"));
        int iterations = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < iterations; i++) {
            String [] s = scan.nextLine().split("|");
            List<Character> t1 = sortString(s[0]);
            List<Character> t2 = sortString(s[1]);
            boolean matches = true;
            for(int x = 0;x<t1.size();x++){
                if(t1.get(x) != t2.get(x)){
                    matches=false;
                }
            }
  //          if(matches)

        }
    }
    public static List<Character> sortString(String s){
        List<Character> t = convertStringToList(s);
        Collections.sort(t);
        return t;
    }
    public static List<Character> convertStringToList(String s){
        return convertArrayToList(s.toCharArray());
    }
    public static List<Character> convertArrayToList(char[] arr){
        List<Character> li = new ArrayList<>();
        for(char x: arr){
            li.add(x);
        }
        return li;
    }
}
