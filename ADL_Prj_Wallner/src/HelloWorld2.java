
public class HelloWorld2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// KeyWordsAndExpressions

		
		int newSocre=calculateScore("TIM", 500);
		System.out.println("New score is " + newSocre);
		
		calculateScore(75);
		
	}
	
	
	public static int calculateScore(String playerNmae, int score){
		System.out.println("Player " + playerNmae + " scored " + score + " points");
		return score *1000;
		}
	
	public static int calculateScore(int score){
		System.out.println("Unnamed Player " + score + " points");
		return score *1000;
		}

	
	
	
}
