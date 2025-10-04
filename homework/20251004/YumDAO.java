package ch1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//DB 연결, 예외처리, 자원반납, 데이터 처리(CRUD)

public class YumDAO {
	
	public List<YumDTO> selectAllYum() {
		List<YumDTO> list = new ArrayList<>();
		String sql = "select * from yum";
		try(Connection conn = DBUtill.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);
						ResultSet rs = pstmt.executeQuery()
		){
			while(rs.next())	{ // 한 줄씩 읽고 있으면 true 반환. 없으면 false로 종료
				int id = rs.getInt("id"); //DB에서 불러온 컬럼명을 변수 id에 저장
				String name = rs.getString("name"); 
				String menu = rs.getString("menu");
				int rating = rs.getInt("rating");
				Date visitDate = rs.getDate("visitDate");
				Date regDate = rs.getDate("regDate");
				
				YumDTO dto = new YumDTO(id, name, menu, rating, visitDate, regDate);
				list.add(dto);
			}
		}catch(Exception e)
		{
			System.out.println("전체 조회 오류: "+ e.getMessage());
		}
		return list;
	}

	public YumDTO selectYum(int option,String command) {
		YumDTO dto = new YumDTO();
		
		String sql = "";
		int queryId = 0;
		
		switch(option) {
		case 1: //id 검색용 구문
			sql = "select * from yum where id = ?";
			queryId = Integer.parseInt(command);
			break;
		case 2: //이름 검색용 구문
			sql = "select * from yum where name = ?";
			break;
		}
		
		try(Connection conn = DBUtill.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);		
		){
			if(option == 1)
				pstmt.setInt(1, queryId);
			else
				pstmt.setString(1, command);
			
		    try (ResultSet rs = pstmt.executeQuery()) {
		        if(rs.next())
		        {
		        		int id = rs.getInt("id");
		        		String name = rs.getString("name");
		        		String menu = rs.getString("menu");
		        		int rating = rs.getInt("rating");
		        		Date visitDate = rs.getDate("visitDate");
		        		Date regDate = rs.getDate("regDate");
		        		
		        		dto = new YumDTO(id,name,menu,rating,visitDate,regDate);
		        		return dto;
		        }
		        else {
		        		System.out.println("검색과 일치하는 데이터가 없습니다.");
		        }
		    }

		}catch(Exception e)
		{
			System.out.println("전체 조회 오류: "+ e.getMessage());
		}
		
		return null;
	}
	
	public int updateYum(int id,String name,String menu,int rating,Date visitDate)
	{
		YumDTO dto = new YumDTO();
		String sql = "update yum set name = ?, menu = ?, rating = ?, visitDate = ?, regDate = ? where id = ?";
		
		try(Connection conn = DBUtill.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);		
		){
			long millis = System.currentTimeMillis();
			Date now = new Date(millis);
			
			pstmt.setString(1, name);
			pstmt.setString(2, menu);
			pstmt.setInt(3, rating);
			pstmt.setDate(4, visitDate);
			pstmt.setDate(5,now);
			pstmt.setInt(6, id);
			
		    try (ResultSet rs = pstmt.executeQuery()) {
		        if(rs.next())
		        {
		        		System.out.println("성공적으로 적용되었습니다.");
		        		return 0;
		        }
		        else {
		        		System.out.println("수정에 실패하였습니다.");
		        }
		    }

		}catch(Exception e)
		{
			System.out.println("전체 조회 오류: "+ e.getMessage());
		}
		return 1;
	}

	public int deleteYum(int id) {
		String sql = "delete from yum where id = ?";
		
		try(Connection conn = DBUtill.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);		
		){
			pstmt.setInt(1, id);
			
		    try (ResultSet rs = pstmt.executeQuery()) {
		        if(rs.next())
		        {
		        		System.out.println("성공적으로 적용되었습니다.");
		        		return 0;
		        }
		        else {
		        		System.out.println("삭제에 실패하였습니다.");
		        }
		    }

		}catch(Exception e)
		{
			System.out.println("전체 조회 오류: "+ e.getMessage());
		}
		return 1;
	}

	public int addYum(String name, String menu, int rating, Date visitDate) {
		String sql = "insert into yum(name,menu,rating,visitDate) values(?,?,?,?)";
		
		try(Connection conn = DBUtill.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);		
		){
			pstmt.setString(1, name);
			pstmt.setString(2, menu);
			pstmt.setInt(3, rating);
			pstmt.setDate(4, visitDate);
			
		    try (ResultSet rs = pstmt.executeQuery()) {
		        if(rs.next())
		        {
		        		System.out.println("성공적으로 적용되었습니다.");
		        		return 0;
		        }
		        else {
		        		System.out.println("등록에 실패하였습니다.");
		        }
		    }

		}catch(Exception e)
		{
			System.out.println("전체 조회 오류: "+ e.getMessage());
		}
		return 1;
	}
	

}
