package sec05.exam05_final;

public class Person {

	
	final String nation = "Korea";
	final String ssn;
	String name;
	
	// final
	// 값이 할당된 경우 변경할 수 없게 막아줌
	// 생성자 전달인자로 받아서 할당하고 변경을 막을 때 사용

	Person(){
		// final의 값이 없던 경우
		// 생성자에서 딱 한번 할당할 수 있음
		this.ssn = "주민번호"; // final의 값이 없으므로 딱 한번 가능
		this.name = "이름"; // final이 붙지 않았으므로 자유롭게 변경가능
//		this.nation = "다른나라"; // final에 값이 있으므로 바뀌지 못하게 막혔음
		
		this.name = "이름2";
//		this.ssn = "주민번호2";
	}
	
	
	
	void test() {
//		this.ssn = "주민번호";
	}
	
}
