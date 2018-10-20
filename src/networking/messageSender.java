package networking;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.PriorityBlockingQueue;

public class messageSender extends Thread {

	Socket s;
	PriorityBlockingQueue<String> toBeSent;

	public messageSender (Socket s){
		this.s=s;
		toBeSent = new PriorityBlockingQueue<String>();
		this.start();
	}

	public void run (){
		if (toBeSent.size() >0){
			String msg = toBeSent.poll();

			try {
				PrintWriter writer = new PrintWriter(s.getOutputStream());
				writer.println(msg);
				System.out.println("test");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}


	public void send (String msg){
		toBeSent.add(msg);
	}
}
