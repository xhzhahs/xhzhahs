package sec04.exam06.overloding;

public class Calc {

	// 오버로딩은 리턴 타입과 관계없이
	// 메소드 이름이 같을 수 있다.
	// 쓰는 이유는 
	// 1. 사용자가 편하게 쓰기 위해서
	// 2. 전달인자가 많은데 항상 같은 값이 전달되어야 하는 경우에 전달인자 개수를 줄이려는 목적 
	int plus(int a, int b) {
		System.out.println("int int 실행");
		return a + b;
	}
	
	// 전달인자가 int, int로 같기 때문에 오버로딩 적용 불가능
//	int plus(int a, int b) {
//		return a + b;
//	}
	// 전달인자 개수는 같지만 타입이 앞 메소드와 다르기 때문에 오버로딩 적용 가능
	double plus(double a, double b) {
		System.out.println("double double 실행");
		return a + b;
	}
	// 전달인자 개수는 같지만 타입이 다르기 때문에 오버로딩 적용 가능
	double plus(int a, double b) {
		System.out.println("int double 실행");
		return a + b;
	}
	// int 타입과 전달인자 개수가 같기 때문에 오버로딩 불가능
//	int plus(int a, int b) {
//		System.out.println("int int 실행");
//		return a + b;
//	}
	// int 타입은 같지만 전달인자 개수가 다르므로 오버로딩 가능
	int plus(int x) {
		System.out.println("int 실행");
		return x;
	}
	/* return을 이러한 방법으로도 사용가능
	int plus(int x) {
		return x+x; 
	}
	
	int plus(int x) {
		return plus(x,x); 
	}
	
	int plus(int x) {
		int result = plus(x,x);
		return result; 
	}
	*/
	
	/**
	 * 
	 * 	만약 차를 출고 할 때
	 * 	필요한 것들을 필드에 넣어보자
	 * 
	 */
	String model;
	String color;
	int year;
	
	void setInfo(String m, String c, int y) {
		model = m;
		color = c;
		year = y;
	}
	
	// 만약 출고연도가 2025년도 동일하다면 굳이 전달인자에 연도를 넣지 않아도 된다.
	void setInfo(String m, String c) {
		model = m;
		color = c;
		year = 2025; // 2025년도로 고정되어 출력됨
	}
	
	// 이렇게도 사용 가능. 위와 같은 의미
	// void setInfo(String m, String c) {
	// 		setInfo(m, c, 2025);	
	// }
	
	// 만약 출고연도와 색상이 동일하다면
	void setInfo(String m) {
		
		 setInfo(m, "검정", 2025);
		 
	}
	
	
	Calc newCalc() {
		Calc c = new Calc();
		return c;
	}
	
	// 배열도 사용 가능
	Calc[] newCalcArray() {
		Calc[] a = new Calc[10];
		return a;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
