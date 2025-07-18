package quiz.cafe;

public class Paiks extends Cafe{
	
	Paiks(){
		super("빽다방");
		addMenu("아메리카노", 5000);
		addMenu("원조커피", 5500);
		addMenu("디카페인", 5500);
		addMenu("미숫가루", 5000);
		
	}
	
	@Override
	void hello() {
		System.out.println("안녕하세요. 빽다방입니다.");
	}
	
	@Override
	void stockList() {
		System.out.println("빽다방 재고확인 하겠습니다.");
	}
	

}
