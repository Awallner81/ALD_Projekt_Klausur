package Server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.logging.Handler;

public class Server {

	
	public static ArrayList<PrintWriter> writer = new ArrayList<PrintWriter>(); 
	
	public static void main(String[] args) throws  IOException	{
		
		ServerSocket server=null;
		Socket client=null;
		
	try {
		
		server =new ServerSocket(5555);
		server.setSoTimeout(50000);
		System.out.println("Server wurde gestartet");
		
		while (true)
		{
			client = new Socket();
			client = server.accept();
			System.out.println("Client wurde verbunden");
			Thread tr = new Thread(new Handler(client);
			tr.start();
		}
		
	} catch (SocketException e){

		
	}
	finally{
		
		try {
			server.close();
			client.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
		throw new DataFileException("Server konnte nicht beendet werden", e);
		}
}
