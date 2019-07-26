import java.util.*;
import java.io.*;

public class HackAssembler {

    public static void main(String[] args) throws IOException {
        FileReader is = null;
        FileWriter os = null;
        ArrayList<ArrayList<Character>> list = new ArrayList<ArrayList<Character>>();
        try {
            is = new FileReader("input.asm");
            os = new FileWriter("output.hack");
            char temp = 'a';
            while(temp!='\n'){
                int charcode = is.read();
                temp = (char) charcode;
                list.add(temp);
            }
        } finally {
            // TODO: handle exception
            if (is != null) {
                is.close();
            }
            if (os != null) {
                os.close();
            }
        }

    }
}