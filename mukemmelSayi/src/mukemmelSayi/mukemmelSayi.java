package mukemmelSayi;

public class mukemmelSayi {

	public static void main(String[] args) {
		int number = 3;

		int total = 0;

		if (number < 2 || number == 1) {
			System.out.println("Geçersiz bir sayıdır.");
			return;
		}

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;

			}
		}

		if (total == number) {
			System.out.println("Mükemel sayıdır.");

		} else {
			System.out.println("Mükemmel sayı değildir.");
		}

	}

}
