

public class HelloWorld3 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		
		String month = "JANUARy";
		month.toLowerCase();
		
		System.out.println(month.toLowerCase());
		
		int switchValue =3;
		
		switch(switchValue){
		
		case 1:
			System.out.println("Value was 1");
			break;
		case 2:
			System.out.println("Value was 2");
			break;
			
		default:
			System.out.println("was not 1 or 2");
			break;
		}
		
		for (int i = 8; i > 2; i--) {
			
			System.out.println("10.000 at "+ i +" % " + String.format("%.2f",calculateInteres(10000.0, i)));
				
		}
		
		int count = 0;
		for (int i = 10; i < 50; i++) {
			if (isPRime(i)) {
				count++;
				System.out.println(i + " primNumber " + isPRime(i));
				if (count == 10) {
					System.out.println("Exit for loop");
					break;
				}
			}
		}

	}

	public static boolean isPRime(int n) {

		if (n == 1) {
			return false;
		}
		for (int i = 2; i <= n % 2; i++) {
			if (n % 1 == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static double calculateInteres(double amount, double interestRaste){
	return (amount *(interestRaste/100));
	
	}

}
