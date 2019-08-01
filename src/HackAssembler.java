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
            is = new FileReader("C:\\Users\\User\\SamShermanJava\\java-projects\\src\\Pong.asm");
            os = new FileWriter("Pong.hack");
            char temp = 'a';
            int charcode = 1;
            int line = 0;
            int openReg = 16;
            while (temp == '\n') {
                charcode = is.read();
                temp = (char) charcode;
            }
            while (charcode != -1) {
                // Adds all lines to arraylist
                list.add(new ArrayList<Character>());
                while (temp != '\n' && charcode != -1) {
                    // Adds characters to line
                    charcode = is.read();
                    if (charcode == -1) {

                    } else {

                        temp = (char) charcode;
                        list.get(line).add(temp);
                    }
                }
                line++;
                temp = ' ';
            }
            line = 0;
            for (int x = 0; x < list.size(); x++) {
                Boolean justRan = false;
                String tempVar = "";
                if (list.get(x).isEmpty() == true) {
                } else {
                    if (list.get(x).get(0) == '(') {
                        for (int y = 1; y < list.get(x).size() - 3; y++) {
                            tempVar += list.get(x).get(y);
                        }
                        if (justRan == true) {
                            map.put(tempVar, line);
                            list.remove(x--);
                        } else {
                            map.put(tempVar, line);
                            list.remove(x--);
                            justRan = true;

                        }
                    } else {
                        line++;
                    }
                }
            }
            line = 0;
            for (int run = 0; run < list.size(); run++) {
                line = run;
                // Adds line to list

                if (list.get(line).isEmpty() == true) {

                } else if (list.get(line).get(0) == '/') {

                } else {
                    if (list.get(line).get(0).equals('@')) {
                        // Specify A type instruction
                        String toAdd = "";
                        int intCheck = -1;
                        int rCheck = -1;
                        for (int x = 1; x < list.get(line).size() - 2; x++) {
                            toAdd += list.get(line).get(x);
                        }
                        if (toAdd.matches("\\d+")) {
                            intCheck = Integer.parseInt(toAdd);
                        }
                        if (toAdd.matches("R\\d+")) {
                            rCheck = Integer.parseInt(toAdd.substring(1));
                        }

                        if (map.containsKey(toAdd) == false && intCheck < 0 && !toAdd.startsWith("R")
                                && !toAdd.equals("SP") && !toAdd.equals("LCL") && !toAdd.equals("ARG")
                                && !toAdd.equals("THIS") && !toAdd.equals("THAT") && !toAdd.equals("SCREEN")
                                && !toAdd.equals("KBD")) {
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
                            if (intCheck != -1 && !toAdd.startsWith("R")) {
                                toWrite = (String) Integer.toBinaryString(intCheck);
                            } else if (toAdd.startsWith("R") && rCheck < 16 && rCheck > -1) {
                                toWrite = (String) Integer.toBinaryString(rCheck);
                            } else if (toAdd.equals("SP")) {
                                toWrite = (String) Integer.toBinaryString(0);
                            } else if (toAdd.equals("LCL")) {
                                toWrite = (String) Integer.toBinaryString(1);
                            } else if (toAdd.equals("ARG")) {
                                toWrite = (String) Integer.toBinaryString(2);
                            } else if (toAdd.equals("THIS")) {
                                toWrite = (String) Integer.toBinaryString(3);
                            } else if (toAdd.equals("THAT")) {
                                toWrite = (String) Integer.toBinaryString(4);
                            } else if (toAdd.equals("SCREEN")) {
                                toWrite = (String) Integer.toBinaryString(16384);
                            } else if (toAdd.equals("KBD")) {
                                toWrite = (String) Integer.toBinaryString(24576);
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
                            if (list.get(line).get(x) == '=') {
                                // Looks for '='
                                dest = true;
                            }
                            if (list.get(line).get(x) == ';') {
                                // Looks for ';'
                                jump = true;
                            }
                        }
                        int y = 0;
                        String calc = "";
                        String calcWrite = "";
                        int b1 = 0;
                        int b2 = 0;

                        while (y < list.get(line).size() && list.get(line).get(y) != '\r') {
                            calc += list.get(line).get(y);
                            y++;
                        }
                        if (dest == true && jump == false) {
                            b1 = calc.indexOf('=') + 1;
                            b2 = calc.length();
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
                            while (x < list.get(line).size() && list.get(line).get(x) != '\n') {
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