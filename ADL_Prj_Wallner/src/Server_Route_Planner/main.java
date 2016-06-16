package Server_Route_Planner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class main {

	public static void main(String[] args) {
				
		 Scanner scanner = null;
		 BinarySearchTree meinBST = new BinarySearchTree();
		 Orte orte = new Orte(0, null);
            try {
                scanner = new Scanner(new BufferedReader(new FileReader("orte.txt")));
                //scanner.useDelimiter(",");
                
                
                while(scanner.hasNextLine()) {

                    String input = scanner.nextLine();
                    String[] data = input.split(",");
                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    //System.out.println(id + ": " + name);
                    orte = new Orte(id, name);
                    meinBST.insert(orte); 
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if(scanner != null) {
                    scanner.close();
                }
            } 

		
	System.out.println(orte.getName());
	System.out.println(orte.getId());    
	
        String suche="Linz";
        
        System.out.println("Suche " + suche);
        System.out.println(meinBST.findExact(suche));
        
       // System.out.println("ID von "+ suche +" = " +Ergebnis.getId());
  

	}
	}