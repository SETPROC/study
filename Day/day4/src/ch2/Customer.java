package ch2;

public class Customer extends User {
	private String product;

	public Customer(String name, String email, String product) {
		super(name, email);
		this.product = product;
	}

	public void buy() {
		System.out.println("상품 구매: " + product);
	}

}
