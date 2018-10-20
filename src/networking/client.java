package networking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;


public class client {

	
	
	public static void main(String[] args) {
		Socket s = null;
		Scanner scan = new Scanner(System.in);
		
	try {
		
		s = new Socket("127.0.0.1",25565);
		messageReciever r = new messageReciever(s);
		messageSender ms = new messageSender(s);
		while (s.isConnected()){
		
			ms.send(scan.nextLine());
			
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	
	}
	

}
