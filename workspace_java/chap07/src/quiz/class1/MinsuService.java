package quiz.class1;

public class MinsuService {
	
	MinsuDAO minsuDAO = new MinsuDAO();

	// 대답을 하기 위해 찾는곳
	// 머리속(생각)
	String getInfo(String question) {
		String result = minsuDAO.selectAnswer(question);
		if(result == null) {
			result = "(신중히 생각중)";
		} else {
			result = "흐음.. 저는요 "+result+"이거요!";
		}
		return result;
	}
	// gpt
	
	// 노션
	
	
	
}
