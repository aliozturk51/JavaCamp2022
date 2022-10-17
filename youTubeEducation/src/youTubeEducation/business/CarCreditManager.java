package youTubeEducation.business;

public class CarCreditManager extends BaseCreditManager implements CreditManager {

	@Override
	public void calculate() {
		System.out.println("Araba kredisi hesaplandı.");
	}

	@Override
	public void save() {

		// super.save();
		System.out.println("Araba kredisi sisteme kaydedildi.");
	}

}
