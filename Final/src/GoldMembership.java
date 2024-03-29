
public class GoldMembership extends Customer{
	private int registeredYear;
	private double discountRate;
	
	public GoldMembership(String name, double packageCost, double serviceCost) {
		super(name, packageCost, serviceCost);
	}

	public int getRegisteredYear() {
		return registeredYear;
	}

	public void setRegisteredYear(int registeredYear) {
		this.registeredYear = registeredYear;
	}
	
	public int getMembershipYear() {
		return 0;
	}
	
	public double getDiscount() {
		double expense = getPackageCost()+getServiceCost();
		double discount = 0.1 * expense;
		if(getMembershipYear()>=2) {
			discount = 0.25;
		}else if (expense >= 250){
			discount = 0.2;
		} else {
			discount = 0.15;
		}
		return discount;
	}
	
	
	@Override
	public double findTotalExpense() {
		double expense = getPackageCost()+getServiceCost();
		double totalExpense = expense- expense * getDiscount();
		
		return totalExpense;
	}
	
	@Override
	public String toString() {	
		return "Customer Name:"+getName()+ "[Gold Membership] \n"+"Package Cost: "+getPackageCost()+" $"+" \n Service Cost: "
				+getServiceCost()+" $"+"\n Discount: "+getDiscount()+" $"+" \n Total Expense: "+findTotalExpense()+" $"+"\n ================";
	}
	
	
	
}
