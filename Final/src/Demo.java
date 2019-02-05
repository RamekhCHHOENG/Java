
public class Demo {

	public static void main(String[] args) {
		Visitor visitor1 = new Visitor("Vandy", 150.0, 20.0);
		System.out.println(visitor1.toString());
		
		SilverMembership silver = new SilverMembership("Sopea", 300.0, 50.0);
		System.out.println(silver.toString());
		
		GoldMembership gold = new GoldMembership("Vandy", 250.0, 5.0);
		System.out.println(gold.toString());
	}

}
