package classesWithAttributes;

public class ProductManager {

	public void add(Product product) {
		System.out.println("Ürün eklendi. " + product.getName());
	}

	public void add2(int id, String name, String descrition, int stockAmount, double price, String renk) {
	}
}
