package arrays;

public class arraysDemo {

	public static void main(String[] args) {

		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Salih";
		ogrenciler[2] = "Derin";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}

		String[] students = { "Ali", "Büşra", "Halil" };

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}

		System.out.println("Deneme --------");

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
