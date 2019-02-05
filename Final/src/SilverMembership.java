
public class SilverMembership extends Customer {
	public SilverMembership(String name, double packageCost, double serviceCost) {
		super(name, packageCost, serviceCost);
	}
	
	
	public double getDiscount() {
		double discount = 0.1 * getPackageCost()+getServiceCost();
		return discount;
	}


	@Override
	public double findTotalExpense() {
		
		double expense = getPackageCost()+getServiceCost();
		double totalExpense = expense -getDiscount();
		return totalExpense;
	}


	@Override
	public String toString() {	
		return "Customer Name:"+getName()+ "[Siver Membership] \n"+"Package Cost: "+getPackageCost()+" $"+" \n Service Cost: "
				+getServiceCost()+" $"+"\n Discount: "+getDiscount()+" $"+" \n Total Expense: "+findTotalExpense()+" $"+"\n ================";
	}
	
	
}
