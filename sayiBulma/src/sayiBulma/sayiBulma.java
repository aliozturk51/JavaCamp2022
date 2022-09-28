package sayiBulma;

public class sayiBulma {

	public static void main(String[] args) {
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
			System.out.println("Sayı mevcuttur.");
		} else {
			System.out.println("Sayı mevcut değildir.");
		}

		
//		Tekrar dene bu yöntemi
//		for (int sayi : sayilar) {
//			if (sayi == aranacak) {
//				System.out.println("listede bulundu.");
//				break;
//
//			}
//
//		}
	}

}
