package Server_Route_Planner;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	// throws IOException wird vom ServerSocket ben�tigt - Fehlerhandling
	public static void main(String[] args) throws IOException {

		// Consolenmeldung Info an USER: Server wird gestartet
		System.out.println("starting server");

		/*
		 * Serversocket wird mit einem bestimmten Port ge�ffnet um
		 * Netzwerkanfrange anzunehmen  - Wichtig Expeption muss gesetzt werden
		 * wenn Fehler auftritt zb. Port belegt
		 */
		ServerSocket server = new ServerSocket(5001);

		// Consolenmeldung Info an USER: Warten auf clientverbindung
		System.out.println("waitng for client");

		// server.accept wartet auf client und verbindet mit server
		Socket client = server.accept();

		// Consolenmeldung Info an USER: Client hat sich verbunden
		System.out.println("got client");

		
		//nun muss eine Methode integriert werden um die eingaben ins programm zu transportieren
		//Mit der Methode B...R... (muss auch Instantziert werden) werden Eingaben gelesen mit Print Writer wieder ausgegeben
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(client.getInputStream()));
		
		PrintWriter writer = new PrintWriter(
				new OutputStreamWriter(client.getOutputStream()));
		
		
		//Jetzt muss der Server eine Funktion bekommen(Protokoll) wichtig ist eine Abbruchbedingung zb eingabe EXIT
		String command;
			//es wird eine schleife gestartet, da auf die Eingabe gewartet werden muss
		
		//Startmeldung in Konsole
		writer.println("Routen Planner wurde gestartet");
		//Men� wird angezigt
		writer.println("");
		writer.println("Menue");
		writer.println("");
		writer.println("-test");
		writer.println("-exit");
		writer.println(" ");
		writer.flush();
		
		do {
			command = reader.readLine();
			
			if (command.equals("test")) {
				writer.println("Hallo der Server hat das Kommando " + command + " erhalten!");
			}
			else{
				writer.println("Derzeit wird nur das Komando test verarbeitet!");
			}
			writer.flush();
		} while (!command.equals("exit"));
		
		
		
		
	}

}
