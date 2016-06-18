package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;


public class Handler implements Runnable  {

	public Handler() {
		// TODO Auto-generated constructor stub
	}

	Socket client;
		
	public Handler(Socket client) {
		
		this.client = client;
	}

	String line;
	
	@Override
	public void run() {

		BufferedReader br ;
		PrintWriter pr;
		try {
			
			
			br = new BufferedReader(new InputStreamReader(System.in));
			pr = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));
			
			Server.writer.add(pr);
			
			while ((line = br.readLine()) !=null)
			
			{
				  
				if( line.startsWith("GET ")){
					
					UrlaubManager umanger = new UrlaubManager();
					try {
						umanger.load("wallner");
					} catch (DataFileException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
				}
				else if( line.startsWith("EXIT"))
				break;
			
				}

		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			try {
				throw new DataFileException("Fehler", e);
			} catch (DataFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		
	}

	
		
}
