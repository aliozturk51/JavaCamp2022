package methods;

public class methods {

	public static void main(String[] args) {

		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] sayilar = { 1, 2, 5, 7, 9 };
		int aranacak = 7;

		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			mesajVer("Sayı mevcuttur: " + aranacak);

		} else {
			mesajVer("Sayı mevcut değildir: " + aranacak);
		}

	}

	public static void mesajVer(String mesaj) {

		System.out.println(mesaj);
	}

}
