import java.util.concurrent.SynchronousQueue;

public class HalloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hallo Alex wir lernen JAVA");
		
		// Variablen
		int meineErsteZahl = (5 + 55)*2;
		int meineZweiteZahl = 5;
		int meineDritteZahl = meineErsteZahl *meineZweiteZahl;
		int summe = meineErsteZahl + meineZweiteZahl + meineDritteZahl;
		// Case Sensitiv ist relevant
		int MyLastOne = 1000 - summe;
		System.out.println("das ist meine erste zahl "+ MyLastOne);
		
		//primitve Datentypen  ByteShortInt
		
		byte myByterValue = - 128; 
		
		//Float and Doubel
		
		int myIntValue =5 / 3;
		
		float myFlotatValue =5f /3f;
		
		double myDoubleValue = 5.5 / 3d;
		
		System.out.println(myIntValue);
		System.out.println(myFlotatValue);
		System.out.println(myDoubleValue);
		
		double pounds = 200d;
		double poundToKilo = pounds * 0.45359247;

		System.out.println(pounds + " sind " + poundToKilo +" kg");
		double pi = 3.141_5927d;
		char myChar = '\u00Ae';
		System.out.println(myChar);
		boolean myBoolean = true;
		
		System.out.println(myBoolean); 

		String myString = "das ist ein STRING";
		
		System.out.println(myString);
				
		int myIntValue2=4;
		
		myIntValue2 -= 2;
		
		System.out.println(myIntValue2);
		
		boolean isAlien = false;
		if (isAlien == true)
			System.out.println("ist korrekt ");
		
		//Operators
		
		double myFirstDouble = 20d;
		double mySecondDouble = 80d;
		
		double sum=( myFirstDouble + mySecondDouble )* 25d;
		System.out.println(sum);
		
		sum = sum % 40;
		System.out.println(sum);
		if (sum <= 20)
			System.out.println("Total is over the Limit");
		
		System.out.println(sum);
		
		
		
		
	}
}
