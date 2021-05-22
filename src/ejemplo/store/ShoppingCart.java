package ejemplo.store;

import java.util.ArrayList;

public class ShoppingCart {
	private String id;
	private User user;
	private ArrayList<Item> items;

	public ShoppingCart(String id, User user, ArrayList<Item> items) {
		super();
		this.id = id;
		this.user = user;
		this.items = items;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "ShoppingCart {id=" + id + ", user=" + user + ", items=" + items + "}";
	}
	
	

}
