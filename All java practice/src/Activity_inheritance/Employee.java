package Activity_inheritance;

public class Employee extends Person {
	private String position;
	
	public Employee() {
		
	}
	
	public Employee(String name) {
		super(name);
	}
	
	public Employee(String position, int age) {
		super(position, age);
		
	}
	
	public Employee( String name, int age, String position) {
		
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
