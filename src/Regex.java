import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String test = scan.nextLine();
        // () - And
        // [] - or
        // * - Any Amount of char
        // ? - 0 or 1
        // . - Any char
        // ! - not
        if(test.matches(".*@.*.com")){
            System.out.print("This string is an email address");
        }
        else{
            System.out.print("This string is not an email address");
        }
        
        scan.close();
    }
}