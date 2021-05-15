package ejemplo.cuenta;

public class Account {

	public String name, id, type;
	public double amount, interest;

	public Account(String name, String id, String type, double amount, double interest) {
		this.name = name;
		this.id = id;
		this.type = type;
		this.amount = amount;
		this.interest = interest;

	}

	public Account() {

	}

	public Account(String name, String id, String type) {
		super();
		this.name = name;
		this.id = id;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", id=" + id + ", type=" + type + ", amount=" + amount + ", interest="
				+ interest + "]";
	}

	public double getInterestOfAccount(int month, double interest) {
		return month * this.amount * (this.interest / 100);

	}

}
