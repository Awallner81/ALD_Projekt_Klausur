package serverclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class PPClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		System.out.println("starting client");
		Socket socket = new Socket("127.0.0.1", 1111);
		
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		BufferedReader readerConsole = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader readerNetwork = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		String inputline;
		do
		{
			inputline = readerConsole.readLine();
			writer.println(inputline);
			writer.flush();
			
			System.out.println(readerNetwork.readLine());
			
		} while (!inputline.equals("bye"));
		
		
		
		readerNetwork.close();
		readerConsole.close();
		writer.close();
		System.out.println("closing client");
	}

}
