import java.util.*;
import java.io.*;
import java.util.HashMap;

public class HackAssembler {
    public static void main(String[] args) throws IOException {
        FileReader is = null;
        FileWriter os = null;
        ArrayList<ArrayList<Character>> list = new ArrayList<ArrayList<Character>>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        try {
            is = new FileReader("input.asm");
            os = new FileWriter("output.hack");
            char temp = 'a';
            int charcode = 1;
            int line = 0;
            int openReg = 16;
            while (charcode != -1) {
                // Adds line to list
                list.add(new ArrayList<Character>());
                while (temp != '\n') {
                    // Adds characters to line
                    charcode = is.read();
                    temp = (char) charcode;
                    list.get(line).add(temp);
                }
                if (list.get(line).get(0).equals('@')) {
                    // Specify A type instruction
                    String toAdd = "";
                    for (int x = 1; x < list.get(line).size() - 1; x++) {
                        toAdd += list.get(line).get(x);
                    }
                    if (map.containsKey(toAdd) == false) {
                        // Make variable if it doesnt exist
                        map.put(toAdd, openReg);
                        String toWrite = (String) Integer.toBinaryString(openReg);
                        toWrite = toWrite.substring(0, 15);
                        os.write(0 + toWrite + '\n');
                        openReg++;
                    } else {
                        // Calls variable that exists
                        String toWrite = (String) Integer.toBinaryString(map.get(toAdd));
                        toWrite = toWrite.substring(0, 15);
                        os.write(0 + toWrite + '\n');
                    }
                    // TODO: Allow use of premade variables
                } else if (list.get(line).get(0).equals('(')) {
                    // Declare Flag
                    String toAdd = "";
                    for (int x = 1; x < list.get(line).size() - 2; x++) {
                        toAdd += list.get(line).get(x);
                    }
                    map.put(toAdd, line + 1);
                } else {
                    // Specify C type instruction
                    Boolean dest = false;
                    Boolean jump = false;
                    Boolean d1 = false;
                    Boolean d2 = false;
                    Boolean d3 = false;
                    Boolean j1 = false;
                    Boolean j2 = false;
                    Boolean j3 = false;
                    for (int x = 0; x < list.get(line).get(x); x++) {
                        if (list.get(line).get(x).equals('=')) {
                            // Looks for '='
                            dest = true;
                        }
                        if (list.get(line).get(x).equals(';')) {
                            // Looks for ';'
                            jump = true;
                        }
                    }
                    if (dest == true) {
                        // TODO:Is dest section active?
                        int x = 0;
                        String operation = "";
                        while (list.get(line).get(x) != '=') {
                            operation += list.get(line).get(x);
                            x++;
                        }
                        if (operation.contains("M")) {
                            d3 = true;
                        }
                        if (operation.contains("D")) {
                            d2 = true;
                        }
                        if (operation.contains("A")) {
                            d3 = true;
                        }
                    }
                    if (jump == true) {
                        // TODO:Is the code jumping?
                        int x = 0;
                        String jumpop = "";
                        while (list.get(line).get(x) != ';') {
                            x++;
                        }
                        x++;
                        while (list.get(line).get(x) != '\n') {
                            jumpop += list.get(line).get(x);
                            x++;
                        }
                        if (jumpop.contains("JGT")) {
                            j3 = true;
                        }
                        if (jumpop.contains("JEQ")) {
                            j2 = true;
                        }
                        if (jumpop.contains("JGE")) {
                            j2 = true;
                            j3 = true;
                        }
                        if (jumpop.contains("JLT")) {
                            j1 = true;
                        }
                        // TODO: Finish jump if statements!
                    }
                }
                line++;
            }
        } finally {
            if (is != null) {
                is.close();
            }
            if (os != null) {
                os.close();
            }
        }

    }
}