package ch1;

import java.sql.Date;
import java.util.List;

public class YumService {
	
	private YumDAO dao =new YumDAO();
	
	public int addYum(String name, String menu, int rating, Date visitDate) {
		return dao.addYum(name,menu,rating,visitDate);
	}
	//전체 조회
	public List<YumDTO> getAllYum(){
		return dao.selectAllYum();
	}
	
	public YumDTO getYum(int option,String sqlValue) {
		return dao.selectYum(option,sqlValue);
	}
	
	public int updateYum(int id,String name,String menu,int rating, Date visitDate) {
		return dao.updateYum(id,name,menu,rating,visitDate);
	}

	public int deleteYum(int id) {
		return dao.deleteYum(id);
	}
}
