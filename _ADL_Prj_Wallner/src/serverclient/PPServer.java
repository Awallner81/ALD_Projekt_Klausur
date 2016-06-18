package serverclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class PPServer {

	public static void main(String[] args) throws IOException {

		
		
		System.out.println("starting server");
		
		ServerSocket server = new ServerSocket(1111);
		System.out.println("waiting for client");
		Socket client = server.accept();
		
		System.out.println("got client");
		
		
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(client.getInputStream()));
		
		PrintWriter writer = new PrintWriter(
				new OutputStreamWriter(client.getOutputStream()));
		
		// Hier beginnt unser Protokoll "ping"/"pong"
		String command;
		do
		{
			command = reader.readLine();
			if (command.equals("ping"))
			{
				writer.println("pong vom server");
			}
			else if (command.equals("pong"))
			{
				writer.println("ping vom server");
			}
			else if (command.equals("bye"))
			{
				writer.println("bye vom server");
			}
			else
			{
				writer.println("bitte nur ping oder pong");
			}
			writer.flush();
		} while(!command.equals("bye"));
		
		writer.close();
		reader.close();
		System.out.println("closing server");

	}

}
