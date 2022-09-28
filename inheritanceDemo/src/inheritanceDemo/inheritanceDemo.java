package inheritanceDemo;

public class inheritanceDemo {

	public static void main(String[] args) {
		
		CreditUI creditUI = new CreditUI();
		creditUI.creditCalculate(new SoldierCreditManager());
		
	}

}
