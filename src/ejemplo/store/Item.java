package ejemplo.store;

public class Item {
	
	private int amount;
	private double price;
	private Product product;
	
	public Item(int amount, Product product) {
		this.price=product.getPrice();
		this.amount = amount;
		this.product = product;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Item:{amount=" + amount + ", price=" + price + ", product=" + product + "}";
	}
	
	
	
	

}
