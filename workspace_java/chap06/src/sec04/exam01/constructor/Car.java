package sec04.exam01.constructor;

public class Car {

	// 생성자(construct)
	// return 타입이 없다.
	// 메소드 이름은 클래스 이름과 동일하게 사용해야한다.
	Car() { 
		System.out.println("Car 생성자 실행");
	}
	
	// 생성자를 생략한 경우(생성자가 하나도 없는 경우)
	// 기본 생성자가 자동 완성 된다.
//	Car(){
//		// 기본 생성자
//	}
	
	// 생성자가 하나라도 선언되어 있으면
	// 기본 생성자는 만들어지지 않는다.
	
}
