package quiz.class1;

public class MinsuController extends Student {
	
	MinsuController(){
		super("민수");
	}
	
	// 변수이기 때문에 필드에 new가능
	MinsuService minsuService = new MinsuService();
	
	// override는 메소드타입, 메소드명, 전달인자 타입을 변경할 수 없다.
	// 하지만 전달인자의 타입이 같다면 변수명은 변경가능
	@Override
	String answer(String question) {
		String result = minsuService.getInfo(question);
		return result;
	}
	
}
