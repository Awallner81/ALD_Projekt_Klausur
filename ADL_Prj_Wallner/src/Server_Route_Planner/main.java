package Server_Route_Planner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.util.StringTokenizer;

public class main {

	public static void main(String[] args) {
		
		
		Date date1 = new Date(0);
		InputDataFR myFileReader = new InputDataFR();
		
		String test= myFileReader.readFile("c:/fh/orte.txt");

		System.out.println(test);

		//Orte als Opjekte in den Speicher laden
		
		Orte meineOrteListe1 = new Orte(1, "Testorte1");
		Orte meineOrteListe2 = new Orte(2, "Testorte2");
		Orte meineOrteListe3 = new Orte(3, "Testorte3");
		Orte meineOrteListe4 = new Orte(4, "Testorte4");
		
		//System.out.println(meineOrteListe1.getName());
		//System.out.println(meineOrteListe1.getId());
		
		
		
		String fileName = "sampledata1.csv";
        try {
            BufferedReader br = new BufferedReader( new FileReader("c:/fh/orte.txt"));
            String strLine = null;
            StringTokenizer st = null;
            int lineNumber = 0, tokenNumber = 0;

            while((fileName = br.readLine()) != null) {
                lineNumber++;
                String[] result = fileName.split(",");
               //for (int x=0; x<result.length; x++) {
               //    System.out.println(result[x]);
                //}
            }
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

      
        BinarySearchTree meinBST = new BinarySearchTree();
        Orte o1 = new Orte(0, "GRAZ");
        Orte o2 = new Orte(1, "Wien");
        Orte o3= new Orte(2, "Linz");
               
        
        meinBST.insert(o1);
        meinBST.insert(o2);
        meinBST.insert(o2);
        
        System.out.println("Suche Wien");
        Orte Ergebnis = meinBST.findExact("Wien");
        
        System.out.println("ID von Wien = " +Ergebnis.getId());
	}}