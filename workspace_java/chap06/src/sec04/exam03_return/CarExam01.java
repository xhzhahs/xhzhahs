package sec04.exam03_return;

public class CarExam01 {

	public static void main(String[] args) {

		Car car = new Car();
		boolean status = car.isLeftGas();
		System.out.println("가스가 남았나? "+ status);
		
		car.gas = 3; // 아래와 같은 의미. 필드를 건드린 경우
		car.setGas(3);// 메소드를 이용해서 car가 갖고 있는 필드를 건드린 경우
		
		status = car.isLeftGas();
		System.out.println("가스가 남았나? "+ status);
		
		if(status) { 
//		if( car.isLeftGas() )	// status 대신  car.isLeftGas()를 넣어도 된다.
			System.out.println("출발~!");
			car.run();
		}
		
		Car2 c2 = new Car2();
		c2.setGas(5);
		c2.run();
		
		
		
		
		
		
	}

}
