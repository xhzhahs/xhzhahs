package quiz.cafe;

public class Mega extends Cafe{
	
	Mega(){
		super("메가커피");
		addMenu("아메리카노", 5000);
		addMenu("토피넛라떼", 5500);
		addMenu("디카페인", 5500);
		addMenu("밀크티", 5000);
		
	}
	@Override
	void hello() {
		System.out.println("안녕하세요. 메가커피입니다.");
	}
	

}
