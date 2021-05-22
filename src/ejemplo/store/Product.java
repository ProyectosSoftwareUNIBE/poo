package ejemplo.store;

public class Product {

	private String id, code, name;
	private double price;

	public Product(String id, String code, String name, double price) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product:{id=" + id + ", code=" + code + ", name=" + name + ", price=" + price + "}";
	}
	
	
	
	

}
