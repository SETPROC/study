package homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class DeliveryDAO {
	private List<DeliveryDTO> deliveryList;
	private String filename;

	public DeliveryDAO(String filename) {
		this.deliveryList = loadCsv(filename);
		this.filename = filename;
	}

	public List<DeliveryDTO> loadCsv(String filename) {
		List<DeliveryDTO> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			String line;
			boolean skip = true;
			while ((line = br.readLine()) != null) {
				if (skip == true) {
					skip = false;
					continue;
				}
				String[] parts = line.split(",");
				String name = parts[1].trim();
				int price = Integer.parseInt(parts[2]);
				int qty = Integer.parseInt(parts[3]);

				DeliveryDTO dto = new DeliveryDTO(name, qty, price);
				list.add(dto);
			}
		}

		catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

	public void writeCsv(String filename) {
		try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
			pw.println("id,name,qty,price");
			for (DeliveryDTO dto : deliveryList) {
				pw.printf("%d,%s,%d,%d\n", dto.getNumber(), dto.getName(), dto.getQty(), dto.getPrice());
			}
		} catch (Exception e) {
			System.out.println("csv 저장 실패:" + e.getMessage());
		}
	}

	public void writeCsv() {
		writeCsv(filename);
	}
	public void save(DeliveryDTO dto) {
		deliveryList.add(dto);
		writeCsv(filename);
	}

	public List<DeliveryDTO> findAll() {
		return deliveryList;
	}

}
