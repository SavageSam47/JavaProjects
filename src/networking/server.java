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
import java.util.ArrayList;
import java.util.Scanner;

public class server {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		ServerSocket s = null;
		ArrayList<Socket> clients = new ArrayList();
		
		
		
		
			s = new ServerSocket(25565);
			
		
		clientmanager manager = new clientmanager(clients, s);
		manager.start();
		while(true){
		manager.braodcast("hi");
		
		}
		
		
	}

}
