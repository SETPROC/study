package ch2;

public class UserMain {
	public static void main(String[] args) {
		//인스턴스(객체) 생성
		Admin admin = new Admin("admin","admin@naver.com");
		Customer customer = new Customer("customer","customer@naver.com","책");

		admin.login();
		admin.manager(); // 관리자 입장
		
		customer.login(); // 
		customer.buy(); // 상품 구매
	}
}
