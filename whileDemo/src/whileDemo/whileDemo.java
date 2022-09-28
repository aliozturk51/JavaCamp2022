package whileDemo;

public class whileDemo {

	public static void main(String[] args) {

		// While
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;

		}
		System.out.println("Döngü son");

		// Do-While
		int j = 1;

		do {
			System.out.println(j);
			j += 2;

		} while (j < 10);

	}

}
