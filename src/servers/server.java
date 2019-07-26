
import java.net.*;
import java.io.*;

public class server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(28015);
            Socket client = ss.accept();
            BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter printer = new PrintWriter(client.getOutputStream());
            printer.write("hello\n");
            printer.flush();
            ss.close();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}