package sec02.exam01;

// class명에 Impl을 붙이면 제목만 보고 상속받은 것으로 안다.
public class KeyboardImpl implements Keyboard {

	@Override
	public String press(int keyCode) {
		
		if(keyCode == 13) {
			return "Enter";
		}
		
		return "뭔가 눌림";
	}

}
