
public class HelloWorld2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// KeyWordsAndExpressions

		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		int highscore = cacludateStore(gameOver, score, levelCompleted, bonus);

		System.out.println(highscore);
	}

	public static int cacludateStore(boolean gameOver, int score, int levelComplete, int bonus) {

		if (gameOver) {

			return 1;
		} else {

		}
		return -1;

	}


}
