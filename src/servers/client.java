package servers;

import java.net.*;
import java.io.*;

public class client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 28015);
            BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter printer = new PrintWriter(s.getOutputStream());
            System.out.println(reader.readLine());
            s.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();

        }
    }
}