package networking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Vector;

public class clientmanager extends Thread{

	boolean acceptingclients = true;
	Vector<Socket> clientlist;
	ServerSocket s;
	
	public clientmanager(Vector<Socket> clientlist, ServerSocket s){
		
		this.clientlist = clientlist;
		this.s = s;
		
		clientlist = new Vector();
		
		
		
	}
	public void run(){
		while (acceptingclients == true){
			Socket n = null;
			try {
				n = s.accept();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Got Client" + n);
			clientlist.add(n);
			
		}
	}
	public synchronized void braodcast(String message) throws IOException{
		for (int i = 0; i<clientlist.size(); i++){
			System.out.println("testststst");
			BufferedWriter n = new BufferedWriter(new OutputStreamWriter(clientlist.get(i).getOutputStream()));
			n.write(message);
			n.newLine();
			n.flush();
		}
	}
	
}
