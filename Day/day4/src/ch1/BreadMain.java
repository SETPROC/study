package ch1;

public class BreadMain {

	public static void main(String[] args) {
		// 좋아하는 빵의 객체의 생성자를 만들어 해당 제품명과 금액을 처리한 후 출력
		Bread bread1 = new Bread();
		bread1.setName("소보로빵");
		bread1.setGram(100);
		bread1.setPrice(1400);
		bread1.setCnt(5);
		
		Bread bread2 = new Bread("커피번", 100, 2500, 5);
		
		System.out.println("제품명: " + bread2.getName());
		System.out.println("무게: " + bread2.getGram());
		System.out.println("가격: " + bread2.getPrice());
		System.out.println("수량: " + bread2.getCnt());
		
		Bread bread3 = new Bread();
		bread3.setName("밤식빵");
		bread3.setGram(200);
		bread3.setPrice(5600);
		bread3.setCnt(3);
		System.out.println(bread3);
		
		Bread bread4 = new Bread("건포도식빵",400,5500,2);
		System.out.println(bread4.toString());
		
		System.out.println(Bread.countBread());
		
	}

}
