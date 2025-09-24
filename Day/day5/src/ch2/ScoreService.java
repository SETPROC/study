package ch2;

import java.util.List;

//비지니스 로직: 총점, 평균, 학점
public class ScoreService {
	private ScoreDAO dao = new ScoreDAO();
	
	// 의존성 주입: 외부 DAO를 받아와 내부 변수로 저장.
	// 교체 용이
	public ScoreService(ScoreDAO dao) {
		this.dao = dao;
	}

	/*	private String name;
	 * private int kor,eng,math;
	 * private int total;
	 * private double avg;
	 * private String grade;
	 */
	
	public List<ScoreDTO> getAllScore() {
		return dao.findAll(); // DAO에 저장된 학생 점수 리스트 전부 반환
	}
	
	public void addScore(String name,int kor,int eng,int math) {
		ScoreDTO dto = new ScoreDTO(name,kor,eng,math);
		int total = kor + eng + math;
		double avg = total / 3.0;
		String grade = getGrade(avg);
		
		dto.setTotal(total);
		dto.setAvg(avg);
		dto.setGrade(grade);
		
		dao.save(dto);
	}

	private String getGrade(double avg) {
		String grade = "";

		if(90<= avg && avg <= 100) grade = "A";
		else if(avg >= 80) grade = "B";
		else if(avg >= 70) grade = "C";
		else if(avg >= 60) grade = "D";
		else grade = "F";
	
		return grade;
	}

	public int getMaxTotal() {
		List<ScoreDTO> scoreList = getAllScore();
		
		if(scoreList.isEmpty()) return 0;
		
		int max = scoreList.get(0).getTotal();
		int index = 0;
		
		for(ScoreDTO dto: scoreList)
		{
			if(index++ == 0) continue;
			if(max<dto.getTotal())
				max = dto.getTotal();
		}
		return max;
	}
	
	public int getMinTotal() {
		List<ScoreDTO> scoreList = getAllScore();
		
		if(scoreList.isEmpty()) return 0;
		
		int min = scoreList.get(0).getTotal();
		int index = 0;
		
		for(ScoreDTO dto: scoreList)
		{
			if(index++ == 0) continue;
			if(min>dto.getTotal())
				min = dto.getTotal();
		}
		return min;
	}
	
	//총점 평균
	public double getAvgTotal()
	{
		List<ScoreDTO> scoreList = getAllScore();
		if(scoreList.isEmpty()) return 0.0;
		return (double)getSumTotal()/scoreList.size();
	}
	
	//총점 합계
	public double getSumTotal()
	{
		List<ScoreDTO> scoreList = getAllScore();
		if(scoreList.isEmpty()) return 0.0;
		int sum = 0;
		
		for(ScoreDTO dto: scoreList)
			sum += dto.getTotal();
		
		return sum;
	}
}
/*
 * 상수
 * 한 번 값이 대입되면 절대 바꿀 수 없는 값
 * final 키워드 사용
 * 전부 대문자로 작성. 띄어쓰기 경우 _(언더스코어)로 표기
 * MAX_VALUE,PI,DEFAULT_NUM
 * 
 * 공용 상수
 * 여러 곳에서 쓸 수 있도록 public static final로 선언
 * 객체 생성없이 클래스 이름으로 바로 접근 가능
 * Integer.MIN_VALUE, Integer.MAX_VALUE
 *	MIN_VALUE: int형이 가지는 가장 작은 값 -2,147,483,648
 *	MAX_VALUE: int형이 가지는 가장 큰 값 2,147,483,647
 * 
 *
 */

