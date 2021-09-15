package entities;

public class Rent {
	public String Name;
	public String email;
	public Rent(String name, String email) {
		Name = name;
		this.email = email;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
