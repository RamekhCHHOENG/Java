
public class Student {
	String name;
	String gender;
	private int age;
	private String batch;
	
	
	// Setter and getter for age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// Setter and getter for batch
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	
	@Override
	public String toString() {
		return batch;
	}
	
	
	
}
