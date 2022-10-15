package abstractClasses;

public class abstractClasses {

	public static void main(String[] args) {
		
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.calculate();
		womanGameCalculator.gameOver();
		
		
		GameCalculator gameCalculator = new WomanGameCalculator();
		
	}

}
