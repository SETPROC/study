package homework;

import java.util.Scanner;

public class DeliveryController {
	private Scanner sc = new Scanner(System.in);
	private DeliveryService service;
	
	public DeliveryController(DeliveryService service) {
		this.service = service;
	}

	public void run() {
		while(true) {		
			/*
			 * 품명입력, 전체조회, 개별조회, 삭제, 수정, 통계
			 */
			System.out.println("1. 상품 주문");
			System.out.println("2. 상품 등록");
			System.out.println("3. 전체 상품 조회");
			System.out.println("4. 개별 조회");
			System.out.println("5. 상품 삭제");
			System.out.println("6. 상품 수정");
			System.out.println("7. 상품 통계");
			System.out.println("0. 프로그램 종료");			
			System.out.print("번호를 입력해주세요:");
			int n = sc.nextInt();
			sc.nextLine();
			
			switch(n) {
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			case 1:
				service.orderDelivery();
				break;
			case 2:
				service.addDelivery();
				break;
			case 3:
				service.allDelivery();
				break;
			case 4:
				service.viewDelivery();
				break;
			case 5:
				service.removeDelivery();
				break;
			case 6:
				service.resetDelivery();
				break;
			case 7:
				//service.deliveryAnalysis();
				break;
			default:
				System.out.println("다시 입력해주세요.");
			}
		}
	}
}
