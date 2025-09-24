package sportsmanage;

import java.util.ArrayList;
import java.util.List;

public class SportsManageDAO {
	
	
	private List<SportsManageDTO> sportsmList = new ArrayList<>();

	public void addSport(SportsManageDTO sportsM) {
		sportsmList.add(sportsM);
	}
	
	public List<SportsManageDTO> findAll(){
		return sportsmList;
	}
	
	
}
