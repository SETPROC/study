package ch1;

public class Bread {
	// 특성 == 속성 == 필드
	// 필드에 대한 접근은 모두 클래스 내부에서만 접근 가능함
	private String name;
	private int gram;
	private int price;
	private int cnt;

	// 이건 팁.
	static int count = 0;

	// 생성자
	public Bread() {
		count++;
	}

	public Bread(String name, int gram, int price, int cnt) {
		this.name = name;
		this.gram = gram;
		this.price = price;
		this.cnt = cnt;
		count++;
	}

	// 외부에서의 접근 getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGram() {
		return gram;
	}

	public void setGram(int gram) {
		this.gram = gram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	// 총 합계 메서드
	public int breadTotal() {
		return this.price * this.cnt;
	}

	public int breadTotal(int price) {
		return price * this.cnt;
	}

	public int breadTotal(int price, int cnt) {
		return price * cnt;
	}

	@Override
	public String toString() {
		return "Bread [이름=" + name + ", 가격 =" + price + ", 수량 =" + cnt + ", 합계 =" + breadTotal() + "]";
	}

	public static int countBread() {
		return count;
	}
}
