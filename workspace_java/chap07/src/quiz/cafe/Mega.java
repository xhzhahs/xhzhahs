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
	

	@Override
	void order(String menu, int c) {
		
		System.out.println(menu + c + "개 주문받았습니다.");
		
		for(int i = 0; i < menuName.size(); i++) {
			if(menuName.get(i)== menu) {
			System.out.println(menuPrice.get(i)*c+ "원 입니다.");
			}
		}
		
	}
}
