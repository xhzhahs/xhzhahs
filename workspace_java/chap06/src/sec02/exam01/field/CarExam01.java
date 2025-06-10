package sec02.exam01.field;

public class CarExam01 {

	static int a =10; // static을 붙여줘야 함.
	
	public static void main(String[] args) {

		// 객체(클래스) 생성
		Car myCar = new Car();
		
		System.out.println(myCar.company); // myCar가 갖고 있는 것 중에서 company를 가져와라.
		myCar.company = "벤틀리";
		System.out.println(myCar.company);
		
		System.out.println(myCar.speed);
		myCar.speed = 150;
		System.out.println(myCar.speed);

		Car myCar2 = new Car();
		System.out.println(myCar2.company);
		
		System.out.println("a : "+ a);
		
		
	}

}
