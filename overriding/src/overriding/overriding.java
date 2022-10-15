package overriding;

public class overriding {

	public static void main(String[] args) {

		BaseCreditManager[] baseCreditManagers = new BaseCreditManager[] { new TeacherCreditManager(),
				new AgricultureCreditManager(), new StudentCreditManager() };

		for (BaseCreditManager baseCreditManager : baseCreditManagers) {

			System.out.println(baseCreditManager.calculate(6000));

		}
	}

}
