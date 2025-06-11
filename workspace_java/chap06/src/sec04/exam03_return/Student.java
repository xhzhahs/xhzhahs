package sec04.exam03_return;

public class Student {

	String name;
	int age;
	
	
	// 방법 1
	// 이름값을 전달 받아서 필드에 저장하는 메소드
	// 메소드명: setName
	// 전달인자: String
	// 리턴타입: void
	
	void setName(String n) {
		name = n;
	} // return이 있는데 생략된 것이다.
	
	// 이름 필드의 값을 돌려주는 메소드
	// 메소드명: getName
	// 전달인자: 없음
	// 리턴타입: String
	
	String getName() {
		return name;
	}
	
	// 나이값을 전달 받아서 필드에 저장하는 메소드
	// 메소드명: setAge
	// 전달인자: int
	// 리턴타입: void
	
	void setAge(int a) {
		age = a;
	}
	
	// 이름 필드의 값을 돌려주는 메소드
	// 메소드명: getAge
	// 전달인자: 없음
	// 리턴타입: int
	int getAge() {
		return age;
	}
	
	// 방법 2
	// 이름과 나이를 받아서 저장
	// 메소드명: setInfo
	// 전달인자: String n, int a
	// 리턴타입: void

	void setInfo(String n, int a) {
		name = n;
		age = a;
	}
	
//	String[] getInfo() { // 배열 사용도 가능하긴 하다.
	String getInfo() {
//		return name;
//		return age; // return은 한개만 해준다. 그런데 타입도 달라서 안된다. 
		
		return name + "의 나이는 "+ age+ "세 입니다";
		// String으로 타입으로 return을 받는다.
		// 하지만 age는 int 타입이여서 사용하지 못한다.
		// ""를 age 앞에 쓰면서 age도 String 타입으로 읽히게 된다.
		// (name + age)는 String 타입과 int 타입으로 각각 읽힘
		// (name+ ""+ age)는 "" 으로 인해 모두 String 타입으로 읽힘
	}
	
	
	
	
	
}
