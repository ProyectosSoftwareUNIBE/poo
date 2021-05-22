package ejemplo.ejemploExamen;

import java.util.ArrayList;

public class ShoppingCart {

	private User user;
	private double mount;
	private ArrayList<Item> items;

	public ShoppingCart(User user, double amount, ArrayList<Item> items) {
		super();
		this.user = user;
		this.mount = amount;
		this.items = items;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getMount() {
		return mount;
	}

	public void setMount(double amount) {
		this.mount = amount;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	};

	public void addItem(Item item) {
		items.add(item);
		mount += item.getPrice();

	}

	@Override
	public String toString() {
		return "ShoppingCart [user=" + user + ", mount=" + mount + ", items=" + items + "]";
	}
	
	

}
