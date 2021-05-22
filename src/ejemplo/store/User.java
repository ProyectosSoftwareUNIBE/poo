package ejemplo.store;

public class User {
	private String ci,name,lastName;

	public User(String ci, String name, String lastName) {
		super();
		this.ci = ci;
		this.name = name;
		this.lastName = lastName;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "User:{ci=" + ci + ", name=" + name + ", lastName=" + lastName + "}";
	}
	
	
	
	
}
