package collections;

public class product_inv {
	int id, price, quantity;
	String name, brand;
	
	public product_inv(int id, String name, int price, String brand, int quantity) {
		this.id = id;
		this.name =name;
		this.price = price;
		this.brand = brand;
		this.quantity = quantity;
	}
}
