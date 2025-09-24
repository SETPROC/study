package ch3;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

	private List<ProductDTO> productList = new ArrayList<>();
	
	public void save(ProductDTO dto){
		productList.add(dto);
	}
	
	public List<ProductDTO> findAll(){
		return productList;
	}
}
