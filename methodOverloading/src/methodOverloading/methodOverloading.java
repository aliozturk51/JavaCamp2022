package methodOverloading;

public class methodOverloading {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.topla(2, 2);

		System.out.println(sonuc);

		DortIslem dortIslem2 = new DortIslem();
		System.out.println(dortIslem2.topla(1, 2, 3));

	}

}
