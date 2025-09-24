package ch3;

import java.util.List;
import java.util.Scanner;

public class ProductService {
	private Scanner sc = new Scanner(System.in);
	private ProductDAO dao = new ProductDAO();

	public ProductService(ProductDAO dao) {
		this.dao = dao;
	}

	public List<ProductDTO> getAllProduct() {
		return dao.findAll();
	}

	public void addProduct() {
		System.out.print("상품ID:");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.print("상품명:");
		String name = sc.nextLine();

		System.out.print("상품 수량:");
		int qty = sc.nextInt();
		sc.nextLine();

		System.out.print("상품 가격:");
		int price = sc.nextInt();
		sc.nextLine();

		ProductDTO dto = new ProductDTO(id, name, qty, price);
		dao.save(dto);
		System.out.println("등록되었습니다.");
	}

	public void viewProduct() {
		List<ProductDTO> productList = dao.findAll();
		System.out.print("상품 번호를 입력해주세요:");
		int n = sc.nextInt();
		sc.nextLine();

		for (ProductDTO dto : productList) {
			if (dto.getId() == n) {
				System.out.println("====일치하는 상품====");
				System.out.println(dto);
				return;
			}
		}
		
		System.out.println("찾으시는 상품이 없습니다.");

	}

	public void removeProduct() {
		boolean rm = false;
		List<ProductDTO> productList = dao.findAll();
		
		System.out.print("상품 번호를 입력해주세요:");
		int n = sc.nextInt();
		sc.nextLine();
		int index = 0;
		
		for (ProductDTO dto : productList) {
			if (dto.getId() == n) {
				rm = true;
				break;
			}
			index++;	
		}
		if(rm == false)
			System.out.println("찾으시는 상품이 없습니다.");
		else
		{
			productList.remove(index);
			System.out.println("삭제되었습니다.");
		}
	}

	public void outAllProduct() {
		List<ProductDTO> productList = dao.findAll();
		if (productList.isEmpty())
			System.out.println("저장된 데이터가 없습니다.");
		else {
			for (ProductDTO dto : productList) {
				System.out.println(dto);
			}
		}
	}
	
	public void resetProduct() {
		boolean rs = false;
		List<ProductDTO> productList = dao.findAll();
		System.out.print("상품 번호를 입력해주세요:");
		int n = sc.nextInt();
		sc.nextLine();
		
		int index = 0;
		
		for (ProductDTO dto : productList) {
			if (dto.getId() == n) {
				rs = true;
				break;
			}
			index++;	
		}
		if(rs == false)
			System.out.println("찾으시는 상품이 없습니다.");
		else
		{
			productList.remove(index);
			addProduct();
			System.out.println("수정되었습니다.");
			/*
			 * set으로 접근하려면 입력값 또 받아야 한다.
			 * productList.set(index,객체);
			 */
		}
	}
}
