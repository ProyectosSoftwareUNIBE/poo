package ejemplo.ejemploExamen;

public class Item {
	private double price;
	private String name;

	public Item(double price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Item [price=" + price + ", name=" + name + "]";
	}

}
