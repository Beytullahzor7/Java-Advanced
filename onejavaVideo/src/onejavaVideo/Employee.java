package onejavaVideo;

public class Employee extends Person {
	private int id;
	private int salary;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(int id, int salary, String name) {
		super(name);
		this.id = id;
		this.salary = salary;
		
	}
	
	
	
	
	
	
	
	
	

}
