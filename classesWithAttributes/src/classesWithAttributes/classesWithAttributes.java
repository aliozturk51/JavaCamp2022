package classesWithAttributes;

public class classesWithAttributes {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Asus Laptop", 3000, 3, "Black");

		System.out.println(product.getName());

		ProductManager productManager = new ProductManager();
		productManager.add(product);

		System.out.println(product.getCode());
	}

}
