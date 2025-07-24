package quiz.class1;

import java.util.HashMap;

public class MinsuDAO {

	HashMap map = new HashMap();
	
	MinsuDAO(){
		map.put("사탕", "청포도");
		map.put("점심", "달식당");
		map.put("회식", "어디로 가요?");
		map.put("휴식", "네!!");
	}
	
	String selectAnswer(String question) {
		return (String)map.get(question);
	}
}
