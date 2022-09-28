package methods2;

public class methods2 {

	public static void main(String[] args) {

		add(1, "Ali", "05936458");
		add(2, "Ahmet", "01345678");
		delete(2, "Ahmet", "01345678");
		update(1, "Ali", "05945654");

	}

	public static void add(int id, String name, String phone) {
		sendMessage("Yeni müşteri  eklendi: " + id + ". " + "Ad: " + name + " Telefon: " + phone);
	}

	public static void delete(int id, String name, String phone) {
		sendMessage(
				id + ". " + "Ad: " + name + " Telefon: " + phone + " Kullanıcının bilgileri veritabanından silindi.");
	}

	public static void update(int id, String name, String phone) {
		sendMessage("Müşteri bilgileri güncellendi: " + id + ". " + "Ad: " + name + " Telefon: " + phone);
	}

	public static void sendMessage(String message) {
		System.out.println(message);
	}
}
