package sec01.exam01;

public class EnumExam04 {

	public static void main(String[] args) {

		Week week;
		
		Week week_m = Week.월; // Week type의 변수가 가질 수 있는 것은 Week 안에 있는것뿐 

//		Week week_m = "월요일"; 
//		Week week_m = "월"; String type이기 때문에 쓸 수 없음
		
		
		if(week_m == Week.월) {
			System.out.println("월요일");
		} else if(week_m == Week.화) {
			System.out.println("화요일");
		}
		
		
		
		
		
		
		
		
	}

}
