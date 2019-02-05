
public class studentlist {

	public static void main(String[] args) {
		student myStudent = new student("Sovann", "Chai", "Male", 20);
		
		
		System.out.println(myStudent.lastName+" "+myStudent.firstName+" "+myStudent.gender+" " +myStudent.age);
		myStudent.reviewLession();
		
	}

}
