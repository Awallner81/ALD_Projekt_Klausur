package Server_Route_Planner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class InputDataFR {
	/**
	 * Ließt ein Textfile und liefert dessen Inhalt
	 * als String retour.
	 * 
	 * WICHTIG: Ignorieren Sie den Inhalt dieser Methode.
	 * Sie müssen noch nicht verstehen, wie sie funktioniert.
	 * Sie müssen Sie lediglich aufrufen können!!
	 * 
	 * @param fileName Dateiname
	 * @return Dateiinhalt
	 */
	public static String readFile(String fileName) {
		FileInputStream fis = null;
		InputStreamReader sr = null;
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		
		try {
			try {
				fis = new FileInputStream(fileName);
				sr = new InputStreamReader(fis);
				br = new BufferedReader(sr);
				
				String line;
				
				while ( (line = br.readLine()) != null) {
					sb.append(line + "\n");
				}
				return sb.toString();
			}
			finally {
				if (br != null) br.close();
				if (sr != null) sr.close();
				if (fis != null) fis.close();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
