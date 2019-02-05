
public class student {
	
	String firstName;
	String lastName;
	String gender;
	int age;
	
	public student(String firstName, String LastName, String gender, int age) {
			this.firstName = firstName;
			this.lastName = LastName;
			this.gender = gender;
			this.age = age;
	}
	public void reviewLession() {
		System.out.println("You have to review lession before going to sleep");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	String name;
//	int age;
//	String gender;
//	String batch;
//	
//	public student(String name, int age, String gender, String batch) {
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
//		this.batch = batch;
//	}
//	
//	public void reviewLession() {
//		System.out.println("Requires to review lession before going to class");
//	}	
public static void main(String[] args) {
	student myStudent = new student("Sovann", "Chai", "Male", 20);
	
	
	System.out.println(myStudent.lastName+" "+myStudent.firstName+" "+myStudent.gender+" " +myStudent.age);
	myStudent.reviewLession();
	
}

}
