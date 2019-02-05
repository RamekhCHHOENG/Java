
public class Demo {

	public static void main(String[] args) {
		Product product = new Product("MacBook");
		
		System.out.println(product);
		product.addProduct("Macbook Pro", 999);
		product.addProduct("Macbook Pro", 1);
		product.addProduct("Macbook Pro", 0);
		
		product.printProductDetail();
		
		System.out.println("Total price is: "+product.getTotalPrice());

	}

}
