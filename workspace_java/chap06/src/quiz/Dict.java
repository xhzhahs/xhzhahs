package quiz;

public class Dict {

	String[] en = {"love", "hate", "devil", "angel"};
	String[] ko = {"사랑", "증오", "악마", "천사"};
	
	// 영어를 한국어로 번역하는 메소드
	// 메소드명 : en2ko
	// 전달인자 : String 영어
	// 리턴타입 : String 한국어
	
	String en2ko(String word) {
		for(int i = 0; i < en.length; i++) {
//	if( word.equals((en[i])) { 
//  word가 앞으로 오면 null일 경우가 있기 때문에 
//	if( word != null && word.equals((en[i])) {
//  이렇게 사용해야 하지만 JAVA에서 &&는 거짓을 찾는 여정이기때문에
//  word.equals((en[i])) 이것이 null을 만나면 거짓이기 때문에 에러는 아니지만 멈추게 된다.
			if(en[i].equals(word)) { // 그러므로 보장된 en[i]를 앞에 쓰는 것이 좋다. 
				System.out.println("한글: "+ i);
//				return; // if가 거짓일 경우 return을 받지 못하므로 에러
				return ko[i];
			} 
//			return; // if와 마찬가지로 for문이 안돌수가 있기 때문에 에러
		}	
		return null;
	}
	
	
	
	
}
