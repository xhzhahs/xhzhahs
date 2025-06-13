package sec03.exam01.constructor;

public class Car {

	// 생성자(construct)
	// return 타입이 없다.
	// 메소드 이름은 클래스 이름과 동일하게 사용해야한다.
//	Car() { 
//		System.out.println("Car 생성자 실행");
//	}
	
	// 생성자를 생략한 경우(생성자가 하나도 없는 경우)
	// 기본 생성자가 자동 완성 된다.
//	Car(){
//		// 기본 생성자
//	}
	
	/** 
	 	생성자가 하나라도 선언되어 있으면
	 	기본 생성자는 만들어지지 않는다.
	 	
	 	기본 생성자 Car() {}를 선언하지 않고 
	 	Car(전달인자) {}를 선언 하면
	 	
	 	CarExam 파일에서 
	 	Car c = new Car();는 사용하지 못하고 
		Car c2 = new Car("검정"); 처럼 선언할 때마다 항상 전달인자를 넣어줘야 한다.
		
	**/
	
	String model = "아반떼";
	String color;
	int maxSpeed;
	CarExam carExam = new CarExam(); // 선언하면서 초기화. main이 아니어도 사용 가능
//	carExam = new CarExam(); 이건 main에서만 가능
	
	Car(){
		// 보통 생성자는 필드 값 초기화 하는데 많이 사용된다.
		color = "빨강";
		// if, for문 사용 가능
		// test();  생성자가 다른 메소드를 실행하는 것은 가능
		// 하지만 메소드가 생성자를 실행할 수 없다.
	}
	
	
	// 생성자 오버로딩
//	Car(String c){
//		color = c;
//	}
	
	Car(String c){
		// 다른 생성자를 호출하는 방법
		// 무조건 첫번째 줄에 위치해야 에러가 나지 않는다.
		// this는 메모리에 올라간 나를 실행한다는 의미. 즉 내 생성자를 실행해라.
		this("아반떼", c, 240); // this의 ()는 실행하라는 뜻
		// 전달인자가 없는 생성자는 this();로 호출
		
		color = c;
		model = "아반떼";
		maxSpeed = 240;
		
	}
	
	Car(String m, String c, int ms){
		model = m;
		color =c;
		maxSpeed = ms;
	}
	
	void test() {
		
	}
	
//	void setColor(String c) {
//		color = c;
//	}
	
//	void setColor(String c) {
//		String color; // 지역변수
//		color = "빨강";
//	}
	
	
	/**
	 	< this. 사용하는 경우>
	 	
	  	String color;
	  	
	  	void setColor(String color) {
		this.color = color;
	  	
	  	이렇게 필드 명과 지역변수 명이 같은 경우 
	  	this. 없이 적으면 지역변수(String color)로 인식하므로
	  	this.color로 적으면 필드의 color -> String color;에 접근한다.
	 
	 	지역변수와 필드가 겹치지 않는 경우는 this.은 생략 가능하다.
	 */
	
	
	void setColor(String color) {
//		color = "빨강" // 전달인자의 지역변수 color
//		this.color = "빨강";
		this.color = color; // this. 을 붙이면 필드의 color
//		this.test(); // 메소드는 this.를 붙일수 있지만 굳이 this를 붙일 필요가 없다.
	}
	
	
	
	
}
