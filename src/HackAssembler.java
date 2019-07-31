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
            is = new FileReader("C:\\Users\\User\\SamShermanJava\\java-projects\\src\\Max.asm");
            os = new FileWriter("Max.hack");
            char temp = 'a';
            int charcode = 1;
            int line = 0;
            int openReg = 16;
            while (temp == '\n') {
                charcode = is.read();
                temp = (char) charcode;
            }
            while (charcode != -1) {
                // Adds line to list
                list.add(new ArrayList<Character>());
                while (temp != '\n' && charcode != -1) {
                    // Adds characters to line
                    charcode = is.read();
                    temp = (char) charcode;
                    if (charcode == 40) {
                        list.get(line).add('@');
                    } else {
                        list.get(line).add(temp);
                    }
                }
                temp = ' ';
                if (list.get(line).isEmpty() == true) {

                } else if (list.get(line).get(0) == '/') {

                } else {

                    if (list.get(line).get(0).equals('@')) {
                        // Specify A type instruction
                        String toAdd = "";
                        int toCheck = 0;
                        for (int x = 1; x < list.get(line).size() - 2; x++) {
                            toAdd += list.get(line).get(x);
                        }
                        if (toAdd.matches("\\d+")) {
                            toCheck = Integer.parseInt(toAdd);
                        }

                        if (map.containsKey(toAdd) == false && toCheck > 15 && !toAdd.startsWith("R")) {
                            // Make variable if it doesnt exist
                            map.put(toAdd, openReg);
                            String toWrite = (String) Integer.toBinaryString(openReg);
                            String zeroWrite = "";
                            for (int x = 0; x < 15 - toWrite.length(); x++) {
                                zeroWrite += "0";
                            }
                            os.write('0' + zeroWrite + toWrite + '\n');
                            openReg++;
                        } else {
                            String toWrite = "";
                            if (toCheck != 0) {
                                toWrite = (String) Integer.toBinaryString(toCheck);
                            } else if (toAdd.startsWith("R")) {
                                int rAdd = Integer.parseInt(toAdd.substring(1));
                                toWrite = (String) Integer.toBinaryString(rAdd);
                            } else {
                                // Calls variable that exists
                                toWrite = (String) Integer.toBinaryString(map.get(toAdd));
                            }
                            String zeroWrite = "";
                            for (int x = 0; x < 15 - toWrite.length(); x++) {
                                zeroWrite += "0";
                            }
                            os.write('0' + zeroWrite + toWrite + '\n');
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
                        Boolean a = false;
                        for (int x = 0; x < list.get(line).size(); x++) {
                            if (list.get(line).get(x).equals('=')) {
                                // Looks for '='
                                dest = true;
                            }
                            if (list.get(line).get(x).equals(';')) {
                                // Looks for ';'
                                jump = true;
                            }
                        }
                        int y = 0;
                        String calc = "";
                        String calcWrite = "";
                        int b1 = 0;
                        int b2 = 0;

                        while (list.get(line).get(y) != '\n') {
                            calc += list.get(line).get(y);
                            y++;
                        }
                        if (dest == true && jump == false) {
                            b1 = calc.indexOf('=');
                            b2 = calc.length() - 1;
                        }
                        if (dest == false && jump == true) {
                            b1 = 0;
                            b2 = calc.indexOf(';');
                        }
                        String calcUse = calc.substring(b1, b2);
                        if (calcUse.contains("0")) {
                            calcWrite = "101010";
                            a = false;
                        }
                        if (calcUse.contains("1")) {
                            calcWrite = "111111";
                            a = false;
                        }
                        if (calcUse.contains("-1")) {
                            calcWrite = "111010";
                            a = false;
                        }
                        if (calcUse.contains("D")) {
                            calcWrite = "001100";
                            a = false;
                        }
                        if (calcUse.contains("A")) {
                            calcWrite = "110000";
                            a = false;
                        }
                        if (calcUse.contains("!D")) {
                            calcWrite = "001101";
                            a = false;
                        }
                        if (calcUse.contains("!A")) {
                            calcWrite = "110001";
                            a = false;
                        }
                        if (calcUse.contains("-D")) {
                            calcWrite = "001111";
                            a = false;
                        }
                        if (calcUse.contains("-A")) {
                            calcWrite = "110011";
                            a = false;
                        }
                        if (calcUse.contains("D+1")) {
                            calcWrite = "011111";
                            a = false;
                        }
                        if (calcUse.contains("A+1")) {
                            calcWrite = "110111";
                            a = false;
                        }
                        if (calcUse.contains("D-1")) {
                            calcWrite = "001110";
                            a = false;
                        }
                        if (calcUse.contains("A-1")) {
                            calcWrite = "110010";
                            a = false;
                        }
                        if (calcUse.contains("D+A")) {
                            calcWrite = "000010";
                            a = false;
                        }
                        if (calcUse.contains("D-A")) {
                            calcWrite = "010011";
                            a = false;
                        }
                        if (calcUse.contains("A-D")) {
                            calcWrite = "000111";
                            a = false;
                        }
                        if (calcUse.contains("D&A")) {
                            calcWrite = "000000";
                            a = false;
                        }
                        if (calcUse.contains("D|A")) {
                            calcWrite = "010101";
                            a = false;
                        }
                        if (calcUse.contains("M")) {
                            calcWrite = "110000";
                            a = true;
                        }
                        if (calcUse.contains("!M")) {
                            calcWrite = "110001";
                            a = true;
                        }
                        if (calcUse.contains("-M")) {
                            calcWrite = "110011";
                            a = true;
                        }
                        if (calcUse.contains("M+1")) {
                            calcWrite = "110111";
                            a = true;
                        }
                        if (calcUse.contains("M-1")) {
                            calcWrite = "110010";
                            a = true;
                        }
                        if (calcUse.contains("D+M")) {
                            calcWrite = "000010";
                            a = true;
                        }
                        if (calcUse.contains("D-M")) {
                            calcWrite = "010011";
                            a = true;
                        }
                        if (calcUse.contains("M-D")) {
                            calcWrite = "000111";
                            a = true;
                        }
                        if (calcUse.contains("D&M")) {
                            calcWrite = "000000";
                            a = true;
                        }
                        if (calcUse.contains("D|M")) {
                            calcWrite = "010101";
                            a = true;
                        }

                        if (dest == true) {
                            // Is dest section active?
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
                                d1 = true;
                            }
                        }
                        if (jump == true) {
                            // Is the code jumping?
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
                            if (jumpop.contains("JNE")) {
                                j1 = true;
                                j3 = true;
                            }
                            if (jumpop.contains("JLE")) {
                                j1 = true;
                                j2 = true;
                            }
                            if (jumpop.contains("JMP")) {
                                j1 = true;
                                j2 = true;
                                j3 = true;
                            }
                        }

                        String jumpWrite = "";
                        if (j1 == true) {
                            jumpWrite += '1';
                        } else {
                            jumpWrite += '0';
                        }
                        if (j2 == true) {
                            jumpWrite += '1';
                        } else {
                            jumpWrite += '0';
                        }
                        if (j3 == true) {
                            jumpWrite += '1';
                        } else {
                            jumpWrite += '0';
                        }
                        String destWrite = "";
                        if (d1 == true) {
                            destWrite += '1';
                        } else {
                            destWrite += '0';
                        }
                        if (d2 == true) {
                            destWrite += '1';
                        } else {
                            destWrite += '0';
                        }
                        if (d3 == true) {
                            destWrite += '1';
                        } else {
                            destWrite += '0';
                        }
                        if (a == false) {
                            os.write("111" + '0' + calcWrite + destWrite + jumpWrite + '\n');
                        }
                        if (a == true) {
                            os.write("111" + '1' + calcWrite + destWrite + jumpWrite + '\n');
                        }
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