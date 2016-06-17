package Server_Route_Planner;

import java.awt.DisplayMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
				
		 Scanner scanner = null;
		 BinarySearchTree meinBST = new BinarySearchTree();
		 Ort ort = new Ort( 0, null);
            try {
                scanner = new Scanner(new BufferedReader(new FileReader("orte.txt")));
                //scanner.useDelimiter(",");
                
                
                while(scanner.hasNextLine()) {

                    String input = scanner.nextLine();
                    String[] data = input.split(",");
                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    //System.out.println(id + ": " + name);
                    ort = new Ort(id,name);
                    meinBST.insert(ort);; 
                	  
                	
                  
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if(scanner != null) {
                    scanner.close();
                }
            } 

		
	  
	
        String suche="graz";
        
        System.out.println("Suche " + suche);
        Ort Ergebnis = meinBST.findExact(suche);
        
       System.out.println("ID von "+ suche +" = " +Ergebnis);
      
       
	
   	}
	
	}