package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.concurrent.PriorityBlockingQueue;

public class messageReciever extends Thread{

	Socket s;
	PriorityBlockingQueue<String> incoming;
	BufferedReader reader;
	
	public messageReciever(Socket s) throws IOException{
		this.s = s;
		reader =  new BufferedReader(new InputStreamReader(s.getInputStream()));
		incoming = new PriorityBlockingQueue<String>();
		this.start();
	}
	
	public void run () {
		System.out.println("test");
		try{
			String msg = reader.readLine();
			incoming.add(msg);
			System.out.println("I got a message: " + msg); 
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getMsg (){
		return incoming.poll();
	}
	
}
