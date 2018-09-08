package networking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.*;
import java.util.Scanner;

public class server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServerSocket s;
		Socket f = null;
		BufferedReader k = null;
		BufferedWriter j = null;
		Scanner scan = new Scanner(System.in);
		
		
		
		try {
			s = new ServerSocket(25565);
			f = s.accept();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			j = new BufferedWriter(new OutputStreamWriter(f.getOutputStream()));
			k = new BufferedReader(new InputStreamReader(f.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			String in;
			while (f.isConnected()){
				if ((in = k.readLine())!=null){
					System.out.println(in);
					
				}
				String input = scan.nextLine();
				j.write(input);
				j.newLine();
				j.flush();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
