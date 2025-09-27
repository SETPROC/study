package homework;

/*
 * 자동증가번호, 품명, 가격, 주문가능수, 현재재고(주문 후 남은 수량)
품명입력, 전체조회, 개별조회, 삭제, 수정, 통계
 */
public class DeliveryDTO {
	private static int deliveryNum = 1;
	private int number;
	private String name;
	private int price;
	private int qty;
	private int total;

	public DeliveryDTO() {
	}

	public DeliveryDTO(String name, int price, int qty) {
		this.number = deliveryNum++;
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.total = price * qty;
	}


	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
		this.total = price * qty;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
		this.total = price * qty;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "상품 번호: " + number +
				", 상품명: " + name + 
				", 가격: " + price + 
				"원, 수량: " + qty + 
				"개, 총액: "+ String.format("%,d", total) + "원";
	}

}
