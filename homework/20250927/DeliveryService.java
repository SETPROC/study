package homework;

import java.util.List;
import java.util.Scanner;

public class DeliveryService {
	private DeliveryDAO dao;
	private Scanner sc = new Scanner(System.in);

	public DeliveryService(DeliveryDAO dao) {
		this.dao = dao;
	}

	public void addDelivery() {
		System.out.print("상품명을 입력해주세요: ");
		String name = sc.nextLine();

		System.out.print("상품 가격을 입력해주세요: ");
		int price = sc.nextInt();
		sc.nextLine();

		System.out.print("상품 수량을 입력해주세요: ");
		int qty = sc.nextInt();
		sc.nextLine();

		DeliveryDTO dto = new DeliveryDTO(name, price, qty);
		dao.save(dto);
	}

	public void allDelivery() {
		List<DeliveryDTO> deliveryList = dao.findAll();
		if (deliveryEmpty()) return;
		
		for (DeliveryDTO dto : deliveryList) {
			System.out.println(dto);
		}

	}

	public void viewDelivery() {
		List<DeliveryDTO> deliveryList = dao.findAll();

		System.out.print("상품 번호를 입력하세요: ");
		int n = sc.nextInt();
		sc.nextLine();

		if (deliveryEmpty()) return;
		
		for (DeliveryDTO dto : deliveryList) {
			if (dto.getNumber() == n) {
				System.out.println(dto);
				return;
			}
		}
		System.out.println("존재하지 않는 상품 번호입니다.");
	}

	public void removeDelivery() {
		List<DeliveryDTO> deliveryList = dao.findAll();
		boolean rm = false;

		if (deliveryEmpty()) return;

		System.out.print("상품 번호를 입력하세요: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (DeliveryDTO dto : deliveryList) {
			if (dto.getNumber() == n) {
				rm = true;
				break;
			}
		}
		if (rm == false) {
			System.out.println("존재하지 않는 상품 번호입니다.");
			return;
		}

		deliveryList.removeIf(dto -> dto.getNumber() == n);
		System.out.println("삭제되었습니다.");
		dao.writeCsv();
		return;
	}

	public void resetDelivery() {
		List<DeliveryDTO> deliveryList = dao.findAll();
		boolean rs = false;

		if (deliveryEmpty()) return;

		System.out.print("상품 번호를 입력하세요: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < deliveryList.size(); i++) {
			if (deliveryList.get(i).getNumber() == n) {
				System.out.print("상품명을 입력해주세요.");
				deliveryList.get(i).setName(sc.nextLine());
				System.out.print("상품 가격을 입력해주세요.");
				deliveryList.get(i).setPrice(sc.nextInt());
				sc.nextLine();
				System.out.print("상품 수량을 입력해주세요.");
				deliveryList.get(i).setQty(sc.nextInt());
				sc.nextLine();
				dao.writeCsv();
				return;
			}
		}
		System.out.println("존재하지 않는 상품입니다.");
	}

	public void orderDelivery() {
		List<DeliveryDTO> deliveryList = dao.findAll();
		int index = 1;
		
		if(deliveryEmpty()) return;
		
		System.out.println("주문하시려는 상품을 선택해주세요.");
		
		for(DeliveryDTO dto: deliveryList) {
			System.out.println(index++ + ". 상품명: " + dto.getName()+
					", 상품 가격: "+ dto.getPrice() +
					", 상품 수량: "+ dto.getQty());
		}
		
		System.out.println("번호를 입력해주세요.");
		int n = sc.nextInt();
		sc.nextLine();
		
		while(true) {
			if(n<index) {// index가 1부터 시작했기 때문.
				System.out.println(deliveryList.get(n-1).getName()+
						"을(를) 선택하셨습니다.");
				System.out.println("현재 수량: "+ deliveryList.get(n-1).getQty());
				System.out.print("주문하실 수량을 입력하세요: ");
				int qty = sc.nextInt();
				sc.nextLine();
				if(0<qty&& qty<=deliveryList.get(n-1).getQty()) {
					System.out.println("주문하신 수량만큼 용인 외대 생활관으로 배달하겠습니다.");
					deliveryList.get(n-1).setQty(deliveryList.get(n-1).getQty()-qty);
					dao.writeCsv();
					return;
				}
				else if(qty == 0) {
					System.out.println("주문을 취소합니다.");
					return;
				}
				else {
					System.out.println("다시 입력해주세요.");
					continue;
				}
			}
			else {
				System.out.println("다시 입력해주세요.");
				n = sc.nextInt();
				sc.nextLine();
			}
			
		}
		
		
		
		
	}
	
	public boolean deliveryEmpty() {
		if (dao.findAll().isEmpty()) {
			System.out.println("등록된 정보가 없습니다.");
			return true;
		} else
			return false;
	}
}
