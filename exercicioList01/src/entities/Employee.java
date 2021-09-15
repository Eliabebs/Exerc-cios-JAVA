package entities;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;

	public Employee() {

	}

	public Employee(Integer id, String nameString, Double salary) {
		this.id = id;
		this.name = nameString;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNameString() {
		return name;
	}

	public void setNameString(String nameString) {
		this.name = nameString;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100;
	}

	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}

}
