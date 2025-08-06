package sec02.exam01;

public class KeyboardExam {

	public static void main(String[] args) {

		KeyboardImpl k1 = new KeyboardImpl();
		
		// 그냥 Keyboard 타입으로 뉴해도 됨
		Keyboard k2 = (Keyboard) new KeyboardImpl();
		
		// 강제 형변환 하지 않아도 됨
		Keyboard k3 = new KeyboardImpl();
		
		System.out.println( k3.press(13) );
	
		
//		Keyboard k4 = new Keyboard(); // 추상이므로 new 불가

		/** 익명 구현 객체
			생성자를 가질 수 없다.
			활용하지 않고 잠깐만 쓸 경우 사용
			Keyboard를 new하는 것이 아닌 오버라이드 한 것을 new한 것
			new 다음에는 부모를 적는 것이다.
			{}안은 클래스인 것이다.
			new 부모() {}
			() {}를 new 한 것이다. --> 부모를 상속받은 클래스를 new 한 것이다.
		**/
		Keyboard k5 = new Keyboard() {
			@Override
			public String press(int keyCode) {
				if(keyCode == 13) {
					return "Enter";
				}
				return "뭔가 눌림";
			}
		};
	}

}
