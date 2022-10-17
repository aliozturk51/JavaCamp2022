package youTubeEducation;

import youTubeEducation.business.CarCreditManager;
import youTubeEducation.business.CustomerManager;
import youTubeEducation.entities.Customer;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager(new Customer(), new CarCreditManager());
		customerManager.giveCredit();
		;
	}

}
