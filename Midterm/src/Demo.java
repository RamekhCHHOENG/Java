
public class Demo {

	public static void main(String[] args) {
		Midterm student = new Midterm("Selena", "Pursat");
		
		student.addCourseScore("Java", 90);
		student.addCourseScore("JQuery", 60);
		student.addCourseScore("PHP", 80);
		student.addCourseScore("UML", 75.5);
		student.addCourseScore("Testing", 90);
		student.addCourseScore("UP", 90);
		student.addCourseScore("Laravel", 88);
		
		System.out.println("Display Information");
		System.out.println(student);
		student.printGrade();
		System.out.printf("Average is: %.2f",student.getAverageScore());

	}

}
