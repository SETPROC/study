package sportsmanage;

import java.util.List;

public class SportsManageService {
	private SportsManageDAO dao;

	public SportsManageService(SportsManageDAO dao) {
		this.dao = dao;
	}
	
	public void save(String name,int num, int bb,int cc ) {
		SportsManageDTO sportsM = new SportsManageDTO(name,num,bb,cc);
		dao.addSport(sportsM);
	}
	
	public List<SportsManageDTO> find(){
		return dao.findAll();
	}
	
	
}
