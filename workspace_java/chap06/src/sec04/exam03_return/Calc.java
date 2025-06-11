package sec04.exam03_return;

public class Calc {

	// 두 수를 입력 받아 더한 결과를 돌려주는 메소드
	// 메소드명: plus
	// 전달인자: int a, int b
	// 리턴타입: int
	
	int plus(int a, int b) {
		return a + b;
	}
	
	double avg(int x, int y) {
		// 메소드 안에서 값만 존재할 수 없음 ex) 2; 
		// 실행만 할거면 sum으로 받지 않고 plus(x,y);로 쓸 수 있음
		int sum = plus(x,y);
		double result = (double)sum / 2;
		return result;
	}
	
	void execute(int a1, int a2) {
		double result = avg(a1, a2);
		System.out.println(a1+ "과 "+ a2+ "의 평균은 "+ result);
	}
	
	
	
	
	
	
	
}
