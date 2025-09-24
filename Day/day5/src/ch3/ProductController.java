package ch3;

import java.util.List;
import java.util.Scanner;

/*
 * 상품관리 프로그램
 * 1. 상품 등록: 상품명, 수량, 가격, 상품번호
 * 2. 전체 상품 조회: 상품번호, 상품명, 수량, 가격, 합계 출력
 * 3. 개별 상품 조회: 원하는 번호 입력 시 해당 상품만 출력
 * 4. 상품 정보 삭제: 원하는 번호 입력 시 해당 상품만 삭제
 * 5. 상품 정보 수정: 원하는 번호 입력 시 해당 상품만 수정(상품번호는 수정x)
 * 6. 상품 분석: 전체 상품의 갯수, 전체 상품의 합계
 * 0. 프로그램 종료
 */
public class ProductController {
	private ProductService service;
	private Scanner sc = new Scanner(System.in);

	public ProductController(ProductService service) {
		this.service = service;
	}

	public void run() {
		while (true) {
			System.out.println("1. 상품 등록");
			System.out.println("2. 전체 조회");
			System.out.println("3. 개별 상품 조회");
			System.out.println("4. 상품 삭제");
			System.out.println("5. 상품 정보 수정");
			System.out.println("0. 프로그램 종료");
			System.out.println("번호를 입력하세요.");

			int q = sc.nextInt();
			sc.nextLine();
			switch (q) {
			case 0:
				return;
			case 1:
				service.addProduct();
				break;
			case 2:
				service.outAllProduct();
				break;
			case 3:
				service.viewProduct();
				break;
			case 4:
				service.removeProduct();
				break;
			case 5:
				service.resetProduct();
				break;
			case 6:
				System.out.println("상품 분석");
				break;
			default:
				System.out.println("다시 입력해주세요.");

			}

		}
	}	

}
