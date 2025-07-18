package sec02.exam01.driver;

public class Driver {

	void driveTico(Tico tico) {
		System.out.println("오직 티코만!");
		tico.run();
		tico.autoRun();
	}
	
	void drive(Car car) {
		System.out.println("손님, 출발하겠습니다.");
		car.start();
		car.run();
		
		if( car instanceof Tico ) {
			System.out.println("어 이거 티코네요");
			Tico tico = (Tico) car;
			tico.autoRun();
//			((Tico) car).autoRun();	// 이렇게도 사용 가능
		}
		
		car.stop();
		
//		car.autoRun();	// Car에는 autoRun이 없다.
	}
	
	
}
