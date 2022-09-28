package switchDemo;

public class switchDemo {

	public static void main(String[] args) {

		char grade = 'C';

		switch (grade) {

		case 'A':

			System.out.println("Mükemmel.");
			break;

		case 'B':
			System.out.println("İyi");
			break;
		case 'C':
			System.out.println("Orta");
			break;
		case 'D':
			System.out.println("İdare eder");
			break;
		case 'F':
			System.out.println("Kaldınız");
			break;
		default:
			System.out.println("Geçersiz bir değer girdiniz.");

		}

	}

}
