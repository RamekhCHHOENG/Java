
public class Activity1 {

	public static void main(String[] args) {
		
		
		double [] array = { 5, 20, 45, 11, 32 };
		double num = 0; 
		for (int i=0; i < array.length; i++) {
			System.out.print("|"+array[i]);
			num += array[i];
		}
		System.out.println("|");
		System.out.println("Average: "+num/array.length);
		
		int [][] gradeTable = {
				{99, 42, 74, 83, 100},
				{99, 42, 74, 83, 100},
				{99, 42, 74, 83, 100},
				{99, 42, 74, 83, 100},
				{99, 42, 74, 83, 100},
				{99, 42, 74, 83, 100},
				{99, 42, 74, 83, 100},
		};
		System.out.println("First student week5's mark is: "+ gradeTable[0][4]);
		for (int i=0; i<gradeTable[0].length; i++) {
			System.out.print("Fisrt student score:"+gradeTable[0][i]);
		}
		
		
		
		

	}
}
