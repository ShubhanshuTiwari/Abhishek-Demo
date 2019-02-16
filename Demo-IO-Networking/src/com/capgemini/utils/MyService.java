package com.capgemini.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyService {
	public static void main(String[] args) throws IOException {

		int port = 8088;
		ServerSocket service = new ServerSocket(port);

		System.out.println("Waiting for connection...");

		while (true) {
			Socket clientSocket = service.accept();
			System.out.println("Connection established: " + clientSocket);

			Runnable target = new MyJob(clientSocket);
			Thread t = new Thread(target);
			
			t.start();
			
		}
	}
}
class MyJob implements Runnable {

	private Socket clientSocket;

	public MyJob(Socket clientSocket) {
		this.clientSocket = clientSocket;
	}

	@Override
	public void run() {

		try{

/*			InputStream in = clientSocket.getInputStream();
			BufferedReader bReader = new BufferedReader(
						new InputStreamReader(in)
					);
			
			while(true){
				String message = bReader.readLine();
				if(message == null){
					break;
				}
				
				System.out.println(message);
				
			}
			
*/			
			OutputStream oStream = clientSocket.getOutputStream();	
			PrintWriter out = new PrintWriter(oStream,true);
			
			out.println("HTTP/1.0 200 OK");
			out.println();
			out.println("Hello, world!"+ clientSocket);
			out.flush();
			out.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}









