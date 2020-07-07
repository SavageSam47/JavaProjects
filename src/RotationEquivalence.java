import java.util.*;
import java.io.*;

public class RotationEquivalence {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("src/input.txt"));

        int iterations = Integer.parseInt(scanner.nextLine());

        for(int i=0;i<iterations;i++){
            boolean isEqual = false;
            String[] nums = scanner.nextLine().split(" ");

            if(nums.length<=1){
                System.out.println("YES");
                continue;
            }
            if(nums[0].length() != nums[1].length()){
                System.out.println("NO");
                continue;
            }

            if(nums[0].equals(nums[1])){
                System.out.println("YES");
                continue;
            }

            String temp = nums[0];
            for(int x=0;x<nums[0].length();x++){
                if(nums[1].equals(temp)){
                    System.out.println("YES");
                    isEqual=true;
                    break;
                }
                temp = rotate(temp);
            }

            if(isEqual){
                continue;
            }

            System.out.println("NO");


        }
    }

    private static String rotate(String s){
        return  s.charAt(s.length()-1) + s.substring(0,s.length()-1);
    }
}
